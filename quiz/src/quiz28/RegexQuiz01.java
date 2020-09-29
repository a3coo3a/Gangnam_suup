package quiz28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		/*
		 * 가격 형식만을 찾아서 순서대로 출력 : 4,500/1,200/6000/120000
		 */
		String str = "헠4,500원 헿~1,200원 엏? 6000원윀 120000원";
		String pattern = "[0-9]+(,|)\\d+원";			//(,|) 대신 ,* 해도 됨. ,* : ,가 0개 일 수도 있고 그 이상일 수도 있다.

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		
		System.out.print("찾는값 : ");
		while(m.find()) {
			System.out.print(m.group() + " ");
		}
		
	}

}
