package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(date));
		
		System.out.println("----------------------------------");
		
		sdf.applyPattern("yyyyMMdd");		// 변경된 패턴 적용
		System.out.println(sdf.format(date));
		
		System.out.println("----------------------------------");

		sdf.applyPattern("");
	}

}
