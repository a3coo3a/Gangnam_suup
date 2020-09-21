package day04;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		// 입력을 10번 받는다.
		// 입력 받은 값들의 합
		Scanner scan = new Scanner(System.in);

		int i = 1;
		int sum = 0;
		while(i <= 10) {
			System.out.print("정수 입력 > ");
			// sum += scan.nextInt();  이렇게도 가능
			int num = scan.nextInt();
			sum += num;
			i++;
		}
		System.out.println("합계 : " + sum);
		
		scan.close();
	}

}
