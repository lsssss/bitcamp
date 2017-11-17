package bitcamp.test100.test1115;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(9999);
		System.out.println("서버 실행");
		
		Socket socket = ss.accept();
		System.out.println("클라이언트 접속");
		
		System.out.printf("SIP = %s\n",socket.getLocalAddress().getHostAddress());
		System.out.printf("Sport = %d\n",socket.getLocalPort());
		
		System.out.printf("CIP = %s\n",socket.getInetAddress().getHostAddress());
		System.out.printf("Cport = %d\n",socket.getPort());
		
		
		
		
	}
	
}
