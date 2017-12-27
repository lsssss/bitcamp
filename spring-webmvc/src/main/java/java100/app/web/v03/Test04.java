// 요청 핸들러의 리턴 값 - 콘텐츠를 바로 리턴하기 
// => 프론트 컨트롤러에게 리턴할 수 있는 값의 타입
//    - HttpEntity<B>/ResponseEntity<B>, String, View, Map/Model, ModelAndView,
//      void, Object
//
package java100.app.web.v03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v03/test04")
public class Test04 {
    
    @RequestMapping(value="/m1")
    public Object m1() {
        return new Member("홍길동", 20, true);
    }
    
    
    @RequestMapping(value="/m2", produces="text/plain;Charset=UTF-8")
    public Object m2() {
        return "hello안녕";
    }
    
}










