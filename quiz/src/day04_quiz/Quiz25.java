package day04_quiz;

import java.util.Arrays;

public class Quiz25 {

	public static void main(String[] args) {

//		int x = 1;
//		int y = 5;
		// x, y 를 바꾸는 방법
		// 스왑 (swap)

		/*
		 * 1. x의 값을 temp라는 새로운 변수에 담는다
		 * 2. y의 값을 x에 넣는다 
		 * 3. temp의 값을 y에 넣는다.
		 *
		 */

		// 자바에는 정렬 메소드가 있지만, 알아두면 좋아요

//		System.out.println("x : " + x + ", y : " + y);
//		
//		//Swap
//		int temp = x;
//		x = y;
//		y = temp;
//		
//		System.out.println("x : " + x + ", y : " + y);
//		
		
		
		// point  <swap>
		// 1. 1~9까지 배열의 값중에 절대 중복되지 않는 숫자로 만들어진 3개의 크기의 배열을 만들어 내는 프로그램
		// arr에서 절대 중복되지 않는 3개의 수를 추출 (길이만큼 돌면서 랜덤으로 값을 섞음)
		// 
		// 26일까지 숙제
		int[] arr = {1,2,3,4,5,6,7,8,9};		// 여기서 수를 꺼내 (중복되지 않게)
		
		
		for(int i = 0; i < arr.length ; i++) {
			int index = (int)(Math.random()*arr.length);
			if(index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// for문을 다시 한번 이용해서 0 1 2 인덱스 값을 새로운 배열에 옴깁니다.
		int[] ar = new int[3];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(ar));
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
