package thread.runable;

public class ThreadTest implements Runnable {
	// 1st Runnable 인터페이스 상속
	// 쓰레드의 기능을 사용하고 싶다면, Thread클래스의 static로 사용
	@Override
	public void run() {
		// 현재 실행되고 있는 스레드의 이름
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("쓰레드 시작 1");

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);	// 1초 stop
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("쓰레드 종료 1");
	}

}
