package quiz20;

public class MathQuiz01 {
	/*
	 * 올림 매서드를 이용해서 1-10이 전달되면 1이 반환되는 page() 생성
	 * 11-20값이 전달 되면 2가 반환
	 * .......
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(page(2));
		System.out.println(page(10));
		System.out.println(page(11));
		System.out.println(page(20));
		System.out.println(page(31));
		System.out.println(page(40));
		
		

	}

	public static int page(int num) {

		return (int) Math.ceil(num / 10.0);
	}
}
