package day03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		// 1. Scanner 생성
		Scanner scan = new Scanner(System.in);
		
		// 2. Scanner가 가지고 있는 입력기능을 사용해서 데이터를 입력받음
		// - 입력받은 값이 name에 저장되는것.
		System.out.print("이름 > ");
		String name = scan.next();	// 엔터값을 포함하지 않고 이전까지 받음.
		
		System.out.print("나이 > ");
		int age = scan.nextInt();  // 엔터값을 포함하지 않고 이전까지 받음.
		
		System.out.print("신장 > ");
		double cm = scan.nextDouble(); // 엔터값을 포함하지 않고 이전까지 받음.
		
		System.out.print("자기소개 > ");
		scan.nextLine();	// 위에서 남아있는 엔터 값을 없애주는 역할.
		String intro = scan.nextLine();  
		
		System.out.println(name + " " + age + "세 " + cm + "cm");
		System.out.println("자기소개 : " + intro);
		
		// 스캐너 사용 종료
		scan.close();
		
	}

}
