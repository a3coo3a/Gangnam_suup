package generic.basic3;

public class MainClass {

	public static void main(String[] args) {
		
		// ITBank 안에 있는 두가지 메서드 사용
		Student s = new Student("홍가",20);
		Course<Student> c = new Course<>();
		c.setNum("100");
		c.setStudent(s);
		ITBank it = new ITBank();
		it.info(c);
		Course<Student> c1 = it.get();
		it.info(c1);
		
		
	}

}
