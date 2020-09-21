package day02;

public class IntegerEx {
	
	public static void main(String[] args) {
		
		// 정수형
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 441651515613123L;
		
		System.out.println(d);
		
		/*
		 * 
		 * 2진수 저장할때는 0b를 붙임
		 * 8진수를 저장할 때는 0을 붙임
		 * 16진수를 저장할 때는 0x를 붙임
		 * 
		 * 
		 */
		
		int bin = 0b1010;  // 2진수 표현
		System.out.println("2진수 1010 : " + bin);	// 출력은 10진수로 출력됨.
		
		int octa = 064;	//8진수 표현
		System.out.println("8진수 064 : " + octa);
		
		int hexa = 0x3a4c;
		System.out.println("16진수 0x3a4c : " + hexa);
		
		System.out.println("------------------------------------");
		
		
		// 실수형
		
		float f1 = 3.14F;	// F,f를 붙임.
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
				
		float f2 = 3.1415921234F;
		double d2 = 3.1415921234;
		
		System.out.println(f2);
		System.out.println(d2);
		
		// 지수형태 e표기법
		float f3 = 314.159e-2F;
		System.out.println(f3);
		
		float f4 = 0.00314e3F;
		System.out.println(f4);
		
		
		System.out.println("------------------------------------");
		
		// 논리형
		boolean bool1 = true;		// 0,1로 저장해서 대체할 수 없다.
		boolean bool2 = false;
		
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
			
		
	}
}
