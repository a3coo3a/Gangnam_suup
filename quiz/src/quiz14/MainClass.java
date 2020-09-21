package quiz14;

public class MainClass {

	public static void main(String[] args) {
		Computer com = new Computer();
		Tv tv = new Tv();
		Radio radio = new Radio();
		
		MyCart my = new MyCart(10000);
		
		my.buy(tv);
		my.buy(radio);
		my.buy(com);
		my.buy(tv);
	}
}
