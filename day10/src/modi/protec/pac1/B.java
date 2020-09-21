package modi.protec.pac1;

public class B {
	// 같은 패키지
	public B() {
		A a = new A();
		a.bool = true;
		a.method();
	}
}
