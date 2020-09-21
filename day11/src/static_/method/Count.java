package static_.method;

public class Count {
	public int a;
	public static int b;
	
	// 일반 메서드 - 일반멤버변수, 정적멤버변수 모두 사용이 가능
	public int method1() {
		a = 10;
		return ++b;
	}
	
	// 정적 메서드
	// - static이 붙은 변수나 메서드만 사용이 가능,
	// - 단, 객체 생성을 통해서는 일반 변수도 사용이 가능.
	public static int method2() {
		// a를 사용하기 위해서 Count 객체 생성
		Count c = new Count();
		
		c.a = 10;		// 일반 멤버변수 사용불가 : 메서드는 사용할수 있을때 a가 생성이 안되어 있을 수도 있어서
		
		return ++b;	// 정적 멤버변수 사용가능
	}
	
}
