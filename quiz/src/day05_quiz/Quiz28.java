package day05_quiz;

import java.util.Scanner;

public class Quiz28 {
	public static void main(String[] args) {

		/*
		 * 네모별찍기 
		 * 1. 가로, 세로 값을 입력 받습니다. 
		 * 2. 가로 길이, 세로 길이의 사각형을 출력 
		 * 3. 단, 윤곽만 나타나도록 처리합니다.
		 * 조건, 첫행, 마지막행 출력, 첫열 마지막열에 출력
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("가로 > ");
		int karo = scan.nextInt();
		System.out.print("세로 > ");
		int sero = scan.nextInt();

//		for (int i = 0; i < sero; i++) {
//			if (i > 0 && i < sero - 1) {
//				for (int j = 0; j < karo; j++) {
//					System.out.print((j > 0 && j < karo - 1) ? " " : "*");
//				}
//			} else {
//				for (int j = 0; j < karo; j++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		
		for (int i = 1; i <= sero; i++) {

			for (int j = 1; j <= karo; j++) {

				if (i == 1 || i == sero) {
					System.out.print("*");
				} else {
					if (j == 1 || j == karo) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}
}
