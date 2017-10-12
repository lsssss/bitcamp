package bitcamp.java100;

public class Test16_5{

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------------");

		for (int i = 5; i >= 1; i--) {

			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 6 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------------");

		for (int i = 6; i >= 1; i--) {

			for (int j = 0; j < 6-i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		for (int i = 2 ; i <=9 ; i++) {
				for(int k=1 ; k <=9 ; k++) {
					System.out.printf("%d"+"*"+"%d"+"="+"%d\n",i,k,i*k);
				}
				System.out.println();
		}
		
	System.out.println("------------------------------");
		
		for (int i = 1 ; i <=9 ; i++) {
				for(int k=2 ; k <=9 ; k++) {
					System.out.printf("%d"+"*"+"%d"+"="+"%2d"+" ",k,i,i*k);
				}
				System.out.println();
		}
		
	}
}


//## 문장(Statement) - 조건문 if
//- 조건문의 용도와 if 문 사용법을 알아보자!
//



// *****
// ****
// ***
// **
// *
