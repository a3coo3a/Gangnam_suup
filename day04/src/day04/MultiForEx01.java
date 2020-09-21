package day04;

public class MultiForEx01 {

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 9 ; i++) {
//			
//			for (int j = 1; j <= 9; j++) {
//				
//				System.out.println(i + " - " + j);	
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.println(i + " - " + j);

			}
			System.out.println();
		}
		// 10까지 정수 중 소수들의 합(중첩 반복문)
				
	}

}
