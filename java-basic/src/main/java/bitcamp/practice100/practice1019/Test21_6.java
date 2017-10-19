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
		String s = console.readLine("갯수를 구하고 싶은 정수 or 문자 입력 :");
		String[] s2 = s.split(",");
		String s3 = console.readLine("정수를 입력 하세요 : ");
		String[] s4 = s.split("");

		// String[] s3 = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < s2.length; i++) {
			int cnt = 0;
			for (int j = 0; j < s4.length; j++) {
				if(s2[i].compareTo(s4[j])==0) {
					cnt+=1;
				}else;
			}
			System.out.printf("%s = %d\n",s4[i], cnt);
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
