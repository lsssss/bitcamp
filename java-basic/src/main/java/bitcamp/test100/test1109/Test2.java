package bitcamp.test100.test1109;

import java.io.FileReader;

public class Test2 {
	public static void main(String[] args) {


		try(FileReader in = new FileReader("./build.gradle");) {
			   // 반드시 java.lang.AutoCloseable 규칙에 따라 만든 클래스의 객체여야 한다
			

			System.out.println("파일읽기 준비 완료");

			int ch;
			while (true) {
				ch = in.read();

				if (ch == -1)
					break;

				System.out.print((char) ch);
			}

			System.out.println("---------------------------------");
		} catch (Exception e) {
			System.out.println("파일읽기중 오류 발생");

		} 

	}
}
