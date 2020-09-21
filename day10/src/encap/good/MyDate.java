package encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn; // 주민번호

	// 은닉된 변수에 접근할 때는 클래스 설계자가 미리 만들어 놓은
	// getter, setter를 이용합니다.

	// setter메서드 선언
	// 1. 은닉 변수의 값을 저장하기 위한 메서드
	// 2. 접근제어자 : public
	// 3. 이름 : set+멤버변수명 (카멜표기법)

	public void setYear(int year) {
		if (year < 1 || year > 2020) {
			System.out.println("잘못된 값 입력입니다.");
		} else {
			this.year = year;
		}
	}

	// getter메서드 선언
	// 1. 은닉변수의 값을 조회하는 메서드
	// 2. 접근제어자 : public
	// 3. 이름 : get+멤버변수명 (카멜표기법)

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("잘못된 값 입력입니다.");
		} else {
			this.month = month;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		if (day < 1 || day > 31) {
			System.out.println("잘못된 값 입력입니다.");
		} else {
			this.day = day;
		}
	}

	public int getDay() {
		return day;
	}

	public void setSsn(String ssn) {
		if (ssn.length() > 13 || ssn.length() < 1) {
			System.out.println("잘못 입력하였습니다.");
		} else {
			this.ssn = ssn;
		}
	}

	public String getSsn() {
		return ssn;
	}

	public void info() {
		System.out.println("생일 : " + year + "년 " + month + "월 " + day + "일");
		System.out.println("주민번호 : " + ssn);
	}

}
