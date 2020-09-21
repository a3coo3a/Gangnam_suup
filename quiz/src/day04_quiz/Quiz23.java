package day04_quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		/*
		 * 1. 두 정수를 입력 받아
		 * 2. 단, 두 수의 크기는 정해지지 않았습니다.
		 * 3. 두 수 사이의 합을 구하는 코드르 최대한 간략하게 작성
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 입력 > ");
		int n1 = scan.nextInt();
		System.out.print("정수1 입력 > ");
		int n2 = scan.nextInt();
		int sum = 0;
		// if~else if를 사용하고자 한다면  3 항연산자를 생각해 보자
		for(int i = (n1 == n2 ? 0 : (n1 < n2? n1 : n2)); i <= (n1 == n2 ? 0 : (n1 > n2? n1 : n2)); i++) {		
			sum += i;
		}
		System.out.println(n1+ " ~ " + n2 + "까지 정수의 합  : " +  sum);
		
		scan.close();
	
	}
	
	
}
