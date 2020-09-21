package modi.constructor.pac1;

public class A {
	// 멤버변수	
	A a1 = new A(1);
	A a2 = new A(true);
	A a3 = new A("가");
	
	// 생성자
	public A(int i) {}
	A(boolean b) {}
	private A(String s) {}
	
	// private
	// - 외부에서 객체를 생성하지 못하도록 할때 주로사용
}
