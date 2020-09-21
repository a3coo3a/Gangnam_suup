package day06;

import java.util.Scanner;

public class RandomSeat {
	public static void main(String[] args) {
		
		/*
		 * 1. 사람수를 입력 받을 수 있습니다.
		 * 2. 입력받은 사람수 만큼 랜덤 값을 생성해서 배열에 중복되지 않게 랜덤으로 저장합니다.
		 * 		예) 25를 받으면, 1~25까지 숫자가 중복되지 않게 크기가 25인 배열에 랜덤하게 배정
		 * 
		 * 3. 해당 배열의 크기만큼 ○으로 출력해 주세요 (ㅁ한자9)\
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 5. 제대로 된 좌석이라면 자리번호를 공개하면 되고, 제대로 선택되지 않은 좌석이라면 "경고문을 띄워주세요"
		 * 
		 * 선택된 자리는 ●로 다시 표기해주세요
		 * 
		 */
		
		// 1. 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배정할 좌석의 크기를 지정하세요 > ");
		int size = scan.nextInt();
		
		int[] seat = new int[size];
		
		
		
		// 2. 처리
		// 랜덤 수 지정
		for (int i = 0; i < seat.length; i++) {
			seat[i] = (int) (Math.random() * size + 1);
			for (int j = 0; j < i; j++) {
				if (seat[i] == seat[j]) {
					i--;	// 증감식으로 이동해서 늘어나야 되니까 --로 줄여주는것!
					break; // 내부for탈출, 외부for 증감식으로 이동
				}
			}

		}
		
		//System.out.println(Arrays.toString(seat));
		
		// 3. 출력
		boolean[] choice = new boolean[size];	// 초기값은 false
		
		while(true) {
		
		//출력 :  ------ 좌석 선택 프로그램 -----
		for (int i = 0; i < size; i++) {
			System.out.print("-");
		}
		System.out.print(" 좌석 선택 프로그램 ");
		for (int i = 0; i < size; i++) {
			System.out.print("-");
		}
		System.out.println();

		// 출력 : 숫자와 ○
		for (int i = 0; i < size; i++) {
			System.out.printf("%-3d", i + 1);
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			System.out.print(choice[i] ? "●  " : "○  ");
		}

		// 좌석 선택
		System.out.println();
		System.out.print("좌석 선택 (0이면 종료)>");
		int select = scan.nextInt();

		
		// 출력 : 랜덤 수
		if (select == 0) {
			System.out.println("종료하겠습니다");
			break;
		} else if (choice[select - 1] == true) {
			System.out.println("이미 선택한 값입니다.");
		} else if (select > size) {
			System.out.println("잘못 선택하였습니다");
		} else {
			System.out.println("선택한 좌석은 : " + seat[select - 1]);
			choice[select - 1] = true;
		}
		
		
		}
		
		scan.close();
	}
}
