package quiz02;

public class Person {
	String name;
	int age;
	int tall;

	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	// 프로그래머가 인위적으로 생성자를 만들면, 기본 생성자를 자동으로 만들어 주지 않습니다.
	Person() {
	}

	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키 : " + tall);
	}

}
