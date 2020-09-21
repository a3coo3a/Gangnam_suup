package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart mycart = new MyCart(10000);
		
		mycart.buy("com");
		mycart.buy("tv");
		mycart.buy("dmb");
	}
}
