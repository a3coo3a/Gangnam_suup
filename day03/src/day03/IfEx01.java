package day03;

public class IfEx01 {

	public static void main(String[] args) {
		// 0 ~ 100 까지 정수
		int point = (int)(Math.random()*101);
		
		System.out.println("점수는 : " + point);
		
		if (point >= 60) {
			System.out.println("60점 이상입니다!");
			System.out.println("축하합니다!");
		} else {
			System.out.println("60점 미만입니다");
			System.out.println("불합격입니다");
		}
		
		// if~else구문은 3항 연산식으로도 쓸 수 있다.
		
		
	}

}
