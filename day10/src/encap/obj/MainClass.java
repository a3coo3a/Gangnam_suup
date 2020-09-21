package encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		
		// 1.
		Chef c = hotel.getChef();
		c.cooking();
		// 2.
		hotel.getChef().cooking();
		// 1,2는 같음.
		
		
		//Chef cc = new Chef();
		//hotel.setChef(cc);
		// 위와 같음
		hotel.setChef(new Chef());
		
		
	}
}
