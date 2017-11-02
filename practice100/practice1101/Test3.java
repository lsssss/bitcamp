package bitcamp.practice100.practice1101;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		String s1 = "홍길동";
		String s2 = "홍길동1";
		String s3 = "홍길동2";
		String s4 = "홍길동3";
		String s5 = "홍길동4";
		String s6 = "홍길동5";
		String s7 = "홍길동6";
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		
		System.out.println(list.size());
		
		for(int i = 0 ; i < list.size() ; i ++) {
			System.out.printf("%s ", list.get(i) );
		}
		System.out.println();
		
		
	}
	
}
