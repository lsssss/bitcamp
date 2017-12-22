//: ## ver 49
//: - Servlet 기술을 도입하여 서블릿 컨테이너에서 실행시킨다.
//: - 학습목표
//:   - 웹 애플리케이션을 만들고 배포하고 실행하는 기본 과정을 이해한다.
//:   
package java100.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

@Configuration 
@ComponentScan("java100.app") 
public class AppConfig {

    

    // 스프링 IoC 컨테이너에게 getDataSource() 메서드를 호출해서
    // 이 메서드가 리턴한 객체를 꼭 컨테이너에 보관해달고 표시!
    @Bean 
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        return ds;
    }
   
}















