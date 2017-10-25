package bitcamp.practice100.practice1024;

import java.util.Scanner;

public class College {

	// 이름 나이 학점 주소 전화번호 학과 학번 평점

	final static String DPT_1 = "컴공";
	final static String DPT_2 = "건축";
	final static String DPT_3 = "영양";
	final static String DPT_4 = "영어";
	final static String DPT_5 = "경영";

	String name;
	String addr;
	String phone;
	int age;
	String department;
	int studentId;
	float score;

	void initStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		this.name = sc.nextLine();
		System.out.print("주소 : ");
		this.addr = sc.next();
		System.out.print("번호 : ");
		this.phone = sc.next();
		System.out.print("나이 ex) 20 21 .....  :  ");
		this.age = sc.nextInt();
		System.out.print("학과 입력 ex) DPT_1 , DPT_2 , DPT_3");
		this.department = sc.next();
		System.out.print("학번 ex)20112800: ");
		this.studentId = sc.nextInt();
		System.out.print("평균학점 ex)4.5 : ");
		this.score = sc.nextFloat();

	}

	void printStudent() {
		switch(this.department) {
		case "DPT_1" : System.out.printf("%s,%s,%s,%d,%s,%d,%f\n", this.name, this.addr, this.phone, this.age, this.DPT_1,
		        this.studentId, this.score); break;
		case "DPT_2" : System.out.printf("%s,%s,%s,%d,%s,%d,%f\n", this.name, this.addr, this.phone, this.age, this.DPT_2,
		        this.studentId, this.score); break;
		case "DPT_3" :System.out.printf("%s,%s,%s,%d,%s,%d,%f\n", this.name, this.addr, this.phone, this.age, this.DPT_3,
		        this.studentId, this.score); break;
		case "DPT_4" :System.out.printf("%s,%s,%s,%d,%s,%d,%f\n", this.name, this.addr, this.phone, this.age, this.DPT_4,
		        this.studentId, this.score); break;
		case "DPT_5" :System.out.printf("%s,%s,%s,%d,%d,%d,%d\n", this.name, this.addr, this.phone, this.age, this.DPT_5,
		        this.studentId, this.score); break;
		}
	}
}
