package quiz29;

public class MusicThread extends Thread{

	@Override
	public void run() {

		System.out.println("음악을 15초간 재생합니다.");
		try {
			sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("음악재생이 끝났습니다.");
	}
	
}
