package day07;

import java.util.Scanner;

public class RandomSeat_Sam {
	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);

		System.out.print("배정할 좌석의 크기 > ");
		int size = scan.nextInt();

		int[] arr = new int[size]; // 좌석을 저장할 배열
		int index = 0;

		/* 좌석 배정 */
		start: while (true) { // index == size 면 마지막 까지 번호가 배정되는 것

			if (index == size)
				break; // while 의 true 자리에 조건이 들어가도 됨. (index != size)

			int seat = (int) (Math.random() * size + 1);
			// 배열에 값을 넣기 전에 중복 검사를 해주는 것
			// 중복검사(랜덤값과 배열의 index번째까지 동일한 값이 있는지 확인)
			for (int i = 0; i < index; i++) {
				if (arr[i] == seat) {
					continue start;
				}
			}

			arr[index++] = seat; // 헷갈리면 index++;을 아래 따로 써주면 됨.

		} // while end

		/* 남은 좌석 출력 및 선택 */
		while (true) {
			System.out
					.println("---------------------------------------좌석선택 프로그램---------------------------------------");

			for (int i = 0; i < arr.length; i++) {
				System.out.printf("%-3d", i + 1);
			}
			System.out.println();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					System.out.printf("%-3s", "●");
				} else {
					System.out.printf("%-3s", "○");
				}
			}
			System.out.println();

			System.out.print("좌석 선택 > ");
			int seat = scan.nextInt();

			// Thread 실행 흐름
			// - 자바는 다중 스레드 방식
			// - 메인이 하나인 게 지금 돌고 있으니 하나의 스레드가 도는 것

			System.out.print("두구 ");
			Thread.sleep(800); // 0.3 초 잠시 멈춤
			System.out.print("두구 ");
			Thread.sleep(800);
			System.out.print("두구 ");
			Thread.sleep(800);

			System.out.println();
			System.out.println("    짠!!!!!!!");
			if (arr[seat - 1] == 0) {
				System.out.println("이미 선택된 좌석입니다~");
			} else {
				System.out.println("자리 번호 : " + arr[seat - 1]);
				arr[seat - 1] = 0;
			}

		} // while end
	}
}
