package overriding.basic2;

public class Employee extends Person {

	String department;
	
	Employee(){}
	Employee(String pName, int pAge, String pDepartment){
		name = pName;
		age = pAge;
		department = pDepartment;
	}

	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 회사 : " + department;
	}

}
