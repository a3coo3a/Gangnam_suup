package day04_quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		
		/*
		 * 0을 입력 받을때까지 회전
		 * 입력 받은 수들의 합계
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		int i;
//		int sum = 0;
//		System.out.print("정수 입력 > ");
//		
//		while( (i = scan.nextInt()) != 0 ) {
//			System.out.print("정수 입력 > ");
//			sum += i; 
//		}
//		
//		System.out.println("입력한 정수의 합 : " + sum);
		
		int i = 1;
		int sum = 0;
		while(i != 0) {
			System.out.print("정수 입력 >");
			i = scan.nextInt();
			sum += i;
		}
		
		System.out.println("입력한 정수의 합 : " + sum);
		
		scan.close();
	}
}
