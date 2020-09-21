package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		// 2항 연산자
		int i = 7 / 3 ;		// 2
		int j = 7 % 3 ;		// 1
		int k = 7 * 3 ; 	// 21
		
		// 비교 연산자 
		System.out.println( i == j );		// false
		System.out.println( i != j );		// true
		System.out.println( i >= j );		// true
		System.out.println( i <  j );		// false
		System.out.println( k != 21);		// false
		System.out.println( k % 2 != 0);	// true
		System.out.println( k % 2 == 1);	// true
		
		
		// 비트연산자
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		
		System.out.println(a & b); // 0000 0001  - 1 // 두 비트값이 1이면 1
		System.out.println(a | b); // 0000 0111  - 7 // 두 비트중 하나만 1이여도 1
		System.out.println(a ^ b); // 0000 0110  - 6 // 다르면 1 같으면 0
		
		// 비트 쉬프트 >> <<
		int h = 100; 
		System.out.println(h >> 2);
		
		// 논리연산자 
		
		
		
		
	}
}
