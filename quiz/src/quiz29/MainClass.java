package quiz29;

public class MainClass {

	public static void main(String[] args) {


		MusicThread mt = new MusicThread();
		DownloadMusic dm = new DownloadMusic();
		
		mt.start();
		dm.start();
	}

}
