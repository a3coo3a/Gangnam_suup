package single_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(8383);
			
			System.out.println("------ 연결 대기 -------");
			Socket socket = serverSocket.accept();
			
			System.out.println("Welcome to my server");
			
			// 연결된 socket을 메시지를 수신받는 Receive클래스한테 전달
			Receive receive = new Receive(socket);
			
			receive.start();
			
			// 연결된 socket을 메시지를 보내는 Sender클래스한테 전달
			Sender sender = new Sender(socket);
			
			sender.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
