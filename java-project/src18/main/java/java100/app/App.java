//: ## ver 18
//: - 기능 추가: 변경, 삭제 기능을 추가하라!
//: - 요구사항
//:   - App.java 클래스의 주석을 확인하라!
//: 
//: 
package java100.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	static Scanner keyScan = new Scanner(System.in);
	static ArrayList<Score> list = new ArrayList<>();
	static Iterator<Score> iterator;
	static String name = null;
	static Score score = null;

	public static void main(String[] args) {

		loop: while (true) {
			System.out.print("성적관리> ");
			String input = keyScan.nextLine();

			switch (input) {
			case "add": doAdd(); break;
			case "list": doList(); break;
			case "view": doView(); break;
			case "update": doUpdate(); break;
			case "delete": doDelete(); break;
			case "quit": doQuit(); break loop;
			default:  doerror(); 
			}

			System.out.println();
		}

	}

	private static void doerror() {
		System.out.println("실행할 수 없는 명령입니다.");
	}

	private static void doDelete() {
		System.out.println("[학생 삭제]");
		name = prompt("이름? ");

		iterator = list.iterator();
		while (iterator.hasNext()) {
			Score temp = iterator.next();
			if (temp.name.equals(name)) {
				score = temp;
				break;
			}
		}

		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			if (confirm2("정말 삭제하시겠습니까?(y/N) ")) {
				list.remove(score);
				System.out.println("삭제하였습니다.");
			} else {
				System.out.println("삭제를 취소하였습니다.");
			}
		}
	}
	
	private static void doQuit() {
		 System.out.println("프로그램을 종료합니다."); 
	}
	
	private static void doUpdate() {
		System.out.println("[학생 정보 변경]");
		name = prompt("이름? ");

		iterator = list.iterator();
		while (iterator.hasNext()) {
			Score temp = iterator.next();
			if (temp.name.equals(name)) {
				score = temp;
				break;
			}
		}

		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			score.update();
		}

	}

	private static void doView() {
		System.out.println("[학생 정보]");
		name = prompt("이름? ");

		iterator = list.iterator();
		while (iterator.hasNext()) {
			Score temp = iterator.next();
			if (temp.name.equals(name)) {
				score = temp;
				break;
			}
		}

		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			score.printDetail();
		}

	}

	private static void doList() {
		System.out.println("[학생 목록]");

		iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}

	private static void doAdd() {

		System.out.println("[학생 등록]");

		Score score;

		while (true) {
			score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
			score.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.

			list.add(score);

			if (!confirm("계속하시겠습니까?(Y/n) "))
				break;
		}

	}

	static String prompt(String message) {
		System.out.print(message);
		return keyScan.nextLine();
	}

	static boolean confirm(String message) {
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("y") || response.equals("yes") || response.equals("")) {
			return true;
		}
		return false;
	}

	static boolean confirm2(String message) {
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("n") || response.equals("no") || response.equals("")) {
			return false;
		}
		return true;
	}

}
