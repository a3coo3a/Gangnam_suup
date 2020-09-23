package quiz20;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. 주민번호 13자리를 입력받습니다.
		 * 2. 주민번호는 -를 포함해서 받을 수 있습니다.
		 * 3. 13자리가 아니라면 다시 입력받습니다.
		 * 4. 남자인지 여자인지 구분해서 출력해주면 됩니다.
		 * 121212 1 -> index = 6
		 */
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("주민번호 입력 >");
			String ssn = sc.nextLine();
			ssn = ssn.replace("-", "");
			int mw = Integer.parseInt(String.valueOf(ssn.charAt(6)));

			if (ssn.length() == 13 && mw >= 1 && mw <= 4) {
				System.out.println(mw % 2 != 0 ? "남자" : "여자");
				break;
			} else {
				System.out.println("잘못 입력하였습니다.");
				System.out.println("다시 입력해주세요~");
			}
		}

	}
}
