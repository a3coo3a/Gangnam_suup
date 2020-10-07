package single_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class Sender extends Thread{	// 보내다

	private Socket socket;
	//생성자
	public Sender(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		try {
			// 사용자한테 키보드를 통해 값을 입력 받음
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
			
			// 서버로 보내는 역할을 함.
			// - 단순히 콘솔로 보내주는 것이 아니라 서버로 보내주는 것.
			// 출력스트림을 통해서 연결된 소켓에 outputStream을 통해 출력
			//OutputStream os = socket.getOutputStream();
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			
			while (true) {
				
				String message = bf.readLine();	// 사용자한테 받은 메시지
				
				if(message.equals("/exit")) {	// 사용자한테 /exit입력받으면 종료
					break;
				}
				
				out.println(message);	// out 가리키는 방향으로 메세지를 날리는 거야~
				out.flush();	// 밀어주어야 실제 전송이 이루어짐. buffered니까~
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
		
		
	}
}
