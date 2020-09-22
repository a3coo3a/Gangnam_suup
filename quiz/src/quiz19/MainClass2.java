package quiz19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {

		/*
		 * 1에서 100까지 랜덤한 수를 맞추는 프로그램 입니다.
		 * 입력한 값이 1에서 100까지의 값이 아니라면 예외처리 구문으로 넘기고
		 * 다시 입력받도록 처리합니다.
		 * 단, 카운트는 증가됩니다.
		 * 
		 * 입력한 값이 숫자가 아니라면 "반드시  숫자만 입력하세요"를 출력한 뒤에
		 * 다시 입력받도록 처리합니다.
		 * 단, 카운트는 처리 되지 않습니다.
		 * 
		 * 위와 같은 실행 구조를 갖는 예외처리 코드를 작성해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int ran = (int) (Math.random() * 100) + 1;

		while (true) {

			try {
				System.out.print(ran + ") 정답은 ? ");
				int num = sc.nextInt();
				if (num < 0 || num > 100) {
					throw new Exception();	// catch(Exception e) 로 이동
				} else {
					System.out.println(ran == num ? "정답입니다!" : "오답입니다. 다시입력하세요~");
				}
				count++;
				if (ran == num)
					break;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Error!!! 반드시 숫자만 입력하세요");
				System.out.println("시도횟수에 포함되지 않습니다.");
			} catch (Exception e) {
				System.out.println("1~100사이 수로 입력하세요!");
				count++;
			}

		}
		System.out.println("총 시도 횟수 : " + count);

		sc.close();
	}
}