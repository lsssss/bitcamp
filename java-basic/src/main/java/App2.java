import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App2 {
	static Scanner keyScan = new Scanner(System.in);
	
	
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

		if (response.equals("n") || response.equals("no") || response.equals(""))
			return false;
		return false;
	}
	static String prompt(String message) {
		System.out.println(message);
		return keyScan.nextLine();
	}
	public static void main(String[] args) {

		
		ArrayList<Score2> list = new ArrayList<>();
		Iterator<Score2> iterator;

		loop: while (true) {
			System.out.println("===========================================");
			System.out.println("목록 : list , 조회 : view , 추가 : add");
			System.out.println("삭제 : delete , 변경 : update , 종료 : exit");
			System.out.println("===========================================");
			System.out.print("성적관리> ");
			String input = keyScan.nextLine();
			String name = null;
			Score2 score = null;
			switch (input) {
			case "list":
				System.out.println(" 목록 ");
				iterator = list.iterator();
				while(iterator.hasNext()) {
					iterator.next().print();
				}
				break;
				
			case "view":
				System.out.println("조회");
				name = prompt("학생 이름 ? :");
				
				iterator = list.iterator();
				while(iterator.hasNext()) {
					Score2 temp =iterator.next();
					if(temp.name.equals(name)) {
						score = temp;
						break;
					}
					
				}
				if( score == null) {
					System.out.printf("%s 의 성적 정보 없습니다 \n",name);
				}else
					score.print();
				break;

			case "add":
				System.out.println(" 추가 ");
				while(true) {
					score = new Score2();
					score.input();
					
					list.add(score);
					
					if(!confirm("계속 입력 ? "))
					break;
				}
				break;
			case "delete":
				System.out.println("삭제");
				name = prompt("이름 ? ");
				iterator = list.iterator();
				
				while(iterator.hasNext()) {
					Score2 temp = iterator.next();
					if(temp.name.equals(name)) {
						score = temp;
						break;
					}
				}
					if(score == null) {
						System.out.printf("%s 의 학생정보 없음",name);
					}else {
						if(!confirm2("삭제 리얼리 ? : ")) {
							list.remove(score);
							System.out.println("삭제 했습니다.");
						}else {
							System.out.println("삭제 취소되었습니다");
						}
				}						
				break;
			case "update":
				System.out.println("변경");
				name = prompt("변경 학생이름 : ");
				iterator = list.iterator();
				
				while(iterator.hasNext()) {
					Score2 temp= iterator.next();
					if(temp.name.equals(name)) {
						score = temp;
						break;
					}
				}
				if(score == null) {
					System.out.printf("%s 의 정보가 없습니다",name);
				}else {
					score.update();
				}
					
				
				
				
				
				break;
			case "exit":
				System.out.println("종료");
				break loop;
			default:
				System.out.println("제대로 입력해라");

			}
		}
	}

}
