// ## 문장(Statement) - 블록과 변수의 범위
// - 블록이란? 여러 명령어를 묶는 문법이다.
// - 블록의 종류? 일반 블록, 메서드, 클래스, 인스턴스 블록, 스태틱 블록
// - 블록을 만드는 방법과 변수의 사용범위를 알아보자!
//

package bitcamp.practice100.practice1012;

public class Practice1012_1 {

	public static void main(String[] args) {

		boolean t = true;
		System.out.println(t);

		System.out.println("=============================================");
		char ch = 'A';
		int code = (int) ch;
		char ch2 = (char) 65;
		System.out.println(ch);
		System.out.println(code);
		System.out.println(ch2);
		System.out.println("=============================================");

		int apple = 123;
		int bucket = 10;
		int numbucket = (apple % bucket == 0) ? apple / bucket : apple / bucket + 1;
		System.out.println(numbucket);

		String numm = (apple == 0) ? "0" : (apple > 0) ? "양수" : "음수";
		System.out.println(numm);

		int num2 = 1234;
		int numcut = (num2 / 100) * 100;
		System.out.println(numcut);

		int num3 = 13213;
		System.out.println((num3 / 10) * 10 + 1);
		System.out.println((((num3 / 10) * 10) + 10) - num3);

		int far = 100;
		float cel = (((float) 5 / 9) * ((float) far - 32));

		System.out.println(far);
		System.out.println(cel);
		System.out.println("=============================================");

		for (int i = 0; i < 4; i++) {
			char ranch = (char) (Math.random() * 26 + 'A');
			System.out.print(ranch);
		}
		System.out.println();

		int k = 2;

		while (k <= 9) {
			int k2 = 1;
			while (k2 <= 9) {
				System.out.println(k + "*" + k2 + "=" + k * k2);
				k2++;
			}
			k++;

		}
		System.out.println("=============================================");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");

		int i = 0;
		while (i <= 10) {
			i++;
			int j = 0;
			while (j < i) {
				System.out.print("*");
				j++;
			}

			System.out.println();
		}

		System.out.println("=============================================");
		for (i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i + j == 6) {
					int sum = i + j;
					System.out.println(i + "+" + j + "=" + sum);
				}

			}
		}

		System.out.println("===========================================");

		int value = (int) (Math.random() * 6) + 1;
		System.out.println(value);

		// 방정식
		for (i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if ((i * 2) + (4 * j) == 10) {
					System.out.println("x=" + i + "," + "y=" + j);
				}
			}
		}

		System.out.println("=============================================");
		String str = "12345";
		int sum = 0;

		for (i = 0; i < str.length(); i++) {
			sum+=str.charAt(i)-48;
		}
		System.out.println(sum);
		System.out.println("=============================================");
		
		int num1 = 1;
		int num11 = 1;
		int num111 = 0;
		
			System.out.print(num1+" , "+num11);
			
		for(i = 0; i < 8 ; i++) {
			
			num111 = num1+num11;
			System.out.print(" , "+num111);
			num1 = num11;
			num11= num111;
		}
		System.out.println();

			// char c1 = str.charAt(0);
			// char c2 = str.charAt(1);
			// char c3 = str.charAt(2);
			// char c4 = str.charAt(3);
			// char c5 = str.charAt(4);
			//

			System.out.println("=============================================");

		System.out.println("=============================================");

		System.out.println("=============================================");
	}
}
