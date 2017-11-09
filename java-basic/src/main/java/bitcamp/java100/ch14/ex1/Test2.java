package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("ok.txt");
		
		System.out.println(file.createNewFile());
		
		
		System.out.println(file.delete());

		
		File file2 = new File("dir1");
		System.out.printf("디렉토리 생성 = %s\n",file2.mkdir());
		
		System.out.printf("디렉토리삭제 : %s\n",file2.delete());
		
		File file3  = new File("aaa/bbb/ccc/test.txt");
		System.out.printf("생성 : %s ",file3.mkdirs());
	}
	
}
