package day02;

public class CastingEx01 {

	
	public static void main(String[] args) {
		
		/*
		 * JVM 
		 * - 자동형변환 진행
		 * 
		 * 크기가 작은 타입을 큰 타입에 넣을때는 
		 * 자바 가상머신 JVM이 자동으로 형변환을 해준다.
		 * (업캐스팅)
		 * 
		 */
		
		
		byte b = 10;
		short s = b;	// byte -> short 자동형변환
		int i = b;		// byte -> int 자동형변환
		long l = b;		// byte -> long 자동형변환
		
		char c = '가';
		int j = c;		// char -> int 자동형변환
		
		System.out.println("'가'의 유니코드 값 : " + j);
		
		int k = 1000;
		double d = k;	// int -> double 자동형변환
		
		System.out.println(d);
		
		
	}
}
