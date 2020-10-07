package exam_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.regex.Pattern;

public class Sender extends Thread { // 보내다

	private Socket socket;

	// 생성자
	public Sender(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			// 사용자한테 키보드를 통해 값을 입력 받음
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));

			// 서버로 보내는 역할을 함.
			// - 단순히 콘솔로 보내주는 것이 아니라 서버로 보내주는 것.
			// 출력스트림을 통해서 연결된 소켓에 outputStream을 통해 출력
			// OutputStream os = socket.getOutputStream();
			PrintWriter out = new PrintWriter(socket.getOutputStream());

			// 추가 : 시작할때 id를 입력받는 부분을 추가
			while (true) {
				System.out.print("닉네임 > ");
				String id = bf.readLine();
				// (:) 특수문자를 사용할 수 없게
				if (id == null || Pattern.compile(":").matcher(id).find()) { // 아이디가 없거나 문자중에 :가 포함되어 있는 경우 다시 돌아가서 재입력 받음.
					System.out.println("사용할 수 없는 아이디 입니다.");
					continue;
				} else {
					MainClient.userId = id;
					break;
				}

			}
			// 서버한테 id전달
			out.println("ID:" + MainClient.userId); // 아이디를 서버에 전송
			out.flush();

			// 메시지 전송 부분
			while (true) {

				String message = bf.readLine(); // 사용자한테 받은 메시지

				if (message.equals("/exit")) { // 사용자한테 /exit입력받으면 종료
					break;
				}
				
				
				out.println(message); // out 가리키는 방향으로 메세지를 날리는 거야~
				out.flush(); // 밀어주어야 실제 전송이 이루어짐. buffered니까~

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
