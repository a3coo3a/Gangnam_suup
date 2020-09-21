package quiz03;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 현실에서 찾아볼 수 있는 물건 등을 생각해서 클래스로 표현
		 * 멤버변수 2개 이상, 메소드 2개 이상
		 */
		
		Cafe star = new Cafe("아메리카노", 4500, "유자차", 6000, "치즈케이크", 5900);
		Cafe ediya = new Cafe("아메리카노", 3000, "유자차", 3500, "치즈케이크", 4500);
		
		star.pay("아메리카노", 2, 10000);
		ediya.pay("유자차", 1, 5000);
		
	}
	

}
