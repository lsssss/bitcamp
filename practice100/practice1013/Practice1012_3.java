// ## 메서드 - 용도의 사용 예
// - 메서드의 용도와 간단한 사용 예를 알아보자!
//

package bitcamp.practice100.practice1013;

public class Practice1012_3 {
	
	static class Score{
		String name;
		int kor;
		int math;
		int eng;
		int sum;
		float avr;
		
		void compute() {
			
			
			int sum = kor + math + eng;
			float avr = sum / 3f;
			System.out.println("이름 : " + name);
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avr);
		}
		
		
	}

	public static void main(String[] args) {
			
		
			Score s1 = createScore("고길동",100,100,100);
			
			
					
	}
	
	static Score createScore(String name, int kor, int eng, int math) {
		
		Score s= new Score();
		s.sum = kor + math + eng;
		s.avr = s.sum / 3f;
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + s.sum);
		System.out.println("평균 : " + s.avr);
		
		return s;
		
	}
	
	

}
