package bitcamp.practice100.practice1013;

import java.util.ArrayList;

public class Practice1012_10 {
	
	static class Score3{
		String name;
		int age;
		int[] sub;
		String[] subn; //= new String[]{"국어","영어","수학","체육","과학"};
		int sum;
		float avr;
	}
	
	static Score3 compute(String name, int age, int kor, int eng, int mat, int gym, int sci) {
		Score3 s = new Score3();
		s.name = name;
		s.age =age;
		s.sub = new int[] {kor,eng,mat,gym,sci};
		s.subn = new String[]{"국어","영어","수학","체육","과학"};
//		s.sub[0] = kor;
//		s.sub[1] = eng;
//		s.sub[2] = mat;
//		s.sub[3] = gym;
//		s.sub[4] = sci;
		//s.sum = +kor + eng + mat + gym+ sci;
//		for(int i=0; i < s.sub.length ; i++) 
//			s.sum += s.sub[i];
//		s.avr=s.sum/5.f;
//		
//		System.out.println("이름 : " + s.name);
//		System.out.println("나이 : " + s.age);
//		
//		for(int i=0; i< s.sub.length ; i++) {
//			System.out.println("과목 : " + s.sub[i]);
//		}
//		System.out.println("총점 : " + s.sum);
//		System.out.println("평균 : " + s.avr);
//		
		
		return compute2(s);
	}
	
	static Score3 compute2(Score3 t) {
		
		
		
		
		System.out.println("이름 : " + t.name);
		System.out.println("나이 : " + t.age);
		
		for(int i = 0 ; i < t.sub.length ; i ++) {
			System.out.print(t.subn[i]+" : ");
			System.out.println(t.sub[i]);
			t.sum += t.sub[i];
		}
		t.avr = t.sum/t.sub.length;
		
		System.out.println("총점 : " + t.sum);
		System.out.println("평균 : " + t.avr);
		
		return t;
	}

	
	public static void main(String[] args) {
		
		Score3 s1 = compute("하하하",20,90,80,70,60,50);
		
		}


}
