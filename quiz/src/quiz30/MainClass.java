package quiz30;

public class MainClass {
	public static void main(String[] args) {
		
		ThreadTupo t1 = new ThreadTupo();
		ThreadTupo t2 = new ThreadTupo();
		ThreadTupo t3 = new ThreadTupo();
		
		t1.setName("Locaton1");
		t2.setName("Locaton2");
		t3.setName("Locaton3");
		
		t1.start();
		t2.start();
		t3.start();
	}	
}
