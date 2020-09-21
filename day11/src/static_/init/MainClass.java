package static_.init;

public class MainClass {
	public static void main(String[] args) {
		
		// 클래스가 호출될 때 정적초기화자는 단 한번만 호출됩니다.
		// static 키워드의 특징입니다.
		
		
		System.out.println(Computer.company);
		Computer c1 = new Computer(1000);
		Computer c2 = new Computer(2000);
		Computer c3 = new Computer(3000);
		
		
	}
}
