package bitcamp.test100.test1109;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력해 >");
		String scc = sc.nextLine().toLowerCase();
	try {	
		switch(scc) {
		case "a" : throw new Exception();
		case "b" : throw new IOException();
		case "c" : throw new SQLException();
		case "d" : throw new ArrayIndexOutOfBoundsException();
		case "e" : throw new FileNotFoundException();
		}
		System.out.println("에러없이 그냥 출력됨");
		System.out.println(scc);
		}catch (Throwable e) {	
			System.out.println("이런 에러가 발생했다");
			System.out.println(e);
		}
	
	}
}
