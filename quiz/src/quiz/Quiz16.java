package quiz;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		/*
		 * 1. 정수를 입력하세요
		 * 2. 입력한 정수를 구구단으로 받아 받을 수의 단수 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 > ");
		int dan = scan.nextInt();
		
		System.out.println("구구단 : " + dan + "단");
		
		int a = 1;
		
		while( a < 10 ) {
			System.out.println(dan + " x " + a + " = " + (dan * a));
			a++;
		}
		
		System.out.println();
		int b = 1;
		int sum = 0;
		while( b <= 100) {
			if(b % 3 == 0) {
				sum += b;
			}
			b++;
		}
		System.out.println("1~100까지 3의 배수의 합 : " + sum);
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}
}
