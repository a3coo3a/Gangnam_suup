package modi.constructor.pac2;

import modi.constructor.pac1.*;

public class C {
	// 멤버변수
	// public은 다른 패키지에서도 사용 가능
	// default는 다른 패키지라 사용 불가
	// private는 다른 클래스라 사용 불가
	A a1 = new A(1);	// public (o)
	//A a2 = new A(true);	// default (x)
	//A a3 = new A("가");	// private (x)
}
