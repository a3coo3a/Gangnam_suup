package modi.member.pac2;

import modi.member.pac1.*;

public class C {
	// 다른 패키지
	public C() {
		A a = new A();
		
		a.var1 = 1;		// public (o)
		a.var2 = 1;		// default (x)
		a.var3 = 1;		// private (x)
		
		a.method1();	// public (o)
		a.method2();	// default (x)
		a.method3();	// private(x)
		
	}
}
