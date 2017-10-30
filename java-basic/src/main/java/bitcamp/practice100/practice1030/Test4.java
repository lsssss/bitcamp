package bitcamp.practice100.practice1030;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test4 {
	
	static class Score{
	
		String name;
		int kor;
		int eng;
		int math;
		int sum = kor+eng+math;
		float aver = sum/3f;
		
		void compute() {
			sum = kor+eng+math;
			aver = sum/3f; 
		}
	}

	public static void main(String[] args) {
		
		Score s = new Score();
		Score s1  = new Score();
		Score s2 = new Score();
		
		s.name = "호애앵";
		s.kor = 100;
		s.eng = 100;
		s.math = 100;
		s.compute();
		
		System.out.printf("%s , %d ,%d , %d, %d ,%f",s.name ,s.kor,s.eng,s.math,s.sum,s.aver);
		
	}
}
