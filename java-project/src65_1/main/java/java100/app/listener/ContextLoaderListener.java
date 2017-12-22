package java100.app.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java100.app.annotation.RequestMappingHandlerMapping;
import java100.app.util.DataSource;


public class ContextLoaderListener implements  ServletContextListener{
    
    public static AnnotationConfigApplicationContext iocContainer;
    public static RequestMappingHandlerMapping handlermapping;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextLoaderListner 실행");
        
        ServletContext webApplicationInfo = sce.getServletContext();
        String configClassName = webApplicationInfo.getInitParameter("contextConfigLocation");
        
        
        try {
            
            // 클래스 이름으로 클래스 정보를 다루는 객체를 얻는다.
            Class<?> configClass = Class.forName(configClassName);
            // 웹 애플리케이션이 시작될 때 
            // AppConfig 클래스에 설정된 대로
            // Spring IoC 컨테이너를 준비한다.
            iocContainer = new AnnotationConfigApplicationContext(configClass);
            
            handlermapping = new RequestMappingHandlerMapping(iocContainer);
            
            RequestMappingHandlerMapping mapping = new RequestMappingHandlerMapping(iocContainer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        DataSource ds = iocContainer.getBean(DataSource.class);
        ds.close();
    }
    
    
    
}
