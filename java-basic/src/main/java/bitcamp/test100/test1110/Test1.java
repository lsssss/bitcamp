package bitcamp.test100.test1110;

import java.io.File;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {

		File file = new File(".");

		System.out.println(file.getAbsolutePath());

		System.out.println(file.getCanonicalFile());

		System.out.println(file.getParent());

		System.out.println(file.getTotalSpace());

		System.out.println(file.getFreeSpace());

		System.out.println(file.exists());

		System.out.println(file.isFile());

		System.out.println(file.isDirectory());

		System.out.println(file.length());

		System.out.printf("읽기=%s\n", file.canRead());
		System.out.printf("쓰기=%s\n", file.canWrite());
		System.out.printf("실행=%s\n", file.canExecute());

		System.out.println(file.lastModified());
		
		
		
		
	}
}
