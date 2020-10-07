package 시험;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;



public class Exam {
	public static ArrayList<PrintWriter> list = new ArrayList<>();
	public static HashMap<String, Socket> map = new HashMap<>();
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(8383);
			
			while (true) {
				System.out.println("------ 연결 대기 ------");
				Socket socket = serverSocket.accept();	// while안에 있으므로 돌고 다시 와서 다른 클라이언트를 받을 준비를 함.
				System.out.println("------ 연결 성공 ------");
				
				//연결이 들어올때마다 클라이언트 관리 객체를 생성하고 
				ClientManage client = new ClientManage(socket);	
				System.out.println(socket.getInetAddress());
				OutputStream os = socket.getOutputStream();
				PrintWriter	out = new PrintWriter(os);	// 모든 클라이언트에게 전송할  out을 만드는 것
				
				// out을 모아놓을 수 있는 list필요 : 전역변수로 생성
				list.add(out);
				map.put(client.getUserId(), socket);
				//위의 단계를 줄이면 아래와 같이도 가능.
				//list.add(new PrintWriter(socket.getOutputStream()));
				
				client.start();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
