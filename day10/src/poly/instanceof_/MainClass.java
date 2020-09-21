package poly.instanceof_;

public class MainClass {
	public static void main(String[] args) {

		Person hong = new Student("홍길동", 20, "123");
		Person lee = new Teacher("이승철", 50, "음악");
		Person choi = new Employee("최강창민", 20, "건물주");

		printInfo(hong);
	}

	public static void printInfo(Person p) {

		// instanceof 는 클래스 캐스팅 전에 실제 클래스 타입을 확인하기 위해 사용합니다.
		// 부모타입은 가장 마지막에 확인해요. 

		// p?? 캐스팅을 위한 객체 확인 필요
		if (p instanceof Teacher) {
			Teacher t = (Teacher) p;
			System.out.println(t.info());
		} else if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println(s.info());
		} else if (p instanceof Employee) {
			Employee e = (Employee) p;
			System.out.println(e.info());
		} else {
			System.out.println(p.info());
		}

	}// printInfo end

}
