package quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		/*
		 * 1. 1~20까지 랜덤한 정수를 생성해서
		 * 만약, 10보다 작고 3의 배수이거나, 4의 배수라면 : "10보다 작은 3또는4의 배수"
		 *
		 * 반대의 경우 : "10보다 작지않거나 3또는4의 배수가 아닙니다"
		 * 
		 */
		
		
		int num = (int)(Math.random()*20)+1;
		
		if(num < 10 && (num % 3 == 0 || num % 4 == 0)) {
				System.out.println(num + "은 10보다 작은 3 또는 4의 배수입니다.");
		}else {
			System.out.println(num + "은 10보다 작지 않거나 3 또는 4의 배수가 아닙니다");
		}
		
		
		/*
		 *	Scanner로
		 * 정수 3개를 받아서 큰값, 중간값, 작은값을 구분하면 됩니다.
		 * 단, 3개의 값이 같은 경우는 예외로 한다.                                                                                                                                        
		 *
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 세개를 입력하세요");
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		System.out.print(">");
		int num3 = scan.nextInt();
		
		int max = 0, min = 0, mid = 0;
		
		if(num1 > num2 && num1 > num3) {//num1이 큰값
			max = num1;
			if(num2 > num3) {
				mid = num2;
				min = num3;
			}else {
				mid = num3;
				min = num2;
			}
		}else if(num2 > num1 && num2 > num3) { //num2 큰값
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			}else {
				mid = num3;
				min = num1;
			}
		}else if(num3 > num1 && num3 > num2){ // num3 큰값
			max = num3;
			if(num1 > num2) {
				mid = num1;
				min = num2;
			}else {
				mid = num2;
				min = num1;
			}
		}
		System.out.println("큰값 : "+max+ ", 중간값 : "+mid+", 작은값 : "+min);
		
		
		
		scan.close();
		
		
		
	}

}
