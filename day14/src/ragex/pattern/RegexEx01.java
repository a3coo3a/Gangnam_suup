package ragex.pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		// 특수문자 사용을 알리기 위해서는 \를 하나더 붙여야 함.
		
		// 전화번호 형식만 찾아서  : ***-****-****
		String info = "홍길자|30세|서울시 강남구|010-9999-1234";
		String pattern = "\\d{3}-\\d{3,4}-\\d{4}";
		
		// 매개변수에 regex인 메서드는 정규표현 패턴을 적용할 수 있다는 뜻입니다.
		String result = info.replaceAll(pattern, "***-****-****");
		System.out.println(result);
		
	
		
	}

}
