package poly.instanceof_;

public class Teacher extends Person{
	
	String subject;
	Teacher(){}
	Teacher(int age){
		super(age);
	}
	Teacher(String name){
		super(name);
	}
	Teacher(String name, int age){
		super(name, age);
	}
	Teacher(String name, int age, String subject){
		super(name,age);
		this.subject = subject;
	}
	String info() {
		return super.info() + ", 과목 : " + subject;
	}
	
}
