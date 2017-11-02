package bitcamp.practice100.practice1019;

import java.io.Console;

public class Test21_6 {

	public static void main(String[] args) {
		// 콘솔 객체를 준비한다.
		Console console = System.console();

		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
			System.exit(1); // JVM을 종료한다.
		}
		
		String st1 = console.readLine("문자열 or 숫자 입력하세요 ex) a,b,c,1,2,3,... : ");
		String[] star1 = st1.split(",");
		String st2 = console.readLine("정수를 입력하세요 : ");
		String[] star2 = st2.split("");
		
		for(int i = 0 ; i < star1.length ; i ++) {
			int cnt = 0;
			for(int j = 0 ; j < star2.length ; j++) {
				if(star1[i].compareTo(star2[j])== 0 ) {
					cnt += 1;
				}else ;
				
			}
			System.out.printf("%s = %d\n" , star1[i], cnt);
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
