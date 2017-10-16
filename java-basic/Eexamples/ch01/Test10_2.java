// # 자바 기본 콘솔창으로 출력 하기
package bitcamp.java100;

public class Test10_2{

    public static void main(String[] args){
        // 자바에서 프로그래밍 할 때 도구를 사용하는 방법
        // 1) 도구함.기능명
        // 2) 도구함.객체명.기능명
        // 3) 객체명.기능명


    //  System => 도구함 or 클래스라고 부른다.
    //  out=> 객체(object)/실체(instance)/도구
    //  println => 기능
    // "Hello" => 매개변수(parameter). 기능을 수행하기 위해 전달하는 조건or값.
        System.out.println("Hello");
    
    // 도구함에 있는 기능 바로 이용하기
    //  -어떤 기능은 인스턴스가 있어여만 사용가능 하다
    //  - 어떤 기능은 클래스만 있으면 사용 가능하다.
    Long currMillis = System.currentTimeMillis();
    System.out.println(currMillis);
}

//>gradlew compilejava
    //>set CLASSPATH=.\build\classes\java\main
    //>java bitcamp.java.100.Test10
    //>java -cp .\build\classes\java\main bitcamp.java100.Test10

}

