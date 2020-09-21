package str_ex;

public class MainClass {
	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1 == str2); // 같은 클래스에서 동일 문자열을 선언한 경우, 예외적으로 똑같은 String 객체를 참조한다.
		System.out.println(str1 == str3);
		
		// 같은 클래스에서 문자열을 저장하더라고, 직접 String객체 생성명령을 내리건, 다른 클래스에서 넣어온 String은 다른 주소를 가지게 됩니다.
		// 자바에서는 문자열 비교시에 String 클래스가 제공하는 equals() 메서드르 사용해서 문자열을 비교합니다.
		
		if(str1.equals(str3)) {
			System.out.println("문자열 자체가 같음");
		}
	}
}
