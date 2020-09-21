package day08;

// 설계도 클래스 - 메인이 없음.
public class Pen {
	
	// 클래스의 속성을 나타내는 것을 멤버 변수라고 함.
	String color;
	int price;
	String company;
	
	
	// 클래스의 기능을 나타내는 것을 메서드라고 함.
	void write() {
		System.out.println(color + "색상 글씨를 좋아합니다.");
	}
	void info() {
		System.out.println("----- 펜 정보 ------");
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("회사 : " + company);
		
	}
}
