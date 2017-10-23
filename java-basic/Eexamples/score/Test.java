import java.io.Console;

public class Test {

	static Score[] scores = new Score[10000];
	static int cursor = 0;
	static Console console;

	static void prepareScore() {
		console = System.console();	
		if (console == null) {
			System.err.println("콘솔 출력을 지원하지 않습니다.");
			System.exit(1);
		}

		while (cursor < scores.length) {
			Score score  =new Score(
					console.readLine("이름 : ")
					,Integer.parseInt(console.readLine("국어 : "))
					,Integer.parseInt(console.readLine("영어 : "))
					,Integer.parseInt(console.readLine("수학 : ")));
		
	
			scores[cursor++] =score;

			if(cursor == scores.length) {
				System.out.println("최대 저장 개수 초과");
				break;
			}
			
		
			if(!confirm("계속 입력 하시곗습니까?")) {
				break;
			}
		}
			
			}

	static void printScore() {

		for (int i = 0; i < cursor; i++) {
			System.out.printf("%3s, %3d, %3d, %3d, %3d, %3f\n", scores[i].name, scores[i].kor, scores[i].eng,
			        scores[i].math, scores[i].sum, scores[i].aver);
		}
	}

	static boolean confirm(String message) {

		String response = console.readLine(message).toLowerCase();
		if (response.equals("y") || response.equals("yes")) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		prepareScore();
		printScore();

	}

}
