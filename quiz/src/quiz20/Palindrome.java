package quiz20;

import java.util.Scanner;

public class Palindrome {
	/*
	 * Palindrome클래스에 palindromeCheck()함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
	 * 2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
	 * 3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
	 * 4. 문장은 공백을 포함하여 받을 수 있습니다.
	 * 5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
	 * 6. 힌트)
	 * 함수를 이용하여 공백을 제거하세요. 힌트: replace()
	 * 문장의 길이의 중간값을 구하세요.
	 * 중간을 중심으로 앞, 뒤 문자열을 자르세요. 힌트 :substring()
	 * for문에서 charAt()을 사용해서 반대로 잘라 붙이세요. (or 빌더를 이용 하여 문자를 뒤집어 비교)
	 */
	public static void palindromeCheck(String message) {
		message = message.replace(" ", "");
		String str1, str2, chStr2 = "";
		str1 = message.substring(0, message.length() / 2);

		if (message.length() % 2 == 0) { // 짝수
			str2 = message.substring(message.length() / 2);

			for (int i = 0; i < str2.length(); i++) {
				chStr2 += str2.charAt(str2.length() - i - 1);
			}
			System.out.println(str1.equals(chStr2) ? "회문입니다." : "회문이 아닙니다.");
			System.out.println("==================================");

		} else { // 홀수
			str2 = message.substring(message.length() / 2 + 1);

			for (int i = 0; i < str2.length(); i++) {
				chStr2 += str2.charAt(str2.length() - i - 1);
			}
			System.out.println(str1.equals(chStr2) ? "회문입니다." : "회문이 아닙니다.");
			System.out.println("==================================");
		}

	}

	public static void myCheck(String str) {
		String chStr = str.replace(" ", "");
		int left = 0;
		int right = str.length() - 1;
		for (int i = 0; i < str.length() / 2; i++) {
			chStr = chStr.replace(String.valueOf(chStr.charAt(left)), String.valueOf(chStr.charAt(right)));
			left++;
			right--;
		}

		System.out.println(chStr.equals(str) ? "회문입니다" : "회문이 아닙니다.");
	}

	public static void myCheck2(String str) {
		str = str.replace(" ", "");
		int left = 0;
		int right = str.length() - 1;
		boolean ch = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(left) == str.charAt(right)) {
				left++;
				right--;
			} else {
				ch = false;
			}
		}
		System.out.println(ch ? "회문입니다." : "회문이 아닙니다.");
	}

	public static String samCheck(String word) {
		word = word.replace(" ", "");
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				return "회문이아닙니다";
			}
		}
		return "회문입니다";
	}
	public static String strBufferCheck(String word) {
		
		return new StringBuffer(word).reverse().toString().replace(" ", "").equals(word.replace(" ", ""))? "회문입니다" :"회문이 아닙니다";
	}

	public static String setMessage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("※ 회문 확인 글자 입력  ");
		System.out.print("(종료를 원하면 \"종료\" 입력) >");
		return sc.nextLine();
	}
}
