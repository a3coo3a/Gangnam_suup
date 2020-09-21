package poly.basic2;

public class MainClass {
	public static void main(String[] args) {

		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();

		System.out.println();

		Parent p = c;
		p.method1(); // 상속받은 메서드
		p.method2(); // 오버라이딩 된 메서드
		// 자식에 있던 method3은 실행 되지 않음
		// p.method3();

		System.out.println(p);
		System.out.println(c);
		System.out.println(p == c);

		System.out.println("---------------------------");

		// 다형성 적용시 자식이 원래 가지고 있던 멤버에 접근 할 수 없는 문제가 발생하는데,
		// 클래스 캐스팅으로 본래의 형태로 변경이 가능합니다.
		// 단, 다형성이 일어나지 않은 객체를 대상으로 캐스팅을 실행하면 
		// 에러가 발생한다.
		Child cc = (Child) p;
		cc.method1();
		cc.method2();
		cc.method3();
		
		Parent pp = (Parent) new Object(); //  실행시 오류 발생
	}
}
