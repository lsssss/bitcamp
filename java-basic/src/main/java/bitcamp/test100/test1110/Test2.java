package bitcamp.test100.test1110;

import java.io.File;
import java.sql.Date;

public class Test2 {

	public static void main(String[] args) {
		
		
		File file = new File(".");
		
		String[] files = file.list();
		
		for(String name : files) {
			System.out.print(name);
		}
		
		
		File[] files2 = file.listFiles();
		
		 for (File f : files2) {
	            System.out.printf("%s %10d %s %s\n",
	                f.isDirectory() ? "d" : "-",
	                f.length(),
	                new Date(f.lastModified()).toString(),
	                f.getName());
	        }
		 
		 
		 
		
		
		
	}

}
