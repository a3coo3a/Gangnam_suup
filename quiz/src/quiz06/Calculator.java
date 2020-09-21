package quiz06;

public class Calculator {
	int result;
	double pi;

	void add(int a) {// - result에 값을 누적시키는 기능
		result += a;
		show();
	}

	void sub(int a) { // - result에 값을 차감시키는 기능
		result -= a;
		show();
	}

	void multi(int a) {// - result에 값을 곱하기 기능
		result *= a;
		show();
		
	}

	void div(int a) {// - result에 값을 나누는 기능
		result /= a;
		show();
		
	}

	double circle(int a) {// - pi를 이용해서 원의 넓이를 구하는 기능
		 pi = 3.14;
		return a*a*pi;
	}
	void show() {
		
		System.out.println("결과값 : " + result);
	}
	void show(double a) {
		System.out.printf("결과값 : %.2f\n", a);
	}
}
