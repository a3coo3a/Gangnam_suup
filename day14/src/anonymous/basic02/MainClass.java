package anonymous.basic02;

public class MainClass {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.getRemote().volumeUp();
		com.getRemote().volumeDown();
		
		Tv tv = new Tv();
		tv.getRemote().turnOn();
		tv.getRemote().turnOff();
	}
}
