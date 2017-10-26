// 상속 - 수퍼 클래스의 생성자 호출
// => 모든 생성자는 첫 번째 문장으로 수퍼 클래스의 생성자를 호출해야 한다.
// => 또는 같은 클래스의 다른 생성자를 호출해야 한다.
package bitcamp.java100.ch07.ex5;

public class Test1 {

    public static void main(String[] args) {
        // B 클래스의 인스턴스 생성 과정
        // 1) B 클래스의 인스턴스 메모리 준비
        //    => 인스턴스 변수가 없더라도, Object 클래스의 인스턴스 변수가 있기 때문에
        //       최소한의 인스턴스 메모리가 준비된다.
        // 2) B 클래스의 생성자 호출
        //    => A 클래스의 생성자 호출
        //       => Object 클래스의 생성자 호출
        //       => A 클래스의 생성자에 있는 문장 실행
        //    => B 클래스의 생성자에 있는 문장 실행
        new B();
        
      
        
        // 이렇게 수퍼 클래스의 생성자를 체인 형식으로 호출하는 이유?
        // => 인스턴스 초기화 때문에!
        
    }

}







