package java100.app.annotation;

import static org.reflections.ReflectionUtils.getMethods;
import static org.reflections.ReflectionUtils.withAnnotation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

public class RequestMappingHandlerMapping {
    
    Map<String,RequestHandler> handlerMap = new HashMap<>();
    
    public static class RequestHandler{
       public Object instance;
       public Method method;
        
        public RequestHandler(Object instance, Method method) {
            this.instance = instance;
            this.method = method;
        }
    }
    
    public RequestMappingHandlerMapping(ApplicationContext iocContainer) {
        
        String[] controllerNames = iocContainer.getBeanNamesForAnnotation(Controller.class);
        
        for(String controllerName : controllerNames) {
            Object controller = iocContainer.getBean(controllerName);
            
        @SuppressWarnings("unchecked")
        Set<Method> methods = getMethods(controller.getClass(), withAnnotation(RequestMapping.class));
           
           for(Method m : methods) {
              RequestMapping anno = m.getAnnotation(RequestMapping.class);
              RequestHandler handler = new RequestHandler(controller, m);
              
              handlerMap.put(anno.value(), handler);
           }
        }
    }
    
    public RequestHandler getRequestHandler(String name) {
        return handlerMap.get(name);
    }
}
