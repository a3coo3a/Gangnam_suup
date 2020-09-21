package day05_quiz;

import java.util.Scanner;

public class Quiz29 {
	public static void main(String[] args) {
		/*
		 * 1. 정수를 입력받으세요
		 * 2. 2중 for문을 이용하여 입력 받은 수까지 소수들의 합을 구하세요
		 * 3. 힌트) 입력 받은 수까지 반복, 내부 for문에서 외부 for문의 수까지 반복 (나누어 떨어지는 수 체크)
		 * 
		 */
		//입력
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		//처리
		for (int i = 1; i <= num; i++) {	// 소수면 합하는거
			int count = 0;
			for (int j = 1; j <= i; j++) {	// 소수인지 체크
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum += i;
			}
		}
		//출력
		System.out.println(num + "까지 소수의 합은 : " + sum);
				
		scan.close();
		
		/*
		 * i = 1, 1까지 회전
		 * i = 2, 2까지 회전
		 * i = 3, 3까지 회전
		 * i = 4, 4까지 회전
		 * i = 5, 5까지 회전
		 * i = ..., ...까지 회전
		 * i = 100, 100까지 회전
		 * 
		 */
		
		
		
		
	}
}
