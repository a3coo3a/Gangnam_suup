package quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
	
		/*
		 *  키(double)와 나이 (int)를 입력받고
		 *  키가 140 이상이고, 나이사 8세 이상이라면
		 *  "놀이기구 탑승가능"
		 *  아니면"놀이기구 탑승불가"
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요.");
		
		System.out.print("키 : ");
		double ki = scan.nextDouble();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		System.out.println("===============================");
		
		if(ki >= 140.0 && age >= 8) {
			System.out.println("놀이기구 탑승가능");
		}else {
			System.out.println("놀이기구 탑승불가");
		}
				
				
		scan.close();
		
		
	}
}
