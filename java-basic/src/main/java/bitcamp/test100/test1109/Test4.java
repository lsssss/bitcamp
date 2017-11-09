package bitcamp.test100.test1109;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner Keyscan =new Scanner(System.in);
		System.out.print("입력 > :  ");
		String str = Keyscan.nextLine().toLowerCase();
		
			try {
				System.err.println("try블록 실행");
				
				if(str.equals("y")) {
					System.out.println("예외 발생");
					throw new Exception("예외 발생했다 이놈들아");
				}
			}catch(Exception e) {
				System.out.println("catch 시작");
				System.err.println(e);
			}
		
	}
	
}
