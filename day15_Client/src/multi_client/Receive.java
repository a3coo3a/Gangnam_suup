package multi_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class Receive extends Thread {

	private Socket socket;

	public Receive(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			while (true) {

				String message = bf.readLine();

				// 추가 : 메시지를 받아 왔을때 자신이라면 콘솔창에서 출력하지 않는 코드를 작성
				// 서버로부터 받은 message를 > 기반으로 자르고 id부분이 userId와 같다면 출력 부분은 생략
				String[] split = message.split(">");	// id를 >붙여서 넘어올 것임
				if(split.length == 2 && split[0].equals(MainClient.userId)) {	// 내가쓴 메세지는 출력하지 않고 넘어가는 방법
					continue;
				}
				System.out.println(message);

			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
