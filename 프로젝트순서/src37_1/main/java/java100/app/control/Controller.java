package java100.app.control;

import java.io.PrintStream;

// 이 규칙은 App 클래스가 컨트롤러 객체를 사용하기 위해 
// 호출하는 메서드를 선언한 것이다.
//
public interface Controller {
	void execute(Request request, Response response);
	default void init() {}
	default void destroy() {}
}
