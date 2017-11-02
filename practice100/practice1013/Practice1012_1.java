// ## 메서드 - 용도의 사용 예
// - 메서드의 용도와 간단한 사용 예를 알아보자!
//


package bitcamp.practice100.practice1013;

public class Practice1012_1 {
	
	static class Score{
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float avr;
	}

	public static void main(String[] args) {
		
		Score s1 = new Score();
		s1.name = "???";
		s1.kor = 90;
		s1.eng = 90;
		s1.math = 90;
		s1.sum = s1.kor+s1.eng+s1.math;
		s1.avr = s1.sum/3.f;
		
		Score s2 = new Score();
		s2.name = "???";
		s2.kor = 90;
		s2.eng = 90;
		s2.math = 90;
		s2.sum = s2.kor+s2.eng+s2.math;
		s2.avr = s2.sum/3.f;
		
		
		Score s3 = new Score();
		s3.name = "???";
		s3.kor = 90;
		s3.eng = 90;
		s3.math = 90;
		s3.sum = s3.kor+s3.eng+s3.math;
		s3.avr = s3.sum/3.f;
		
		Score s4  = createScore("!!!",100,100,100);
		Score s5  = createScore("!!!",100,100,100);
		Score s6  = createScore("!!!",100,100,100);

		
	}
	
	static Score createScore(String name, int kor, int eng, int math) {
		Score s = new Score();
		
		s.name = name;
		s.kor = kor;
		s.eng = eng;
		s.math = math;
		s.sum = kor+eng+math;
		s.avr = s.sum/3f;
		
		return s;
	}
}
