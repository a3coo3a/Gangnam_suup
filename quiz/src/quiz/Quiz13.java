package quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1> ");
		int num1 = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+,-,*,/] > ");
		String ope = scan.next();
		
		System.out.print("정수 2> ");
		int num2 = scan.nextInt();
		
		double result = 0.0;
		
		switch (ope) {
		case "+":
			result = num1 + num2;
			System.out.println("두 수의 덧셈은 : " + result );
			break;
		case "-":
			result = num1 - num2;
			System.out.println("두 수의 뺄셈은 : " + result );
			break;
		case "*":
			result = num1 * num2;
			System.out.println("두 수의 곱셈은 : " + result );
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				result = (double)num1/num2;
				System.out.println("두 수의 나눗셈은 : " + result );
			}
			break;
		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
			break;
		}
		
		
		scan.close();
	}
}
