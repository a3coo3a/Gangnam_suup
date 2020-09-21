package day02;

public class OperatorEx01 {
	public static void main(String[] args) {


		// 부호 연산자 +, -
		int i = -3;
		int j = -i;

		System.out.println(j);

		// 증감 연산자 ++, --
		int k = 1;
		int h = k++;	// 후위연산자 : 먼저 값을 대입하고, 그 다음에 증가

		System.out.println(" k : " + k);
		System.out.println(" h : " + h);

		int x = 1;
		int y = ++x;	// 전위연산자 : 먼저 값을 증가하고, 그 다음에 대입

		System.out.println("x : " + x );
		System.out.println("y : " + y );

		// 일반적인 사용 예
		x = 1;
		x++;
		++x;
		System.out.println(x);

		System.out.println("------------------------------------------");

		x = 1;
		y = 1;

		System.out.println(x++);
		System.out.println(++x);


		x = 10;
		y = 10;

		int result = (x++) + (++y) + 10;
		System.out.println(result);

		// 예외적인 상황
		x = 10;
		y = 10;

		int result2 = (x++) + (x++) + (x++);	
		// 10 + 11 + 12 로 계산됨, 2번 이상 연산에 들어갈때 
		System.out.println(result2);

		x = 10;
		int result3 = (x++) + (x++);
		System.out.println(result3);


		System.out.println("------------------------------------------");


		// 비트 연산자 ( ~ ) : 비트 값을 반대로 치환
		byte b = 10;  // 0000 1010

		System.out.println(~b); // 1111 0101

		System.out.println(~b+1);

		System.out.println("------------------------------------------");


		// 논리 반전 연산자 ! ( 반대의 의미 )
		System.out.println( !true );
		System.out.println( !false );















	}
}
