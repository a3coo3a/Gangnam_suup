package basic_client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {

		try {
			// new Socket(host, port)
			// 첫번째 생성자의 매개변수 : IP주소
			// 두번째 생성자의 매개변수 : PORT번호
			Socket socket = new Socket("192.168.104.27", 8383);

			// Socket클래스의 InputStream으로 서버로 부터 데이터를 받습니다.
			InputStream is = socket.getInputStream();

			// 서버로 부터 받은 데이터를 문자열 데이터로 변경해서 가지고 온것
			BufferedReader bf = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String result = bf.readLine();

			System.out.println(result);

			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
