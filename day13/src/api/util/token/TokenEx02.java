package api.util.token;

import java.util.StringTokenizer;

public class TokenEx02 {

	public static void main(String[] args) {

		String log = "2020.09.23, /bno=30, user=홍길동";

		StringTokenizer token1 = new StringTokenizer(log, ",./ "); // 자르고픈 구분자를 연속적으로 작성할 수도 있음.

		while (token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		System.out.println();
		
		// true : 구분자를 살리는 경우, false : 구분자를 없애는 경우
		StringTokenizer token2 = new StringTokenizer(log, ",", true);	
		while (token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		
		
		
		
	}
}
