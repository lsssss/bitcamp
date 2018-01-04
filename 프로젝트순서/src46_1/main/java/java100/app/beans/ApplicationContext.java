package java100.app.beans;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import java100.app.annotation.Component;

public class ApplicationContext {

	String baseDir;
	int startIndexOfPackageName;

	HashMap<String, Object> pool = new HashMap<>();

	public ApplicationContext() {
	}

//	public static void main(String[] args) {
//		new ApplicationContext(".\\bin");
//	}

	public ApplicationContext(String classpath) {

		File dir = new File(classpath);
		if (!dir.isDirectory())
			return;


		try {

			ArrayList<String> classnames = new ArrayList<>();
			this.baseDir = dir.getCanonicalPath();
			this.startIndexOfPackageName = baseDir.length() + 1;
			this.findClassFile(classnames, dir);

			for (String classname : classnames) {
				Class<?> clazz = Class.forName(classname);

				
				Component compAnno = clazz.getAnnotation(Component.class);
				if(compAnno == null) continue;
				
				Object obj = clazz.newInstance();

				if(compAnno.value().length() == 0) {
					pool.put(clazz.getName(), obj);
				}else {
					pool.put(compAnno.value(), obj);
				}
				
			}

			injectDependency();
		} catch (Exception e) {
			throw new BeansException("프로퍼티 파일 로딩중 오류 발생", e);
		}

	}

	private void findClassFile(List<String> classnames, File dir) throws Exception {

		File[] files = dir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				if (pathname.isFile() && !pathname.getName().endsWith(".class"))
					return false;
				return true;
			}
		});
		for (File f : files) {
			if (f.isDirectory()) {
				findClassFile(classnames, f);
			} else {
				classnames.add(f.getCanonicalPath().substring(this.startIndexOfPackageName).replaceAll("/", ".")
						.replaceAll("\\\\", ".").replaceAll(".class", ""));
			}
		}
	}

	public Object getBean(String name) {
		Object bean = pool.get(name);
		if (bean == null)
			throw new BeansException("빈을 찾을 수 없습니다.");
		return bean;
	}

	public void addBean(String name, Object bean) {
		pool.put(name, bean);
	}

	public String[] getBeanDefinitionNames() {

		Set<String> keySet = pool.keySet();
		String[] names = new String[keySet.size()];
		keySet.toArray(names);
		return names;
	}

	public void injectDependency() {
		// 1) pool에 저장된 객체를 꺼낸다.
		Collection<Object> objs = pool.values();

		for (Object obj : objs) {
			invokeSetter(obj);
		}
	}

	private void invokeSetter(Object obj) {

		Method[] methods = obj.getClass().getDeclaredMethods();

		for (Method m : methods) {
			if (!m.getName().startsWith("set"))
				continue;

			Object dependency = findObject(getFirstParameterType(m));

			if (dependency == null)
				continue;

			try {
				m.invoke(obj, dependency);
			} catch (Exception e) {
				throw new BeansException(obj.getClass().getName() + "클래스의 " + m.getName() + "메서드 호출 오류");
			}

		}
	}

	private Class<?> getFirstParameterType(Method m) {
		return m.getParameterTypes()[0];
	}

	private Object findObject(Class<?> type) {

		Collection<Object> objs = pool.values();

		for (Object obj : objs) {
			if (type.isInstance(obj)) {
				return obj;
			}
		}
		return null;
	}

	public void refreshBeanFactory() {
		injectDependency();
	}
}
