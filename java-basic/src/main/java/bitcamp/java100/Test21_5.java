// ## 키보드로부터 입력 받기 - 연습1
// - 다음과 같이 사용자로부터 구구단 번호를 입력 받아 출력하라!
// - 실행 예) 
// 구구단? 2
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// ...
// 2 * 9 = 18
// --------------------------
// 구구단? 10
// 2에서 9단까지만 가능합니다!
// 구구단? 1
// 2에서 9단까지만 가능합니다!
// 구구단? 0    <===== 0이하의 수를 입력하면 종료하라!
// 다음에 또 봐요!
// > 

package bitcamp.java100;

import java.io.Console;

public class Test21_5 {

	public static void main(String[] args) {

		class Student2 {
			int dan;
		}
		Console console = System.console();
		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
			System.exit(1);
		}

		Student2 s = new Student2();

		while (true) {
			s.dan = Integer.parseInt(console.readLine("구구단 ? : "));
			if (s.dan == 1 || s.dan >= 10) {
				System.out.println("2~9단만 입력 하세요");
			} else if (s.dan <= 0) {
				System.out.println("종료 합니다");
				break;
			} else {
				for (int i = 1; i <= 9; i++) {
					int gop = i * s.dan;
					System.out.printf("%d*%d = %d\n", s.dan, i, gop);
				}
			}
		}
	}
}

// Scanner sc = new Scanner(System.in);
// System.out.println("이름을 입력 : ");
// name = sc.nextLine();
// System.out.println(name);
// System.out.println("나이 입력 : ");
// age = sc.nextInt();
// System.out.println(age);
// System.out.println("구직 입력 true or false: ");
// working = sc.nextBoolean();
// System.out.println(working);
// System.out.println("학점 입력 : ");
// gpa = sc.nextFloat();
// System.out.println(gpa);
//
// System.out.println("이름을 입력 : ");
// System.out.println(name = sc.nextLine());

// Scanner sc = new Scanner(System.in);
// System.out.println("단수를 입력하세요 : ");
// int j = sc.nextInt();
//
//
// for(int i = 1 ; i <= 9; i++) {
//
// int s = i*j;
//
// System.out.printf("%d*%d=%d\n",j,i,s);
//
// }
