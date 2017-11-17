package bitcamp.test100.test1115;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("192.168.0.53", 9999);
		System.out.println("서버와 연결됨");

		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("hello");
		System.out.println("서버에 hello보냄");
		
		Scanner in = new Scanner(socket.getInputStream());
		String line = in.nextLine();
		System.out.println("서버에서 hello답장");
		System.out.println(line);
		
		
		out.close();
		in.close();
		socket.close();
		System.out.println("서버와 연결종료");
	}
}
