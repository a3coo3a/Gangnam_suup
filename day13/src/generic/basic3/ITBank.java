package generic.basic3;

public class ITBank {

	// 제네릭 클래스를 매개변수로 받을 수 있는 메서드
	// - <?> 는 전부다 받겠다는 와일드 카드
	// - 보통은 타입을 지정해서 매개변수로 받는 편
	public void info(Course<Student> t) {
		String num = t.getNum();
		Student s = t.getStudent();

		System.out.println("번호 : " + num + ", 이름 :" + s.getName());
	}

	// 제너릭 클래스를 반환유형으로 돌려주는 메서드
	// - <V> 를 원래는 명시해야 하지만 , 보통 생략해서 사용 자동 삽입
	public <V> Course<Student> get() {

		Student s = new Student();
		s.setAge(10);
		s.setName("홍길동");

		Course<Student> c = new Course<>();
		c.setNum("1");
		c.setStudent(s);

		return c;
	}
}
