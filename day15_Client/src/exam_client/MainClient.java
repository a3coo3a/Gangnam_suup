package exam_client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClient {

	public static String userId;	// 유저 아이디 변수
	
	public static void main(String[] args) {
		
		/*
		 * 클라이언트 측 코드는 크게 다르지 않습니다.
		 * 1. sender측에 아이디를 입력받아서 전송하는 부분을 추가
		 * 2. receive측에 내가 쓴 글이라면 출력을 생략하는 부분을 추가
		 */
		
		try {
			Socket socket = new Socket("192.168.104.58",8383);
			
			Sender sender = new Sender(socket);
			sender.start();
			
			Receive receive = new Receive(socket);
			receive.start();
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
