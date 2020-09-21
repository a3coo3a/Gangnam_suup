package overriding.basic2;

public class Student extends Person {

	String studentId;
	Student(){}
	Student(String pName, int pAge, String pStudentId){
		name = pName;
		age = pAge;
		studentId = pStudentId;
	}

	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId;
	}

}
