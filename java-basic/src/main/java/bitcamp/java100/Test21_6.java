// ## 키보드로부터 입력 받기 - 연습2
// - 다음과 같이 사용자로부터 숫자를 입력 받아 각 숫자의 개수를 세시오.
// - 실행 예) 
// 숫자? 23347651
// 0 = 0
// 1 = 1
// 2 = 1
// 3 = 2
// 4 = 1
// 5 = 1
// 6 = 1
// 7 = 1
// 8 = 0
// 9 = 0
// > 

package bitcamp.java100;

import java.io.Console;


public class Test21_6 {

	public static void main(String[] args) {
		// 콘솔 객체를 준비한다.
		Console console = System.console();

		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
			System.exit(1); // JVM을 종료한다.
		}
		
		String s3 = console.readLine("갯수를 구하고 싶은 정수or문자를 입력하세요 ex): 1,2,3,4,a,b,c ");
		String[] s4 = s3.split(",");
		System.out.println("정수를 입력하세요 : ");
		String s = console.readLine();
		String[] s2 = s.split("");
		
		//String[] s3 = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		// for(int k = 0 ; k < s.length() ; k++) {
		// System.out.println(s2[k]);
		// }

		for (int i = 0; i < s4.length; i++) {
			int cnt = 0;
			for (int j = 0; j < s2.length; j++) {
				if (s4[i].compareTo(s2[j]) == 0) {
					cnt += 1;
				} else
					;
			}
			System.out.printf("%s = %d\n", s4[i], cnt);
		}

		System.out.print("정수 입력 : ");
		long kk = Long.parseLong(console.readLine());

		int[] cnt = new int[10];

		while (kk > 0) {
			cnt[(int)(kk % 10)]++;
			kk /= 10;
		}

		int x = 0;
		while (x < cnt.length) {
			System.out.printf("%d = %d\n", x, cnt[x]);
			x++;
		}
		

	}
}
	//
	// while (i > 0) {
	// cnt[i % 10]++;
	// i /= 10;
	// }
	//
	// int x = 0;
	// while (x < cnt.length) {
	// System.out.printf("%d = %d\n", x, cnt[x]);
	// x++;
	// }


