package modi.member.pac1;

public class B {
	// 다른 클래스 
	public B() {
		A a = new A();
		
		a.var1 = 1;		// public (o)
		a.var2 = 1;		// default (o)
		//a.var3 = 1;		// private (x)
		
		a.method1();	// public (o)
		a.method2();	// default (o)
		//a.method3();	// private(x)
		
	}
	
	// 명령문들은 {}안에 있어야 함
}
