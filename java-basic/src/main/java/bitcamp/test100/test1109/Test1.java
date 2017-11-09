package bitcamp.test100.test1109;

import java.io.Console;

public class Test1 {

	public static void main(String[] args) {
	
	 Console console = System.console();
	 
	 if(console == null) {
		 System.out.println("콘솔지원 x");
		 System.exit(-1);
	 }
     
	 
	 try {
     int a = Integer.parseInt(console.readLine("a? "));
     String op = console.readLine("연산자? ");
     int b = Integer.parseInt(console.readLine("b? "));
     
     switch (op) {
     case "+": System.out.printf("결과=%d\n", a + b); break;
     case "-": System.out.printf("결과=%d\n", a - b); break;
     case "*": System.out.printf("결과=%d\n", a * b); break;
     case "/": System.out.printf("결과=%d\n", a / b); break;
     case "%": System.out.printf("결과=%d\n", a % b); break;
     default: System.out.println("지원하지 않는 연산자입니다.");
     }
	 }
     catch(Throwable e) {
    	 System.out.println("정수만 입력해라");
     }
	}
}
     
    
	
