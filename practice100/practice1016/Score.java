package bitcamp.practice100.practice1016;

import java.util.Scanner;

public class Score {
	String name;
	int[] catstat = new int[5];
	int statsum;
	float statavr;

	static void catstatsum(Score s) {

		for (int ss : s.catstat) {
			s.statsum += ss;
		}
		s.statavr = s.statsum / 5f;
	}

	static void catinit(Score s, Scanner csc) {
		
		System.out.print("고양이 이름을 입력하세요 : \n");
		s.name = csc.next();
		
		System.out.print(s.name+"의"+" 힘을 입력하세요 : ");
		s.catstat[0] = csc.nextInt();

		System.out.print(s.name+"의"+"민첩을 입력하세요 : ");
		s.catstat[1] = csc.nextInt();

		System.out.print(s.name+"의"+"지혜를 입력하세요 : ");
		s.catstat[2] = csc.nextInt();

		System.out.print(s.name+"의"+"지능을 입력하세요 : ");
		s.catstat[3] = csc.nextInt();

		System.out.print(s.name+"의"+"체력을 입력하세요 : ");
		s.catstat[4] = csc.nextInt();
		System.out.println("=====================================");
		catstatsum(s);
	}

	static void catprint(Score s) {

		System.out.printf("%s, %d, %d, %d, %d, %d, %d, %.1f \n", s.name, s.catstat[0], s.catstat[1], s.catstat[2],
		        s.catstat[3], s.catstat[4], s.statsum, s.statavr);
	}
}
