package generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 멤버변수를 Object 형으로 선언시,
		 * 무엇이든 저장할 수 있지만
		 * 저장했던 값을 사용할때, 타입별로 형변환을 해야 하는 문제
		 * 
		 * 그리고 잘못 형변환 하면 예외를 발생시킴.
		 * -->> 형의 불안정
		 */

		ABC abc = new ABC();
		abc.setObj("홍길자");
		String name = (String) abc.getObj(); // 꺼낼때마다 형변환을 통해야함.

		ABC p = new ABC();
		p.setObj(new Person());
		
		Person person = (Person)p.getObj();
		

	}
	
	public static class Person {
		Person(){}
	}
}
