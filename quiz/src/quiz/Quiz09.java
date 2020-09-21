package quiz;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		
		/*
		 * 1. 양의 정수를 입력 받아 
		 *  짝수면  "X는 짝수 입니다."
		 *  홀수면 "X는 홀수 입니다."
		 * 2. 0이라면 "0입니다.
		 * 3. 음수라면 음수입니다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		System.out.print("> ");
		int num = scan.nextInt();
		
		if (num == 0) {
			System.out.println("입력한 정수는 0입니다.");
		}else if (num < 0) {
			System.out.println(num + "은(는) 음수입니다.");
		}else if (num % 2 == 0) {
			System.out.println(num + "은(는) 짝수 입니다.");
		}else {
			System.out.println(num + "은(는) 홀수 입니다.");
			
		}
		
		
		
		
		scan.close();
		
	}
}
