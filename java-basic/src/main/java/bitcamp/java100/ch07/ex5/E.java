package bitcamp.java100.ch07.ex5;

public class E extends A {
    String name;
    int age;
    
    E() {
        this("홍길동", 20);
        System.out.println("빈생성자");
    }
    
    E(int age) {
        this("홍길동", age);
        System.out.println("정수생성자");
    }
    
    E(String name) {
        // 생성자의 첫 번째 문장으로 다음 둘 중 하나만 와야 한다.
        // - 수퍼 클래스의 생성자를 호출하는 문장
        // - 같은 클래스에 있는 다른 생성자를 호출하는 문장
        this("홍", 20);
        System.out.println("문자열 생성자");
    }
    
    E(String name, int age) {
    	
        super();
        System.out.println("정수+스트링 생성자");
        this.name = name;
        this.age = age;
    }
}
