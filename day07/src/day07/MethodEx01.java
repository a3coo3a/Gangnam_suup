package day07;

public class MethodEx01 {

	public static void main(String[] args) {

		/*
		 * 메서드는 메서드 내부에 선언 할 수 없습니다. main밖에, 클래스 안 어디서든 선언할 수 있습니다 사용은 main에서 사용한다!
		 */

		// 메서드의 호출
		// calSum();

		System.out.println("1~10까지의 합 : " + calSum());
		int result = calSum();
		System.out.println("1~10까지의 합 : " + result);

		System.out.println(randomStr());
		String result2 = randomStr();
		System.out.println(result2);

		System.out.println(randomStr2());

	} // main end

	// 메서드 선언
	static int calSum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}// calSum end

	static String randomStr() {

		String str = "";
		for (char i = 'A'; i <= 'Z'; i++) {
			str += i;
		}

		return str;
	}

	static String randomStr2() {


		double d = Math.random();
		String str = "";

//		if (d > 0.66 ) {
//			str = "가위";
//		}else if (d > 0.33) {
//			str = "바위";
//		}else {
//			str = "보";
//		}
//		
//		return str;

		if (d > 0.66) {
			return "가위";
		} else if (d > 0.33) {
			return "바위";
		} else {
			return "보";
		}

	}

	
	
}
