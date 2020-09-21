package overriding.basic2;

public class Person {
	String name;
	int age;

	Person(){}
	Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}
