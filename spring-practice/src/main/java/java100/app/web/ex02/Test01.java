package java100.app.web.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test01 {

    
        @RequestMapping("/ex02/test01")
        public String m() {
            
            return "/hello.jsp;";
        }
    
}
