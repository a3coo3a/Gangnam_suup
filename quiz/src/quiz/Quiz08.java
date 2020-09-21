package quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		/*
		 * 1. 정수 2개를 입력 받으세요
		 * 2. 2개를 비교해서 "X가 큰 수 입니다" 출력, 같으면 "같은 수 입니다." 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력하세요");
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		
		if(num1 == num2) {
			System.out.println("같은 수 입니다.");
		}else if (num1 > num2) {
			System.out.println(num1 + "(이)가 큰 수 입니다.");
		}else {
			System.out.println(num2 + "(이)가 큰 수 입니다.");
		}
		
		
		
		
		scan.close();
		
		
		
	}
}
