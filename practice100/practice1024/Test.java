package bitcamp.practice100.practice1024;

import java.util.Scanner;

public class Test {
	
	static boolean confirm(String message) {
		Scanner sc2 = new Scanner(System.in);
		System.out.print(message);
		String response = sc2.nextLine().toLowerCase();
		if(response.equals("y")||response.equals("yes"))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇명 입력 ? : ");
		College[] students = new College[sc.nextInt()];
		int cnt = 0;
		
		
		while (true) {
			College student = new College();
			
			student.initStudent();
			
			students[cnt++] = student;
			if(!confirm("계속 입력 ? y or yes : "))
				break;
		}
		
		for(int i = 0; i <cnt; i++) {
			students[i].printStudent();
		}
	}

}
