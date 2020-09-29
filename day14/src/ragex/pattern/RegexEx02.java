package ragex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		/*
		 * 주요 정규 표현 방식
		 * \\d  : 숫자를 찾음
		 * \\d+ : 숫자여러개를 찾음
		 * \\w  : 문자를 찾음  (영문, _ )
		 * \\w+ : 문자여러개를 찾음
		 * \\W  : 문자를 찾음 (한글) : \\w외의 것들
		 * 
		 * \\d{3}   : 숫자 3개 
		 * \\d{3,4} : 숫자 3개 or 4개
		 * 
		 * [0-9] : 0~9까지 문자 1개 찾음
		 * [A-Z] : A~Z까지 문자 1개 찾음
		 * [a-z] : a~z까지 문자 1개 찾음
		 * [가-힣] : 한글 1개 찾음
		 * 
		 * [가-힣]+ : 한글 1개 이상 여러개 찾음
		 * [가-힣]* : 한글 0개 이상 여러개
		 * [가-힣]+ : 한글 0 or 1개
		 * 
		 * [A-Za-z] : 알바벳 중 1개
		 * [A-Za-z가-힣] : 영문 대,소문자, 한글 문자중 1개 찾음
		 * 
		 * 그리고 특수 문자 \? : 물음표 그 자체를 그대로 인식
		 */
		String info = "30세/서울시 강남구/02-123-4566/010-1234-4567/kkk@naver.com";
		// 1. 전화번호 형식
		// 1-1) 패턴 생성
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		// 1-2) 패턴타입으로 변경 , 정규표현엔진(정규식)을 만들어 냅니다
		Pattern p = Pattern.compile(pattern);
		// 1-3) 검증데이터,  데이터를 비교해서 Matcher클래스로 반환
		Matcher m = p.matcher(info);
		// 1-4)
		// m.find() : info문자열에서 정규표현식에 패턴에 매칭되면 true, 안되면 false 반환
		// m.group() : 찾은 값을 String으로 반환
		// m.start() : 찾은 문자열의 시작인덱스 값 (int)
		// m.end() : 찾은 문자열의 끝 인덱스 값 (int)
		while(m.find()) {
			System.out.println("시작인덱스 : " + m.start());
			System.out.println("찾은 값 : "+ m.group());
			System.out.println("끝 인덱스 : " + m.end());
		}
		
		// 2. 메일 형식
		String pattern2 = "\\w+@\\w+.\\w+";
		Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(info);
		while(m2.find()) {
			System.out.println();
			System.out.println("시작 인덱스 : " + m2.start());
			System.out.println("찾은 값 : "+m2.group());
			System.out.println("끝 인덱스 : "+m2.end());
		}
		
	}

}
