package day05_quiz;

import java.util.Scanner;

public class Quiz34 {
	public static void main(String[] args) {

		/*
		 * quiz16
		 * 
		 * switch 구문을 활용하세요
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int change = 0;

		box: while (true) {
			System.out.print("금액을 투입해 주세요 > ");
			int money = scan.nextInt();
			money += change;
			drink: while (true) {
				System.out.println("\n◆ 남은 금액 : " + money + "원");
				System.out.println(" *** 메뉴를 선택하세요 *** ");
				System.out.println("[1]뎀이소다 : 400원\n[2]밀킥스    : 500원\n[3]코가골라 : 600원\n[4]잔돈받기\n[5]돈넣기");
				System.out.print("선택 > ");
				int menu = scan.nextInt();
				int price = 0;

				switch (menu) {
				case 1:
					price = 400;
					System.out.println((money >= price) ? "뎀이소다를 받았습니다." : "금액이 부족합니다.");
					break;
				case 2:
					price = 500;
					System.out.println((money >= price) ? "밀킥스를 받았습니다." : "금액이 부족합니다.");
					break;
				case 3:
					price = 600;
					System.out.println((money >= price) ? "코가골라를 받았습니다." : "금액이 부족합니다.");
					break;
				case 4:
					System.out.println((money == 0) ? "반환할 금액이 없습니다." : "남은 금액 " + money + "을 반환합니다.");
					break box;
				case 5:
					break drink;
				default:
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
					break;
				}
				if (money >= price) {
					money -= price;
				}
			} // drink:while 끝
			change = money;
		} // box:while 끝
		scan.close();
	}
}
