package bitcamp.java100;

import java.io.Console;

public class Test21_8_2{

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
			
		String[] names = new String[3];
		String[] emails = new String[3];
		String[] tels = new String[3];
		
		//값이 저장될 위치
		int cursor = 0;
		
		while(cursor < names.length) {
		names[cursor] = console.readLine("이름 ? : ");
		emails[cursor] = console.readLine("이메일 ? : ");
		tels[cursor] = console.readLine("전화 ? : ");
		cursor++;
		}
		
		cursor = 0;
		while(cursor < names.length) {
		System.out.println(names[cursor]);
		System.out.println(emails[cursor]);
		System.out.println(tels[cursor]);
		cursor++;
		}
	}
}
//java -cp ./bin bitcamp.java100.Test21_8