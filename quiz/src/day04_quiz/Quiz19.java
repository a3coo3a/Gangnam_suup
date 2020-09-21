package day04_quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		/*
		 * 1. 양수를 입력 받아, 입력 받은 수 크기의 배열을 생성하세요 
		 * 2. 배열에 1~입력 받은 수 까지 차례대로 값을 넣으세요.
		 *
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("양수 입력 > ");
		int size = scan.nextInt();
		if (size > 0) {
			int[] arr = new int[size];
			int i = 0;
			while (i < arr.length) {
				// arr[i] = ++i + 1;
				arr[i] = i + 1;		
				i++;
			}

			System.out.println(Arrays.toString(arr));

		} else {
			System.out.println("수를 잘못 입력하였습니다. 양수로 입력해 주세요");
		}

		scan.close();

	}
}
