package quiz30;

public class ThreadTupo extends Thread {
	int num = 0;
	String star = "";

	@Override
	public void run() {

		while (true) {
			num += (int) (Math.random() * 10) + 1;
			star = "";
			for (int i = 0; i < num; i++) {
				star += "*";
			}

			if (num >= 100) {
				num = 100;
				System.out.println(getName() + "개표율" + num + "%:" + star);
				System.out.println(getName() + "의 개표가 완료되었습니다.");
				break;
			} else {
				System.out.println(getName() + "개표율" + num + "%:" + star);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // if end

		} // while end

	}// run end

}// class end
