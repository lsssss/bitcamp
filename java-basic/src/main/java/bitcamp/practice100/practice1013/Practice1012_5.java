// ## 메서드 - 용도의 사용 예
// - 메서드의 용도와 간단한 사용 예를 알아보자!
//

package bitcamp.practice100.practice1013;

public class Practice1012_5 {

	static void m1(int...values) {
		System.out.printf("아규먼트 개수 %d\n",values.length);
		
		for(int v : values) {
			System.out.println(v);
		}
		
//		for (int i=0 ; i<values.length ; i++) {
//			System.out.println(values[i]);
//		}
		
		System.out.println("---------------------");
	}
	
	static void sum(int... values) {
		int s=0;
		
//		for(int v : values) {
//			s+=v;
//		}
		
		for(int i=0; i < values.length ; i++) {
			s+=values[i];
		}
		
		System.out.printf("합 : %d\n"
				+ "", s);
	}
	
	static void names(String... namevalue) {
		for(String nv : namevalue) {
			System.out.println(nv);
		}
	}
	
	public static void main(String[] args) {
		
	m1(100,100,30,40);		
	
	sum(100,30,40,50);
	
	names("고길동","둘리","희동");
					
	}
	


}
