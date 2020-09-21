package day02;

public class TextEx {

	
	public static void main(String[] args) {
		
		// 단일 문자형
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		
		// 문자를 통일하기 위해서 유니코드의 등장 -> 2byte의 크기로 확장하고 65536개 표현가능
		
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c3);
		System.out.println(c4);
		
		char c5 = '\uAC00';		// 유니코드의 형태 표현
		
		System.out.println(c5);
		System.out.println();
		System.out.println(c3 + c4 + c5);
		System.out.println(c3 +"" + c4 + "" + c5);
		System.out.println();
		
		// 문자열
		String s1 = "hello~!";
		String s2 = "my name is park~";
		
		System.out.println(s1 + s2);
		
		// 문자열에 다른 형의 데이터 타입이 붙으면 문자열로 우선인식 
		
		// 문자열과 다른 데이터 타입의 + 연산
		System.out.println(100 + 300);
		System.out.println("100" + 300);  // 문자열에는 다른 타입이 붙으면 >> 결과는 문자열
		System.out.println(100 + 300 + "world");
		System.out.println("hello" + 100 + 300);
		
		System.out.println("A" + 100);
		System.out.println('A' + 100);	// 자료형이 큰쪽으로 자동 형변환 
		
		
		
		
	}
}
