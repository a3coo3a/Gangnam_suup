package day04_quiz;

import java.util.Scanner; //  ctrl + shift + O

public class Quiz22 {

	public static void main(String[] args) {

		// 1. 7~100까지 정수 중 7의 배수를 가로로 출력
		System.out.println("1번 ))");
//		for (int i = 7; i <= 100; i++) {
//			if (i % 7 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		for (int i = 7; i <= 100; i += 7) { // 7부터 시작하기에 가능
			System.out.print(i + " ");
		}	

		// 2. 1~100까지 정수 중 12의 배수를 가로로 출력
		System.out.println("\n\n2번 ))");
		for (int i = 1; i <= 100; i++) {
			if (i % 12 == 0) {
				System.out.print(i + " ");
			}
		}
		// 3. 1~200까지 정수 중 9의 배수의 개수
		System.out.println("\n\n3번 ))");
		int count = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % 9 == 0) {
				count++;
			}
		}
		System.out.println("1~200까지 정수 중 9의 배수의 개수 : " + count);

		// 4. 50~100까지 두 수 사이의 합
		System.out.println("\n4번 ))");
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50 ~ 100까지 두수 사이의 합 : " + sum);

		// 5. char를 이용해서 A~Z까지 가로로 출력 (A의 유니코드 : 65)
		System.out.println("\n5번 ))");
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		/*
		 * for (int i = 65; i <= 90; i++) {
		 * 		System.out.print((char)i + " ");
		 * 	}
		 *  이렇게도 가능
		 */

		// 6. 입력받은 정수 까지 팩토리얼 값( 5! = 5*4*3*2*1 )
		System.out.println("\n\n6번 ))");
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 > ");
		int num = scan.nextInt();
		int fac = 1;
		System.out.print(num + "! = ");
		for (int i = num; i >= 1; i--) {
			System.out.print(i);
			if(i > 1) {
				System.out.print(" x ");
			}
			fac *= i;
		}
		System.out.print(" = " + fac);

		scan.close();
		
		// Alt+Shift+r >> 동일 변수 이름 변경 가능
	}
}
