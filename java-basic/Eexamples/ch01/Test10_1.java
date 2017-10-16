// #자바 소스 기본 구조
//

// 1) 클래스가 소속된 패키지를 선언한다.
// package 패키지명;
package bitcamp.java100;


// 2) 클래스를 선언한다.
// public class 클래스명 {}
public class Test10_1{

    // 3) 클래스를 실행할때 가장 먼저 실헹되는 블록을 선언한다.
    // 이 브록이 없으면 클래스를 실행할 수 없다.
    public static void main(String[] args){
        System.out.println("Hello");
    }

    //>gradlew compilejava
    //>set CLASSPATH=.\build\classes\java\main
    //>java bitcamp.java.100.Test10
    //>java -cp .\build\classes\java\main bitcamp.java100.Test10

}

