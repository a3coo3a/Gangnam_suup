package 시험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ClientManage extends Thread {

	private Socket socket;
	private String userId; // 유저 아이디를 저장할 변수

	public ClientManage(Socket socket) {
		this.socket = socket;
	}
	
	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public void run() {
		try {
			// 클리어언트로 부터 넘어온 입력 스트림을 받는다.
			InputStream is = socket.getInputStream(); // 연결된 소켓에 인풋스트림으로 받아서 읽는거야
			BufferedReader bf = new BufferedReader(new InputStreamReader(is, "UTF-8"));

			while (true) { // 계속 받아야 하니까

				String message = bf.readLine();

				// 종료의 조건
				// 1. message가 null인경우 : 연결이 끊어졌다는 의미
				if (message == null) {
					System.out.println(this.userId + "님이 퇴장하였습니다.");
					// 연결된 모든 클라이언트에게 메세지 전송
					for (int i = 0; i < Exam.list.size(); i++) {
						PrintWriter out = Exam.list.get(i);
						out.println(this.userId + "님이 퇴장하였습니다.");
						out.flush(); // 송신
					}
					break;
				}
				// 2. 넘어온 메시지가 id인지 확인하는 부분
				String[] split = message.split(":");
				if (split.length == 2 && split[0].equals("ID")) {
					this.userId = split[1];
					System.out.println(this.userId + "님이 입장하였습니다."); // 서버에 찍힌는 메세지 >> 모든 클라이언트에게 다 날려야함.

					// 연결된 모든 클라이언트에게 메세지 전송
					for (int i = 0; i < Exam.list.size(); i++) {
						PrintWriter out = Exam.list.get(i);
						out.println(this.userId + "님이 입장하였습니다.");
						out.flush(); // 송신
					}
					continue; // while문에 처음으로 , 왜냐하면 아래쪽에 이제 아이디가 아닐 경우를 작성할거라
				}
				
				// 추가! 넘어온 메시지가 귓속말인지 확인하는 부분
				// /w id hello? -> 귓속말
				if(message.contains("/w")) {
					String[] whisper = message.split(" ", 3);
					Socket soc = Exam.map.get(whisper[1]);
					
					//PrintWriter out = MainServer.list.get(MainServer.list.indexOf());
					//out.println(userId + ">" + whisper[2]);
					//out.flush();
					//id = whisper[1];	// id 가 들어있고
					//message = whisper[2]; 	// 메세지
				}		
					
					
				// message가 null도 아니고, id를 넘겨준 상태가 아닌
				// 일반메세지를 모든 소켓에 전달
				for (int i = 0; i < Exam.list.size(); i++) {
					PrintWriter out = Exam.list.get(i);
					out.println(userId + ">" + message);
					out.flush();
				}
			} // while end

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			// 종료시점에 실행되는 finally문
			try {
				Exam.list.remove(new PrintWriter(socket.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
