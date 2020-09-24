package api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {

		Random ran = new Random();

		int x1 = ran.nextInt(); // int가 표현하는 범위(음수,양수)까지 랜덤수
		System.out.println(x1);

		int x2 = ran.nextInt(10); // 0~9까지 수 랜덤수(10미만)
		System.out.println(x2);

		double d1 = ran.nextDouble(); // 0.0 ~ 1.0 미만 실수
		double d2 = Math.random(); // 0.0 ~ 1.0 미만 실수
		
		System.out.println(d1);
		System.out.println(d2);
	}
}
