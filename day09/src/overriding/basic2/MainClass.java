package overriding.basic2;

public class MainClass {
	public static void main(String[] args) {

		Person p = new Person("hong", 5);
		System.out.println(p.info());

		Student s = new Student("홍길동", 10, "111");
		System.out.println(s.info());

		Teacher t = new Teacher("홍길자", 20, "수학");
		System.out.println(t.info());
		
		Employee e = new Employee("개똥이", 30, "모나미");
		System.out.println(e.info());
		
	
	}
}
