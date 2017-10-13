package bitcamp.practice100.practice1013;

public class Practice1012_7 {
	
	static int[] m1(int a, int b, int c) {
		
		int[] values;
		
		values = new int[]{a,b,c};
		
		return values;
		
//		// 배열을 초기화시키는 문법은 배열 레퍼런스 변수 선언문과 함께 사용해야 한다.
//        int[] values = {100, 90, 80};
//        
//        // 만약 레퍼런스 변수를 먼저 선언한 다음에 초기화시키려면 
//        // 반드시 명시적으로 new 명령을 작성해야 한다.
//        int[] values2;
//        //values2 = {100, 90, 80}; // 컴파일 오류!
//        values2 = new int[] {100, 90, 80}; // OK!
//        
//        // 따라서 값이 들어 있는 배열을 바로 만들어 리턴할 경우
//        // 다음과 같이 해서는 안된다.
//        //return {100, 90, 80}; // 컴파일 오류!
//        
//        return new int[] {100, 90, 80};
//        
//        // 주의!
//        // 사실 배열이 리턴되는 것이 아니라 배열의 주소가 리턴된다.
//        // primitive type(byte, short, int, long, float, double, boolean, char)을 제외한
//        // 나머지 모든 타입은 무조건 값이 아닌 주소를 주고 받는 것이다.
	}
	
	public static void main(String[] args) {
	
		int[] arr = m1(100,50,60);
		for(int i : arr) {
			System.out.println(i);
		}

	}
	


}
