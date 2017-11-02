package bitcamp.practice100.practice1013;

public class Practice1012_9 {
	
	static class Score3{
		String name;
		int age;
		int[] sub;
		int sum;
		float avr;
	}
	
	static Score3 compute(String name, int age, int kor, int eng, int mat, int gym, int sci) {
		Score3 s = new Score3();
		s.name = name;
		s.age =age;
		s.sub = new int[] {kor,eng,mat,gym,sci};
//		s.sub[0] = kor;
//		s.sub[1] = eng;
//		s.sub[2] = mat;
//		s.sub[3] = gym;
//		s.sub[4] = sci;
		//s.sum = +kor + eng + mat + gym+ sci;
		for(int i=0; i < s.sub.length ; i++) 
			s.sum += s.sub[i];
		s.avr=s.sum/5.f;
		
		System.out.println("이름 : " + s.name);
		System.out.println("나이 : " + s.age);
		
		for(int i=0; i< s.sub.length ; i++) {
			System.out.println("과목 : " + s.sub[i]);
		}
		System.out.println("총점 : " + s.sum);
		System.out.println("평균 : " + s.avr);
		
		
		return s;
	}

	
	public static void main(String[] args) {
		
		Score3 s1 = compute("하하하",20,90,80,70,60,50);
		
		}


}
