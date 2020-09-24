package api.util.date;

import java.util.*;
public class CalendarEx {

	public static void main(String[] args) {
		
		// Calender 컴퓨터 운영체제에 있는 달력관련 기능을 사용
		// Calender cal = new Calendar();   // 추상 클래스 객체 생성이 되지 않는다
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH)+1; 	// month는 1을 더해서 사용해야함
		System.out.println(month);
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d시 %d분 %d초",hour, minute, second);
		
		
		
	}
}
