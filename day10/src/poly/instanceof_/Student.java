package poly.instanceof_;

public class Student extends Person {

	String studentId;
	
	Student(){
		
	}
	Student(int age){
		super(age);
	}
	Student(String name){
		super(name);
	}
	Student(String name, int age){
		super(name,age);
	}
	Student(String name, int age, String studentId){
		super(name, age);
		this.studentId = studentId;
	}

	String info() {
		return super.info() + ", 학번 : " + studentId;
	}

}
