package single_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class Sender extends Thread { // 보내다

	/*
	 * 서버측에 메시지 전송 클래스
	 * 생성자로 연결된 소켓을 전달 받습니다.
	 * 
	 */

	private Socket socket;

	public Sender(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			// 사용자한테 입력받음
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			
			// 출력스트림을 통해 연결된 소켓에 outputstream을 통해 출력
			PrintWriter	out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				// 사용자에게 입력받은 message
			
				String message = bf.readLine();
				
				if(message.equals("/exit")) {
					break;
				}
				
				out.println(message);	// out 가리키는 곳으로 메시지를 전달
				out.flush();
				System.out.print("> ");
				
			}
						
			out.close();
			bf.close();
			socket.close();
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// run end

}// class end
