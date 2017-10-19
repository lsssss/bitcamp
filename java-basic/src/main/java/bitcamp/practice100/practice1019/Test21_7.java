// ## 키보드로부터 입력 받기 - 연습3
// - 다음과 같이 사용자로부터 문자(숫자와 알파벳)를 입력 받아 꺼꾸로 변경하시오!
// - 실행 예) 
// 문자열? AB2CTT980
// 입력한 값: AB2CTT980
// 꺼꾸로 바꾼 값: 089TTC2BA
// > 

package bitcamp.practice100.practice1019;

import java.io.Console;

public class Test21_7 {

    public static void main(String[] args) {
        // 콘솔 객체를 준비한다.
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        System.out.print(" 문자를 반대로 출력합니다 문자를 입력하세요 : ");
        String s = console.readLine();
        for(int i = s.length() -1 ; i >=0 ;i-- ) {
        	System.out.print(s.charAt(i));
        }
        
        
    }
}











