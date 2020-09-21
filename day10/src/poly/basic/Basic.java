package poly.basic;

// 자바에서 하나의 클래스 파일에 여러클래서 선언 가능합니다.
// 단, 파일명과 동일한 클래스가 존재해야 하고, 파일명과 동일한 클래스면 public이면 됩니다.
class A {}				//		A
class B extends A {}	//    /	  \
class C extends A {}	//   B     C
class D extends B {}	//  /       \
class E extends C {}	// D		 E

public class Basic {
	/*
	 * 다형성
	 * 	- 자식 객체가 부모타입을 가질 수 있는 성질, 상속 관계를 가지고있어야 합니다.
	 */

	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	int x = 1;
	double y = x;  	// int -> double 형변환
	
	A a1 = b;		// B -> A 형변환
	A a2 = c;
	A a3 = new D();
	A a4 = new E();
	
	// 상속이 아닌 관계는 다형성 적용이 불가능
	// B b1 = new E();	
	
	// Object 클래스 타입은 뭐든지 다 담을수 있다.
	Object o1 = a;
	Object o2 = "문자열";
	Object o3 = 1;
	
	




}
