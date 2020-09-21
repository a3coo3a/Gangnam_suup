package day03;

public class WhileEx01 {

	public static void main(String[] args) {
		// 반복문
		
		int a = 1;		// 제어변수 : 반복문의 횟수를 제어하는 변수
		int sum = 0;	// 합계변수 : 누적할 변수
		while (a <= 10) {
			System.out.println(a);
			sum += a;
			a++;	// 제어변수의 조작을 통해서 반복의 조건식이 언젠가 false가 되도록 처리
		}
		
		System.out.println("1~10까지의 합 : " + sum);
		
	
	}

}
