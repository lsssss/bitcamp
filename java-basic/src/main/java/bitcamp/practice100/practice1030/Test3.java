package bitcamp.practice100.practice1030;

public class Test3 {

	public static void main(String[] args) {
		
		String[] name = {"홍길동","고길동","김길동"};
		int[] kor = {100,100,100};
		int[] eng = {100,100,100};
		int[] math = {100,100,100};
		
		for(int i = 0; i<name.length ; i ++) {
			int sum = kor[i]+eng[i]+math[i];
			float aver = sum/3f;
			
			System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
					name[i],kor[i],eng[i],math[i],sum,aver);
			
			
		}
	
	}
}
