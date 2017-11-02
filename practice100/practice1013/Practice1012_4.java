// ## 메서드 - 용도의 사용 예
// - 메서드의 용도와 간단한 사용 예를 알아보자!
//

package bitcamp.practice100.practice1013;

public class Practice1012_4 {
	
	static class Score{
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float avr;
	}
	
	
	public static void main(String[] args) {
			
		Score s1 = compute("고길동 불쌍해",30,40,50);
		Score s2 = compute("김민수", 50, 60, 70);
		
		System.out.println();
					
	}
	
	
	static Score compute(String name, int kor, int age, int math) {
		Score s = new Score();
		
		s.sum = kor+age+math;
		s.avr = s.sum/3f;
		System.out.println(name);
		System.out.println(kor);
		System.out.println(age);
		System.out.println(math);
		System.out.println(s.sum);
		System.out.println(s.avr);
		
		return s;
		
		
	}

}
