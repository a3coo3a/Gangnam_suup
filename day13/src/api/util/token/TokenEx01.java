package api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {

	public static void main(String[] args) {
			
		// StringTokenizer 클래스 : 특정문자기준으로 문자열을 잘라서 사용
		// 아무 전달 없을 시 > 공백 기준으로 배열을 잘라서 보관 순서가 없음. 인덱스 번호를 통한 사용이 안됨.
		String str1 = "오늘 날씨는 맑고, 매우 시원합니다";
		String str2 = "2020/09/23";
		
		StringTokenizer token1 = new StringTokenizer(str1);
		
		System.out.println(token1.countTokens());	// 토큰 사용전에 몇개의 토큰이 있는지 확인
		
//		System.out.println(token1.nextToken());	// 한번 건너가면 돌아갈 수 없음.
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());	// 다음이 없어 에러 발생
//		
		// 다음이 있어야 넥스트로 전달하는 방법이 함께 따라가야함.
		// hasMoreTokens - 있으면 : true, 없으면 : false
		// 순서가 없는 데이터들의 특징 : 다음이 있는지를 확인해야 함.
		while (token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		
		System.out.println("----------------------------------");
		
		// 구분자를 활용하여 자르는 경우
		// '/'기준으로 자르겠다!
		StringTokenizer token2 = new StringTokenizer(str2,"/");
		while (token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
	}

}
