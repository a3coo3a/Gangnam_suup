package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {

		// String str = new String("~~~~~");
		// String str = "~~~~~";
		// char[] arr = { 'h', 'e', 'l', 'l', 'o' };
		// String str = new String(arr);
		//
		// System.out.println(str);

		// charAt() - 문자열 인덱스번호 자르기
		String str = "안녕하세요";
		char a1 = str.charAt(0);
		System.out.println(a1);

		// indexof() - 앞에서 부터 문자열을 찾아서 인덱스 반환
		int index = str.indexOf("안");
		System.out.println(index);

		// lastIndexof() - 뒤에서 부터 문자열을 찾아서 인덱스 반환
		int index2 = str.lastIndexOf("안");
		System.out.println(index2);

		// length() - 길이
		System.out.println("문자열 길이 : " + str.length()); // 5

		// replace() - 특정문자열 변경
		String str2 = "자바의 유래를 아시나요? 자바는 커피집 이름입니다.";
		System.out.println(str2.length());
		// String str3 = str2.replace("자바", "java");
		// str2 = str2.replace("자바", "java");
		// System.out.println(str3);
		// System.out.println(str2);

		// 공백을 없애려면 " " -> ""
		// str2 = str2.replace(" ", "");
		// System.out.println(str2);

		str2 = str2.replace("자바", "java").toString().replace(" ", ""); // 함수형 언어
		System.out.println(str2);

		// subString() - 문자열 자르기
		String str3 = "123123-4564564";
		String a5 = str3.substring(7); // 매개 값을 하나 주면 앞 문자열의 제거
		System.out.println(a5);

		String a6 = str3.substring(7, str3.length()); // 매개 값을 2개 주면 문자열 추출
		System.out.println(a6);

		// toUpperCase() - 대문자로 변경  // toLowerCase() - 소문자로 변경
		String str4 = "hello jack";
		str4 = str4.toUpperCase();
		System.out.println(str4);
		
		// trim() - 앞뒤 공백 제거
		String str5 = "      홍길동   ";
		System.out.println(str5);
		str5 = str5.trim();
		System.out.println(str5);
		
		// valueOf() - 기본타입을 문자열로 변환해주는 역할
		System.out.println(1+1);
		System.out.println(String.valueOf(1)+1);
		
		// split() - 문자열 자르기
		String str6 = "010-1234-5678";
		String[] arr = str6.split("-");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str6.split("-", -2);	// 최대 배열
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
