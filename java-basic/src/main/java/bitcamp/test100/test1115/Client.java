package bitcamp.test100.test1115;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("192.168.0.53",9999);
		System.out.println("서버와 연결됨");
		
		System.out.printf("CIP = %s",socket.getLocalAddress().getHostAddress());
		System.out.printf("Cport = %d",socket.getLocalPort());
		
		System.out.printf("SIP = %s",socket.getInetAddress().getHostAddress());
		System.out.printf("Sport = %d", socket.getPort());
		System.out.println("연결종료");
		
	}
}
