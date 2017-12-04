// Spring IoC(Inversion of Control) 컨테이너 - 셋터 호출
// 
package bitcamp.java100.ch20.ex11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch20/ex11/application-context1.xml");
        Car car = (Car) appCtx.getBean("c1");
        System.out.println(car);
        
        
        String[] names = appCtx.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name);
        }
        
    }
}








