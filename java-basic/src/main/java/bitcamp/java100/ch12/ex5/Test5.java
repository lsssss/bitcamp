// 인터페이스에서 다중 구현이 불가능한 경우
package bitcamp.java100.ch12.ex5;

public class Test5  {
	
	//public class Test5 implements A, E {
    // 두 인터페이스 중에서 어떤 인터페이스의 메서드를 구현하느냐 따라
    // 동작이 완전히 달라지기 때문에
    // 결코 이런 문법을 허용하지 않는다.
    // 컴파일 오류이다!
    
  //  public void m1() {} // A의 m1()을 구현할 건가?
    
  //  public String m1() {} // E의 m1()을 구현할 건가?
    
    // 둘 다 구현하면 안되나요?
    // => 헐... 오버로딩 규칙에 어긋난다!
    // => 메서드를 호출할 때 두 메서드를 구분할 수 없다.
    // => 파라미터의 타입이나 개수가 다른 경우에는 그것으로
    //    구분할 수 있지만, 리턴 타입이 다른 경우에는 불가능하다!
}
