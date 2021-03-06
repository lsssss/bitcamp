// 스태틱 멤버 - 클래스 로딩과 클래스 변수
package bitcamp.java100.ch06.ex3;

public class Test1 {
    public static void main(String[] args) {
        
        System.console().readLine("계속 실행하려면 엔터를 치세요!");
        
        // 스태틱 변수 사용
        // 예) 클래스명.변수명  = 값;
        System.out.println(MyClass.v1); // <== 이 때 MyClass.class 파일이 메모리에 로딩된다.
        
        MyClass.v1 += 200; 
        // <== 이미 MyClass는 메모리에 로딩되었기 때문에 다시 로딩되지 않는다.
        
        System.console().readLine("계속 실행하려면 엔터를 치세요!");
        
        System.out.println(MyClass.v1);
        
    }
}

// 클래스 로딩
// => .class 파일을 외부 저장장치에서 
//    JVM이 관리하는 메모리 영역(Method Area라 부른다)으로 
//    복사하는 것을 말한다.
//
// 로딩?
// => "메모장", "포토샵", "크롬 브라우저" 같은 프로그램을 실행하려면,
//    먼저 그 프로그램 명령이 들어 있는 파일을 메모리에 로딩해야 한다.
//    그래야 그 프로그램을 실행할 수 있다.
// => 그리고 그 프로그램에서 파일을 편집하거나 보거나 플레이하려면,
//    그 데이터 파일조차 메모리에 로딩해야 한다.
//
// 내부기억장치(RAM)가 부족할 때?
// => 현재 메모리에 로딩된 데이터 중에서 당장 사용하지 않는 데이터는
//    다시 외부저장장치(예:HDD)의 특정 폴더에 임시 보관해 둔다.
// => 이렇게 해서 메모리 공간을 확보한 다음에 실행할 파일이나 읽을 파일을 
//    메모리에 로딩한다.
// => 메모리에 로딩된 데이터를 잠시 외부저장장치에 보관하기 위해 만든 폴더를
//    "캐시메모리"라 부른다.
//    즉 HDD의 일부 공간을 RAM의 데이터를 임시 보관하는 용도로 사용하는 것이다.
//
// 클래스 로딩 절차
// 0) JRE의 라이브러리 폴더에서 클래스를 찾는다.
// 1) CLASSPATH 환경 변수에 지정된 폴더에서 클래스를 찾는다.
//    => 만약 찾지 못한다면 ClassNotFoundException 예외가 발생한다.
// 2) 찾은 .class 파일이 유효한지 검사한다.
// 3) "Method Area"라는 메모리 영역에 클래스 파일을 로딩한다.
// 4) "Method Area" 영력에 스태틱 변수를 만든다.
// 5) 스태틱 블록이 있으면 실행한다.



/// Method Area = 클래스변수
/// stack = 지역변수
/// heap = 인스턴스 변수




