package modi.constructor.pac1;

public class B {
	// 멤버변수
	// public, default는 같은 패키지라 사용가능하나
	// private는 같은 클래스가 아니라 사용이 안됨.
	A a1 = new A(1);	// public (o)
	A a2 = new A(true);	// default (o)
	A a3 = new A("가");	// private (x)
}
