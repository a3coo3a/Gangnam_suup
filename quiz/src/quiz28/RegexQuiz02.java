package quiz28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		/* 상품번호, GS25, (도시락명), 가격 으로 분리해서 출력 */

		String str = "123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "111111-2222222 GS25(마늘햄쌈) 5,500원";
		String str3 = "222222-3333333 MINISTOP(제육볶음) 5,500원";

		String[] strArr = { str, str2, str3 };
		String[] name = { "상품번호 :\t", "매장명 :\t", "도시락명 :\t", "가격 :\t" };
		String[] pattern = { "\\d{6}-\\d{7}", "[A-Z]+([0-9]+|)", "\\([가-힣]+\\)", "\\d+,*\\d+원" };

		for (int j = 0; j < strArr.length; j++) {
			for (int i = 0; i < pattern.length; i++) {
				Matcher m = Pattern.compile(pattern[i]).matcher(strArr[j]);
				while (m.find()) {
					if(i == 2) {
						System.out.println(name[i] + m.group().replace("(", "").replace(")", ""));
					}else {
						System.out.println(name[i] + m.group());
					}
				}
			}
			System.out.println();
		}

	}

}
