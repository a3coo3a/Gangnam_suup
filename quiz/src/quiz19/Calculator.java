package quiz19;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		/*
		 * 1. 정수를 2개 받습니다.
		 * 2. 입력한 값이 정수라면 합계를 반환하면 됩니다.
		 * 3. 예외가 발생할 수 있는 상황이라면 메서드를 종료하고 예외 메시지를 전달해 주면 됩니다.
		 * 4. scan.close(); 또한 적절하게 처리해 주세요
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		try {
			System.out.print("정수 입력 > ");
			int n1 = sc.nextInt();
			System.out.print("정수 입력 > ");
			int n2 = sc.nextInt();

			sum = n1 + n2;

		} catch (Exception e) {
			e.printStackTrace();
			/*
			 * java.util.InputMismatchException
			 * at java.util.Scanner.throwFor(Unknown Source)
			 * at java.util.Scanner.next(Unknown Source)
			 * at java.util.Scanner.nextInt(Unknown Source)
			 * at java.util.Scanner.nextInt(Unknown Source)
			 * at quiz19.Calculator.input(Calculator.java:20)
			 * at quiz19.MainClass.main(MainClass.java:7)
			 */
			throw new Exception();
		} finally {
			sc.close();
		}

		return sum;

	}
}
