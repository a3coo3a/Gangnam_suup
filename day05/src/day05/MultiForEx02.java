package day05;

public class MultiForEx02 {

	public static void main(String[] args) {
		/*
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 */

		// 밖에 for문이 줄을 바꾸는 용도 아래로 내리는 줄
		// 안에 for문이 가로 별을 찍는 형태
		/*
		 * 	i	j
		 * 	0	1
		 * 	1	2
		 * 	2	3
		 * 	3	4
		 * 	4	5
		 * 
		 * 차이가 j = i+1 이라는 점!
		 */
		int star = 10; // 행의 수
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 */
		
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/*
		 *      *
		 *     *** 
		 *    *****
		 *   *******  
		 *  *********  
		 */
		
		for (int i = 0; i < star; i++) {
			// 공백
			for (int j = 0; j < star - i - 1; j++) { // 딱 붙여서 출력하려면 (-1) 해야해
				System.out.print(" ");
			}
			// 출력
			for (int k = 0; k < (i * 2) + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
