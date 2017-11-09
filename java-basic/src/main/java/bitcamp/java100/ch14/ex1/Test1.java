package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("../../bitcamp/java-basic/build.gradle");
		
		System.out.printf("파일명 =%s\n",file.getName());
		System.out.printf("절대경로 = %s\n",file.getAbsolutePath());
		System.out.printf("계산된경로=%s\n",file.getCanonicalFile());
		System.out.printf("전체용량 =%s\n",file.getTotalSpace());
		System.out.printf("남은용량%s\n",file.getFreeSpace());
		System.out.printf("부모디렉토리 =%s\n",file.getParent());
		System.out.printf("존재함 ? %s\n",file.exists());
		System.out.printf("파일여부 ? %s\n",file.isFile());
		System.out.printf("디렉토리여부 ? %s\n",file.isDirectory());
		System.out.printf("크기 ? %s\n",file.length());
		System.out.printf("읽기 ? %s\n",file.canRead());
		System.out.printf("쓰기 ? %s\n",file.canWrite());
		System.out.printf("실행 ? %s\n",file.canExecute());
		System.out.printf("마지막 변경일 %s\n",new Date(file.lastModified()).toLocaleString());
		
		
		
	}
	
}
