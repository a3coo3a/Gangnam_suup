package day04;

import java.util.Scanner;

public class ForEx02 {


	public static void main(String[] args) {
		
		// 정수를 입력 받아서 소수 판별 2번째 방법
		// 소수는 1, 나자신 이렇게 나머지가 0인게 2개밖에 없다
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 >");
		int num = scan.nextInt();
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			
			if ( num % i == 0 ) { // 약수인 경우 카운트 체크 
				count++;
			}
					
		}
		
		System.out.println(count == 2 ? num + "은 소수이다." : num + "은 소수가 아니다");
		
		
		scan.close();
		
	}
}
