// ## 키보드로부터 입력 받기 - 연습4
// - 다음과 같이 사용자로부터 이름, 이메일, 전화를 입력받아 출력하시오!
// - 실행 예) 
// 이름? 홍길동
// 이메일? hong@test.com
// 전화? 1111-1111
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 임꺽정
// 이메일? leem@test.com
// 전화? 1111-1112
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 유관순
// 이메일? yoo@test.com
// 전화? 1111-1113
// 저장하시겠습니까?(y/n) n
// 저장 취소하였습니다.
// 계속입력하시겠습니까?(y/n) y
// 이름? 안중근
// 이메일? ahn@test.com
// 전화? 1111-1114
// 저장하시겠습니까?(y/n) y
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n) n
// ------------------------------
// 홍길동     hong@test.com 1111-1111
// 임꺽정     leem@test.com 1111-1112
// 안중근      ahn@test.com 1111-1114
// > 

package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;

import bitcamp.practice100.practice1016.Score;

public class Test21_8 {
	
	static class prof{
		String name; 
		String email;
		String phonenum;
		
		static void init(prof f,Console con) {
			
			
		}
		
	
			
		
	}
	
    public static void main(String[] args) {
        // 콘솔 객체를 준비한다.
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        
        prof[] pf;
        
        String name;
        String email;
        String phonenum;
        String yn = "y";
        String save;
        
        int i = 1;
        while(true) {
        	yn = console.readLine("입력 하시겠습니까? ex)y or n :");
        	
        	if(yn == "y") {
        		
        	name = console.readLine("이름?(예: 홍길동) ");
        	email = console.readLine("이름?(예: 홍길동) ");
        	phonenum = console.readLine("이름?(예: 홍길동) ");
        	
        	save = console.readLine("저장 하시겠습니까 ? ex) y or n : ");	
        	if(save == "y") {
        		pf[i] = new prof[2];
        		
        	}
        	
        	}else if(yn == "n"){
        		
        	}else;
        	
        }
        
        
        
        
        
        
    }
}
	










