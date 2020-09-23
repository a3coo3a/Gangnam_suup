package quiz20;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. nextLine() 문장을 받습니다.
		 * 2. 토크나이저를 이용해서 공백 기준으로 분리
		 * 3. 토큰개수를 확인
		 * 4. 분리된 토큰에 숫자를 붙여서 세로 형태로 출력
		 * 5. 분리된 문자열을 배열에 저장
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 >");
		StringTokenizer str = new StringTokenizer(sc.nextLine());
		
		String[] strArr = new String[str.countTokens()];
		int strSize = 0;
		while (str.hasMoreTokens()) {

			strArr[strSize] = str.nextToken();
			System.out.println((strSize + 1) + ". " + strArr[strSize]);
			strSize++;
		}
		System.out.println("토큰의 갯수 : " + strSize);
		
	}
}
