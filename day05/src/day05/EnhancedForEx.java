package day05;


public class EnhancedForEx {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		System.out.println("향상된 for문으로");
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		String[] arr2 = {"월", "화","수", "목", "금", "토", "일"};
		
		for(String s : arr2) {
			System.out.println(s);
		}
		
		// 향상된 for문을 활용하여 합계와 평균
		int[] score = {33,55,45};
		int sum = 0;
		double avg = 0.0;
		for(int i : score) {
			sum += i;
		}
		avg = (double)sum/score.length;
			
		System.out.println("합계 : "+ sum);
		System.out.printf("평균 : %.2f", avg);
	}
}
