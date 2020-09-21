package day05_quiz;

import java.util.Scanner;

public class Quiz32 {
	public static void main(String[] args) {
		
		/*
		 * up down
		 * 
		 * 1~100까지 임의 숫자 생성
		 * 스캐너를 통해서 값을 입력 받습니다.
		 * 랜덤수가 입력받은 값보다 작으면 " 더 작은술르 입력하세요"
		 * 랜덤수가 입력받은 값보다 크면  " 더 큰수를 입력하세요"
		 * 
		 *  정답이라면 ,
		 *  시도횟수 : x회, 를 출력하고 종료
		 * 
		 */
		
		int ran = (int)(Math.random()*100+1);
		Scanner scan = new Scanner(System.in);
		int count=1;
		
		while(true) {
			System.out.print(count + ". 정답을 입력하세요 > ");
			int num = scan.nextInt();
			
			count++;
			
			if (ran < num) {
				System.out.println(" >>> 더 작은수로 입력하세요!");
			}else if(ran > num) {
				System.out.println(" >>> 더 큰수로 입력하세요!");
			}else {
				System.out.println();
				System.out.println((count-1) + "회 만에 정답입니다!");
				break;
			}
		}
			
		scan.close();
		
	}
}
