package inherit.good;

public class Employee extends Person {

	String department;

	String info() {
		return "이름 : " + name + ", 나이 : " + age ;
	}

}
