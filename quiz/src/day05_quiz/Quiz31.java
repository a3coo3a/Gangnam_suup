package day05_quiz;

import java.util.Arrays;

public class Quiz31 {
	public static void main(String[] args) {

		int[] arr = { 5, 23, 1, 43, 100, 200, 40 }; // 길이가 7

		// 버블정렬
		// - 맨뒤에 가장 큰 수가 가는 방식
		// - 버블처럼 묶어서 뒤로 보낸다 
		// - 비교하는 횟수가 줄어드는 방식 ( 6 > 5 > 4 > 3 > 2 > 1 번)
		

		for (int i = arr.length - 1; i > 0; i--) {		// 회전수
			for(int j = 0; j < i; j++ ) {	// j : 인덱스값  // 비교할 값
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
