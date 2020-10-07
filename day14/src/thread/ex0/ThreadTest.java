package thread.ex0;

public class ThreadTest implements Runnable {

	int num = 0;
	// 기존 순차적 실행 -> 동기화하다
	// 스레드적 실행 -> 비동기화하다

	// synchronized : 동기화하다
	// 하나의 쓰레드가 끝날때까지 다른 쓰레드를 실행시키지 않는다.
	// 하나의 쓰레드가 끝난 후 다른 쓰레드를 실행시킨다.
	@Override
	public synchronized	void run() {
		for (int i = 1; i <= 10; i++) {
			// 현재돌고 있는 쓰레드 이름이 A면,
			if (Thread.currentThread().getName().equals("A")) {
				num++;
			}
			System.out.println("현재 쓰레드: " + Thread.currentThread().getName() + ", num : " + num);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} // for end

	}// run end

}// class end
