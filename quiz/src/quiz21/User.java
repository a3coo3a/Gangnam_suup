package quiz21;

public class User {
	// 1. User클래스는 은닉된 변수로 name, age를 선언하고 생성
	// 2. User클래스를 저장할 수 있는 List생성 선언
	// 3. User개게 2개를 생성해서 리스트에 추가하세요
	// 4. list에 저장된 모든 name, age를 반복문으로 출력
	// 5. list에 홍길자가 있다면 홍길자의 이름, 나이만 출력
	// 6. list에 홍길동이 있다면 홍길도User객체 삭제
	private String name;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
