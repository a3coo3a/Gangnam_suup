package inter.basic;
/*
 *  1. 인터페이스의 구현(상속) 키워드는 implements입니다.
 *  2. 인터페이스의 선언된 추상메서드는 반드시 자식클래스에서 오버라이딩 해야 합니다.
 *  3. 인터페이스는 다중 상속이 가능합니다.
 */
public class Basic implements Inter1, Inter2{

	@Override
	public void method1() {
		System.out.println("재정의된 1번 메서드 호출");
	}

	@Override
	public void method2() {
		System.out.println("재정의된 2번 메서드 호출");
	}
	public void method3() {
		System.out.println("Basic 클래스의 메서드 호출");
	}
	
}
