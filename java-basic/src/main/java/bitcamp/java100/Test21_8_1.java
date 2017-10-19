package bitcamp.java100;

import java.io.Console;

public class Test21_8_1{

	static Console console;
	
		static void prepareConsole(){
			if (console == null) {
				System.err.println("콘솔을 지원하지 않습니다.");
				System.exit(1);
			}

		}
	public static void main(String[] args) {
			
		Console console = System.console();
		
			if (console == null) {
				System.err.println("콘솔을 지원하지 않습니다.");
				System.exit(1);
			}
			
		
		
		String name = console.readLine("이름 ? : ");
		String email = console.readLine("이메일 ? : ");
		String tel = console.readLine("전화 ? : ");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(tel);
		
	}
}
//java -cp ./bin bitcamp.java100.Test21_8