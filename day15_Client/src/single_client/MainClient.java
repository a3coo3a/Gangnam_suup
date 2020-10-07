package single_client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClient {

	public static void main(String[] args)  {
		try{
			
			Socket socket = new Socket("192.168.104.27",8383);
			
			//메시지 전송클래스
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