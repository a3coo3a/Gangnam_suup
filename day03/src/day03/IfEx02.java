package day03;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점 수 > ");
		int point = scan.nextInt();
		
		if(point >= 90) {	// 90~
			if(point > 100) {
				System.out.println("잘못된 점수 입니다.");
			}else if(point >= 95) { // 95~100
				System.out.println("A+학점");
			}else {					// 90~94
				System.out.println("A학점");
			}
		}else if(point >= 80) {	//80~89
			System.out.println("B학점");
		}else if(point >= 70) { //70~79
			System.out.println("C학점");
		}else if(point >= 60) { //60~69
			System.out.println("D학점");
		}else {					//0~59
			System.out.println("F학점");
		}
		
		scan.close();
		
	}
}
