package multi_server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MainServer {
	/*
	 * 여러 클라이언트를 만나야함.
	 * 서버는 꺼지지 않아야함. 
	 * 꺼지는 것은 문제가 됬다는 것
	 */

	// 서버에 접속하느 클라이언트의 output을 저장할 리스트
	public static ArrayList<PrintWriter> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		/*
		 * 채팅 : 클라이언트와 클라이언트 간의 대화
		 * 서버의 역할 : 클라이언트의 채팅글을 전달만 하고, 채팅을 참여하진 않습니다.
		 * >>>> 여러클라이언트를 서로 연결할 수 있게하고, 
		 * 		클라이언트에게 받은 데이터를 연결되어 있는 모든 클라이언트에게 전달하도록 처리
		 */
		try {
			ServerSocket serverSocket = new ServerSocket(8383);
			
			while (true) {
				System.out.println("------ 연결 대기 ------");
				Socket socket = serverSocket.accept();	// while안에 있으므로 돌고 다시 와서 다른 클라이언트를 받을 준비를 함.
				System.out.println("------ 연결 성공 ------");
				
				//연결이 들어올때마다 클라이언트 관리 객체를 생성하고 
				ClientManage client = new ClientManage(socket);	
				
				OutputStream os = socket.getOutputStream();
				PrintWriter	out = new PrintWriter(os);	// 모든 클라이언트에게 전송할  out을 만드는 것
				
				// out을 모아놓을 수 있는 list필요 : 전역변수로 생성
				list.add(out);
				//위의 단계를 줄이면 아래와 같이도 가능.
				//list.add(new PrintWriter(socket.getOutputStream()));
				
				client.start();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
