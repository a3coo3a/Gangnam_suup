package quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * 1. 수를 입력받아(scanner) 짝수, 홀수를 구분하여 출력
		 * 2. 3항 연산자를 이용하세요
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		
		System.out.println("입력 받은 수는 : " + (num%2 == 0 ? "짝수" : "홀수"));
		 
		
		scan.close();
		
		
	}
}
