package bitcamp.test100.test1115;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
	public static void main(String[] args) throws IOException {


		ServerSocket ss = new ServerSocket(9999);
		System.out.println("서버실행");
		Socket socket = ss.accept();
		
		System.out.println("클라이언트 접속");
		Scanner in = new Scanner(socket.getInputStream());
		String line = in.nextLine();
		
		System.out.println(line);
		
		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println(line);
		

		
		in.close();
		out.close();
		
		ss.close();
		socket.close();
		
		System.out.println("서버종료");
	}
	
}
