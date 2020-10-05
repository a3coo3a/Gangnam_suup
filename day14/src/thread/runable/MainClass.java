package thread.runable;

public class MainClass {

	public static void main(String[] args) {
		// 메인과 스레드 클래스가 따로 도는 것을 확인 할 수 있다.

		ThreadTest t = new ThreadTest();

		Thread thread = new Thread(t, "쓰레드1"); // 동작시킬 클래스, 이름

		thread.start();
		
		System.out.println("메인 종료");
	}

}
