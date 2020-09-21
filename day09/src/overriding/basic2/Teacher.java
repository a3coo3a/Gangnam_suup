package overriding.basic2;

public class Teacher extends Person{
	
	String subject;
	Teacher(){}
	Teacher(String pName, int pAge, String pSubject){
		name = pName;
		age = pAge;
		subject = pSubject;
	}
	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 과목 : " + subject;
	}
	
}
