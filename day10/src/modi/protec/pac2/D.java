package modi.protec.pac2;

import modi.protec.pac1.*;

public class D extends A{
	// 다른 패키지 상속관계
	public D() {
		super();
		super.bool = true;
		super.method();
		
		// super를 통한 참조만 가능 
		A a = new A();
		a.bool = true;
		a.method();
	}
}
