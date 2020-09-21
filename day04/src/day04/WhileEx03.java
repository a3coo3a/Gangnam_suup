package day04;

public class WhileEx03 {

	public static void main(String[] args) {

		int i = 1;
		int count = 0;

		while ( i <= 100 ) {

			if( i % 3 == 0 ) {
				//System.out.println(i);
				count++;
			}

			i++;
		}

		System.out.println("1~100까지 중 짝수의 갯수는 : " + count);

	}

}
