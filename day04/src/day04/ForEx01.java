package day04;

public class ForEx01 {

	public static void main(String[] args) {
		// 1~100  합
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~100의 합 : " + sum);
		
		System.out.println("----------------------------------------------");
		
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		
		
	}
}
