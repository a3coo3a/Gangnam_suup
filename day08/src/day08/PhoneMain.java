package day08;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone black = new Phone();
		black.info();
		
		Phone white = new Phone("화이트");
		white.info();
		
		Phone red = new Phone("빨강", 500000);
		red.info();
		
		// Phone에 모든 멤버변수를 받는 생성자를 생성
		// green, 1000000, 아이폰으로 객체를 생성
		
		Phone ph = new Phone("green", 1000000, "아이폰");
		ph.info();
	}
}
