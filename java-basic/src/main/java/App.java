import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
	static Scanner keyScan = new Scanner(System.in);

	static boolean confirm(String message) {

		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();
		if (response.equals("y") || response.equals("yes") || response.equals("")) {
			return true;
		} else {
			return false;
		}
	}

	static boolean confirm2(String message) {
		System.out.print(message);
		String response2 = keyScan.nextLine().toLowerCase();

		if (response2.equals("y") || response2.equals("yes"))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		// ArrayList는 Score 타입뿐만 아니라 자바의 모든 타입의 객체에 대해서도
		// 사용할 수 있다.
		ArrayList<Score> list = new ArrayList<Score>();
		boolean tf = true;

		while (tf == true) {
			System.out.println();
			System.out.println("*****************************");
			System.out.println("성적목록 : list           ");
			System.out.println("      조회 : view         ");
			System.out.println("      추가 : add            ");
			System.out.println("      삭제 : delete         ");
			System.out.println("업데이트 : update          ");
			System.out.println("      종료 : exit         ");
			System.out.println("*****************************");
			System.out.print("성적관리> ");

			String input = keyScan.nextLine();
			switch (input) {
			case "list":
				Iterator<Score> iterator = list.iterator();
				while (iterator.hasNext()) {
					iterator.next().print();
				}
				break;

			case "add":
				while (true) {
					Score score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
					score.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.

					list.add(score);

					if (!confirm("계속하시겠습니까? "))
						break;
				}
				break;
			case "view":
				System.out.print("이름 ? : ");
				String viewname = keyScan.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (viewname.equals(list.get(i).name)) {
						list.get(i).print();
						break;
					}
				}
				break;
			case "delete":
				System.out.print("이름 ? : ");
				String deletename = keyScan.nextLine();

				for (int i = 0; i < list.size(); i++) {
					if (deletename.equals(list.get(i).name)) {
						if (confirm2("정말 삭제 하시겠습니까? (y/N)")) {
							list.remove(i);
							break;

						}
					}
				}
				System.out.println("학생정보가 없습니다.");
				break;
			case "update":

				System.out.println("이름 ? : ");
				String updatename = keyScan.next();
				Score s = new Score();
				int len= 0;
				
				for (int i = 0; i < list.size(); i++) {
					len++;
					if (updatename.equals(list.get(i).name)) {
						System.out.printf("국어? (%d) :", list.get(i).subjects[0]);
						s.subjects[0] = keyScan.nextInt();
						if (s.subjects[0] == 0) {
							s.subjects[0] = list.get(i).subjects[0];
						}
						System.out.printf("영어? (%d) :", list.get(i).subjects[1]);
						s.subjects[1] = keyScan.nextInt();
						if (s.subjects[1] == 0) {
							s.subjects[1] = list.get(i).subjects[1];
						}
						System.out.printf("수학? (%d) :", list.get(i).subjects[2]);
						s.subjects[2] = keyScan.nextInt();
						if (s.subjects[2] == 0) {
							s.subjects[2] = list.get(i).subjects[2];
						}
					}
					if (!confirm2("저장할거임? :")) {
						list.get(i).subjects[0] = s.subjects[0];
						list.get(i).subjects[1] = s.subjects[1];
						list.get(i).subjects[2] = s.subjects[2];
						list.get(i).sum = list.get(i).subjects[0] + list.get(i).subjects[1]
						        + list.get(i).subjects[2];
						list.get(i).aver = list.get(i).sum / 3f;
					} else {
						System.out.println("최소됨");
						
					}
					
				}break;
				
			case "exit":
				System.out.println(input);
				tf = false;
				break;
			default:
				System.out.println("제대로 입력해 주세요 ");
			}

		}

	}
}
