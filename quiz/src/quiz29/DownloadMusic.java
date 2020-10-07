package quiz29;

public class DownloadMusic extends Thread {
	public void run() {
		System.out.print("동영상을 다운로드 합니다:");
		for (int i = 1; i <= 15; i++) {
			System.out.print("*");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // for end

		System.out.println("\n다운로드가 완료되었습니다.");
	}
}
