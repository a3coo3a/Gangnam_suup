package api.lang.math;

public class MathEx {
	public static void main(String[] args) {

		// 랜덤수
		double d = Math.random();
		System.out.println(d);

		// 올림
		double d1 = Math.ceil(1.1);
		System.out.println(d1);

		// 내림
		double d2 = Math.floor(1.5);
		System.out.println(d2);

		// 반올림
		double d3 = Math.round(1.5);
		System.out.println(d3);

		// 절대값
		int d4 = Math.abs(-10);
		System.out.println(d4);
		
		// 최대 값
		int d5 = Math.max(5, 10);
		System.out.println(d5);
		
		
	}
}
