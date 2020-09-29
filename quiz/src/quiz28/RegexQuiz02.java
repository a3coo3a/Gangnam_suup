package quiz28;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		/*
		 * 상품번호, GS25, (도시락명), 가격 으로 분리해서 출력
		 */

		String str = "123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "111111-2222222 GS25(마늘햄쌈) 5,500원";
		String str3 = "222222-3333333 MINISTOP(제육볶음) 5,500원";

		String[] strArr = {str, str2, str3};
		
		String[] pattern = { "\\d{6}-\\d{7}", "[A-Z]+(|[0-9]+)", "([가-힣]+)", "\\d+,*\\d+원" };
	
//		String numPattern = "\\d{6}-\\d{7}";
//		String storePattern = "[A-Z]+\\d+*";
//		String proPattern = "([가-힣]+)";
//		String pricePattern = "\\d+,*\\d+원";
		Pattern[] p = new Pattern[4];
		for (int i = 0; i < pattern.length; i++) {
			p[i] = Pattern.compile(pattern[i]);
		}
//		Pattern numP = Pattern.compile(numPattern);
//		Pattern storeP = Pattern.compile(storePattern);
//		Pattern proP = Pattern.compile(proPattern);
//		Pattern priceP = Pattern.compile(pricePattern);
		List<Matcher> m = new ArrayList<>();
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < p.length; j++) {
				m.add(p[i].matcher(strArr[i]));
			}
		}
		
		
		

	}

}
