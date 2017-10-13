// ## 메서드 - 용도의 사용 예
// - 메서드의 용도와 간단한 사용 예를 알아보자!
//

package bitcamp.practice100.practice1013;

public class Practice1012_2 {

	static class Score {

		String name;
		int kor;
		int math;
		int eng;

		void compute() {
			
			
			int sum = kor + math + eng;
			float avr = sum / 3f;
			System.out.println("이름 : " + name);
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println(sum);
			System.out.println(avr);
		}
	}

	public static void main(String[] args) {

		Score s1 = new Score();

		s1.name = "고길동";
		s1.kor = 100;
		s1.math = 100;
		s1.eng = 100;

		s1.compute();
		
		Score s2 = new Score();

		s2.name = "임꺽정은 무슨 죄인가";
		s2.kor = 100;
		s2.math = 100;
		s2.eng = 100;

		s2.compute();
		
		
		Score s3 = new Score();

		s3.name = "왜 유관순인가 ";
		s3.kor = 100;
		s3.math = 100;
		s3.eng = 100;

		s3.compute();
	}

}
