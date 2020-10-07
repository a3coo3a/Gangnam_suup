package thread.ex0;

public class MainClass {

	public static void main(String[] args) {

		// 객체 2개, 쓰레드 2개 : 각각 실행
		// ThreadTest t1 = new ThreadTest();
		// ThreadTest t2 = new ThreadTest();
		//
		// Thread thread1 = new Thread(t1, "A");
		// Thread thread2 = new Thread(t2, "B");
		//
		// thread1.start();
		// thread2.start();
		//
		// System.out.println("main end");

		// 객체 1개, 쓰레드 2개 : 공유하며 실행
		ThreadTest t1 = new ThreadTest();

		Thread thread1 = new Thread(t1, "A");
		Thread thread2 = new Thread(t1, "B");

		thread1.start();
		thread2.start();

		System.out.println("main end");
	}

}
