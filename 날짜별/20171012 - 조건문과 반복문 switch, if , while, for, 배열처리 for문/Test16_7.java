package bitcamp.java100;

public class Test16_7 {

	public static void main(String[] args) {

		String[][] names2 = { { "ㄱㄱㄱ", "ㄴㄴㄴ", "ㄷㄷㄷ", "ㄹㄹㄹ", "ㅁㅁㅁ" }, { "123", "ㄴㄴㄴ", "ㄷㄷㄷ", "ㄹㄹㄹ", "ㅁㅁㅁ" },
		        { "321", "ㄴㄴㄴ", "ㄷㄷㄷ", "ㄹㄹㄹ", "ㅁㅁㅁ" }, { "456", "ㄴㄴㄴ", "ㄷㄷㄷ", "ㄹㄹㄹ", "ㅁㅁㅁ" } };

		for (int i = 0; i < names2.length; i++) {
			for (String n : names2[i])
				System.out.println(n);
		}

		String[] names = { "홍길동", "임꺽정", "유관순", "안중근", "윤봉길" };

		for (String n : names)
			System.out.println(n);

		System.out.println("------------------");

		int[] kor = { 100, 90, 80, 90, 50, 80 };

		for (int score : kor) {
			System.out.println(score);
		}

		// => for 블록 밖에 변수를 선언해 놓고 사용할 수 없다.
		int s = 0;
		/*
		 * 컴파일 오류! for (s : kor) { System.out.println(s); }
		 */

		System.out.println("------------------");

		// => List 컬렉션 객체에서 값을 꺼내기
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
		list.add("홍길동");
		list.add("임꺽정");
		list.add("유관순");
		list.add("안중근");
		list.add("윤봉길");
		list.add("홍길동");
		list.add("임꺽정");

		for (String n : list) {
			System.out.println(n);
		}

		System.out.println("------------------");

		// => Set 컬렉션 객체에서 값을 꺼내기
		java.util.HashSet<String> set = new java.util.HashSet<>();
		set.add("홍길동");
		set.add("임꺽정");
		set.add("유관순");
		set.add("안중근");
		set.add("윤봉길");
		set.add("홍길동");
		set.add("임꺽정");

		for (String n : set) {
			System.out.println(n);
		}

	}
}
