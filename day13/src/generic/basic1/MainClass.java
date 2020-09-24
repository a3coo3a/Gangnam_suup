package generic.basic1;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 제네릭
		 * - 객체 생성시 타입 지정
		 * - 다목적 형태의 클래스를 안전하게 사용가능
		 * - 생성자의 제네릭 타입은 생략이 가능
		 * - 객체생성시 형이 지정되어 get으로 사용시 별도 형변환 필요 없음	-> 형의 안정
		 * - 기본형은 <> 를 사용할 수 없다 -> 래퍼클래스를 사용해서 사용가능 	
		 * 	ex) <int> (x)  ->  <Integer> (o) 
		 * 
		 */
		
		ABC<String> abc = new ABC<>();	// 생성자의 제네릭타입은 생략이 가능

		abc.setT("홍길자");
		String name = abc.getT();		// string 형으로 지정되었기에 별도 형변환 필요 없음.
		
		//ABC<int> abc2 = new ABC<int>();
		ABC<Integer> abc2 = new ABC<Integer>();
		abc2.setT(1);
		
		int num = abc2.getT();
		
		ABC<Person> abc3 = new ABC<>();
		
		abc3.setT(new Person());
		Person person = abc3.getT();
		
		
	}

}
