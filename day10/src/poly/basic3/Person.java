package poly.basic3;

public class Person {
	String name;
	int age;

	Person() {
		this("이름미정", 1);
	}

	Person(String name) {
		this(name, 1);
//		this.name = name;
//		this.age = 1;
	}

	Person(int age) {
		this("이름미정", age);
//		this.name = "이름미정";
//		this.age = age;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}
