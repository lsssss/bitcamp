package bitcamp.practice100.practice1101;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<>();
		
		String s1 = "홍길동";
		String s2 = "홍길동2";
		String s3 = "홍길동3";
		String s4 = "홍길동4";
		String s5 = "홍길동5";
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		System.out.println(set.size());
		
		Contact[] arr = new Contact[set.size()];
		set.toArray(arr);
		
		for( Contact c : arr) {
			System.out.println(c);
		}
		
		
	}
	
}
