// ##메서드  reference 리턴
// - 로컬 변수의 생명주기와 객체의 생명주기에 대해 알아보자!
//

package bitcamp.java100;

public class Test17_15 {

	// ### 로컬 변수의 생명주기
	// - 메서드 호출할 떄 생성되어서 메서드 호출이 끝나면 제거 된다.
	// - 로컬 변수를 리턴한다는 것은 로컬 변수의 값을 리터한다는 의미다.
	// - 로컬 변수의 메모리 주소를 리턴할 수 없다

	static int m1() {
		int a = 100;
		int b = 200;
		int c = a + b;
		return c; // 로컬 변수의 c의 값을 리턴한다.
	}

	// ### 메서드에서 만든 q배열 리턴하기
	// - new 연산자를 통해 만든 배열은 heap 영역에 존재하기 때문에
	// 메서드 호출 끝나더라도 heap에 유지된다.
	static int[] m2() {
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		return arr; // 뱌열의 주소를 리턴한다.
		// 이때 arr는 로컬 변수이기 떄문에 호출이 끝나면 제거된다.

	}

	public static void main(String[] args) {

		int r1 = m1();

		// m1() 에서 만든 로컬 변수는 접근할 수 없다.
		// a = 300; // 컴파일 오류!
		// b = 300; // 컴파일 오류!
		// c= 300 ; // 컴파일 오류!

		// m1() 로컬 변수 c 의 값은 r1 변수에 리턴 받았기 때문에 사용할 수 있다.

		System.out.println(r1);
		
		System.out.println("============================");
		
		int[] r2 = m2();
		// m2()에서 만든 배열을 m2 호출이 끝나더라도 사용할 수 있다.
		// 이유? new 로만든 메모리는 Heap 영역에 생성되기 때문이다.
		// statck 영역에 생성된 로컬 변수는 메서드 호출이 끝나면 사라지지만,
		// Heap 영역에 생성된 변수는 메서드 호출이 끝나더라도 사라지지 않는다.
		
		for(int i  : r2) {
			System.out.println(i);
			
		r2[0] = 150;
		r2[1] = 250;
		r2[2] = 350;
		
		for(int j  : r2) {
			System.out.println(j);
		
		}

	}
}
}