package quiz02;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20, 100);
		p1.info();
		
		System.out.println("-------------------------------------");
		
		Person p2 = new Person();
		p2.age = 40;
		p2.name = "김길동";
		p2.tall = 170;
		
		p2.info();
		
	}

}
