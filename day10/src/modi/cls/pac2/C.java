package modi.cls.pac2;

// 다른 패키지이므로 import 해줘야 함.
import modi.cls.pac1.*;

public class C {
	// A는 default 클래스이므로 다른 패키지는 사용 불가
//	A a = new A();
	// B는 public 클래스이므로 다른 패키지에서 사용 가능
	B b = new B();
}
