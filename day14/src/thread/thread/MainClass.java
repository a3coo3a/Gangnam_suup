package thread.thread;

public class MainClass {

	public static void main(String[] args) {

		ThreadTest t = new ThreadTest();
		t.setName("쓰레드1");	// 쓰레드 이름지정
		t.start();			// 쓰레드 실행
		
		System.out.println("main 종료");
	}

}
