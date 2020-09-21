package day03;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		// 입력받은 수가 소수인지 판별...
		// 7이 소수인지 : 7 % x != 0
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 >");
		int num = scan.nextInt();
		
		int x = 2;	// 1 은 무조건 나누어 떨어지니까 
		while(num % x != 0) {	// 나머지가 있다면 true
			x++;
		}
		
		System.out.println(num == x ? num + "은 소수 입니다." : num + "은 소수가 아닙니다.");
		
		scan.close();
	}
}
