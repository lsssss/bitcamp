package bitcamp.java100;

import java.io.Console;

public class Test21_8 {

	static class prof {
		public static int length;
		String name;
		String email;
		String phonenum;
	}

	static void profinit(prof k, Console con) {
		k.name = con.readLine("이름 ? :  ");
		k.email = con.readLine("이메일 ? :  ");
		k.phonenum = con.readLine("번호 ? :  ");
	}
	
	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
		}

		int j = Integer.valueOf(console.readLine("몇명 입력 하시겠습니까 : "));
		prof[] pf = new prof[j];
		for (int i = 0; i < j; i++) {
			pf[i] = new prof();
		}

		String yn;
		String save;

		for (int k = 0; k < pf.length; k++) {

			yn = console.readLine("입력 하시겠습니까? ex)y or n :");
			if (yn.equals("y")) {
				profinit(pf[k], console);
				save = console.readLine("저장 하시겠습니까 ? ex) y or n : ");
				if (save.equals("n")) {
					pf[k].name = null;
					pf[k].email = null;
					pf[k].phonenum = null;
					k--;
					System.out.println("취소 되었습니다");
				} else if (save.equals("y")) {
				} else {
					System.out.println(" y나 n을 눌러 주세요! ");
				}
			} else if (yn.equals("n")) {
				k = pf.length;
				for (int i = 0; i < pf.length; i++) {
					if (pf[i].name != null)
						System.out.printf("%s    %s     %s\n", pf[i].name, pf[i].email, pf[i].phonenum);
				}

			} else {
				System.out.println(" y나 n을 눌러 주세요! ");
			}
		}
	}
}
//java -cp ./bin bitcamp.java100.Test21_8