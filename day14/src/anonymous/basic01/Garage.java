package anonymous.basic01;

interface Car{
	public void run();
}

class Tico implements Car{

	@Override
	public void run() {
		System.out.println("Tico 달려~~~");
	}
	
}

public class Garage{
	
	//public Car car = new Tico();
	
	public Car car = new Car() {
		
		@Override
		public void run() {
			System.out.println("익명이 달려~~~");
		}
	};
	
	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.car.run();
		
		
		
		
	}// main end
}// Garage end
