package poly.basic3;

public class Employee extends Person {

	String department;
	
	Employee(){}
	Employee(int age){
		super(age);
	}
	Employee(String name){
		super(name);
	}
	Employee(String name, int age){
		super(name, age);
	}
	Employee(String name, int age, String department){
		super(name, age);
		this.department = department;
	}

	String info() {
		return super.info() + ", 회사 : " + department;
	}

}
