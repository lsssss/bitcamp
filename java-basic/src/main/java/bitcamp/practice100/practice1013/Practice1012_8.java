package bitcamp.practice100.practice1013;

import java.util.ArrayList;

public class Practice1012_8 {
	
	static ArrayList m1(String name,int age) {
		ArrayList list = new ArrayList();
		list.add(name);
		list.add(age);
		
		return list;
		
	}
	
	public static void main(String[] args) {
	
		ArrayList a = m1("승서",13);
		
		for(Object v : a) {
			System.out.println(v);
		}
		
		
		}


}
