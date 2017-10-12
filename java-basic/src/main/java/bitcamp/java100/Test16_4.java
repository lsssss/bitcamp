package bitcamp.java100;

public class Test16_4 {

	public static void main(String[] args) {

		int i = 0;

		while (i < 5)
			System.out.println(++i);

		System.out.println("-------------------");

		// 여러개의 문장을 반복하기
		// - 블록을 사용하여 실행할 문장을 묶는다
		i = 0;
		while (i < 5) {
			System.out.print("=> ");
			System.out.println(i);
			i++;
		}
		System.out.println("-------------------");

		// => while문의 중첩

		i = 1;
		while (i <= 5) {
			int count = 1;
			while (count <= i) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			i++;

		}
		System.out.println("---------------------------");
		i = 0;

		while (i < 5) {
			int count = 5;
			while (count > i) {
				System.out.print("*");
				count--;
			}
			System.out.println();
			i++;

		}

		System.out.println("---------------------------");
		i = 1;

		while (i <= 5) {
			int count = 5-i;
			while (count > 0) {
				System.out.print(" ");
				count--;
			}
			
			count =1;
			while (count <= i) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			i++;

		}
		
		
		System.out.println("---------------------------");
		i = 5;

		while (i > 5) {
			
			int count = (5-i)/2;
			while (count >=5) {
				System.out.print(" ");
				count--;
			}
			
			count =1;
			while (count <= i) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			i-=2;

		}
	}
}