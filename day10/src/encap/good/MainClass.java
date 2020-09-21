package encap.good;

public class MainClass {
	public static void main(String[] args) {

		MyDate me = new MyDate();

		me.setYear(0);
		me.setYear(2020);
		System.out.println("년도 : " + me.getYear());
	}
}
