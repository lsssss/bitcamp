package java100.app.beans;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class ApplicationContext {

	HashMap<String, Object> pool = new HashMap<>();

	public ApplicationContext() {}

	public ApplicationContext(String propPath) {
		Properties props = new Properties();

		
		try (FileReader in = new FileReader(propPath)) {
			props.load(in);
			
			Set<Object> keySet = props.keySet();
			for (Object key : keySet) {
				String name = (String) key;
				Class<?> clazz = Class.forName(props.getProperty(name));
				Object obj = clazz.newInstance();

				pool.put(name, obj);
			}

			injectDependency();
		} catch (Exception e) {
			throw new BeansException("프로퍼티 파일 로딩중 오류 발생", e);
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
			if (!m.getName().startsWith("set")) continue;
			
			Object dependency =findObject(getFirstParameterType(m));
			
			if(dependency == null) continue;
			
			try {
				m.invoke(obj, dependency);
			}catch (Exception e) {
				throw new BeansException(obj.getClass().getName() +  "클래스의 " + m.getName() + "메서드 호출 오류");
			}

		}
	}
	
	private Class<?> getFirstParameterType(Method m){
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
