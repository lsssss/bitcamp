// 인터페이스에서 다중 상속이 불가능한 경우
package bitcamp.java100.ch12.ex5;

public interface Test4 extends A {
	
	//public interface Test4 extends A, E {
    // 이 인터페이스는 컴파일 오류이다!
    // 왜?
    // A의 m1()을 상속 받게 되면 리턴 타입이 void가 되고,
    // E의 m1()을 상속 받게 된면 리턴 타입이 String이 된다.
    // 
    // 두 인터페이스 중에서 어떤 인터페이스의 메서드를 상속 받느냐에 따라
    // 동작이 완전히 달라지기 때문에
    // 결코 이런 문법을 허용하지 않는다.
}
