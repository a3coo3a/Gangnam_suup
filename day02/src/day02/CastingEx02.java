package day02;

public class CastingEx02 {

	public static void main(String[] args) {

		/*
		 * 크기가 큰 타입을 작은 타입으로 변환할 때는 (type) 캐스팅을 이용해서
		 * 명시적 형변환을 해야 합니다.
		 * 
		 */

		int i = 70;
		char c = (char) i;
		short s = (short) i;

		System.out.println(c);
		System.out.println(s);

		float f = 3.14F;
		int j = (int) f;

		System.out.println("j 값은 : " + j);


		/*
		 * 주의할 점
		 * 
		 * 강제 형 변환시 해당값을 받을 수 없는 범위가 들어오면
		 * 잘려나간(쓰레기값)을 저장합니다.
		 * 
		 */
		int a = 1000;
		byte b = (byte) a;

		System.out.println(b);

		// 예외적인 상황 : 크기가 같은 타입이나 서로 강제 형변환을 해주어야 함.
		char cc = 'A';
		short ss = (short) cc;

		short sss = 65;
		char ccc = (char) sss;
		System.out.println(ccc);

	}
}

