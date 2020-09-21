package abs.good;

// 불완전한 추상메소드를 품기위해 클래스 또한 추상클래스가 되어야 함.
public abstract class HeadStore {	// 부모클래스 (본점)
	
	// 일반적으로 클래스가 갖는 
	// 멤버변수, 멤버메소드, 생성자 모두 가능함.
	private String name = "호식이 두마리 과일가게";
	
	public HeadStore(){
		
	}
	
	public String getName() {
		return name;
	}
	
	// 메뉴의 가격을 지점마다 다름
	// 추상메소드 : 부모클래스에서 명시된 메서드는 반드시 자식 클래스에서 각각 오버라이딩 해야 하는 경우
	public abstract void apple(); 
	public abstract void bnanan();
	public abstract void melon(); 
	public abstract void orange(); 
	
	
	
	/*
	 * 1. 메서드의 abstract를 붙이면 추상메서드가 됩니다.
	 *	 이 메서드는 상속을 통해서 반드시 오버라이딩 되어야 합니다.
	 * 2. 추상메서드는 {}가 없는 메서드의 선언입니다.
	 * 	추상 메서드가 하나라도 있으면, 클래스도 추상클래스가 되어야 합니다.
	 * 
	 */
}


