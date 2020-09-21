package day07_quiz;

import java.util.Scanner;

public class MethodQuiz01 {
	public static void main(String[] args) {
		
		// print()
		print();
		
		// input()
		int num1 = input();
		int num2 = input();

		// add()
		int result = add(num1, num2);
		
		// showResult()
		showResult(result);
		
		
	}//main end
	
	static void print() {
		System.out.println("정수 2개를 입력하세요");
	}

	static int input() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" > ");
		int num = scan.nextInt();

		return num;
	}

	static int add(int n1, int n2) {
		return n1 + n2;
	}

	static void showResult(int result) {
		System.out.println("결과 : " + result);
	}
	
	
}
