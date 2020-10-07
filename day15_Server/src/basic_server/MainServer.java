package basic_server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {

		try {
			// port번호를 생성자로 입력
			// ip : 네트워크 통신함에 있어 특별한 고유한 나만의 식별 주소
			// port : 고유한 프로그램 번호

			// 서버소켓 생성(포트번호 8383)
			ServerSocket serversocket = new ServerSocket(8383);

			// accept() : 클라이언트의 연결 요청을 대기
			// 즉, 클라이언트에서 해당 8383포트로 연결요청이 들어오면, accept가 대기를 해제하고
			// 클라이언트와 연결시키는 Socket클래스를 생성해서 반환
			System.out.println("------ 연결 대기 ------");
			Socket socket = serversocket.accept();

			// Socket클래스에 있는 출력 스트림을 얻는 코드
			OutputStream os = socket.getOutputStream(); // 쓰는애

			// 메시지를 바이트 형태로 바꿔서 접속한 클라이언트에 전달
			String msg = "써버에서 보낸 메시지";
			os.write(msg.getBytes());

			serversocket.close();
			socket.close();
			System.out.println("------ 연결 해제 ------");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
