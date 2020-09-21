package quiz;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		/*
		 * 1. 메뉴를 보여준 후 , Scanner로 해당 메뉴를 입력 받으세요
		 * 2. 없는 메뉴라면, "~은 메뉴가 없습니다."를 출력하세요
		 * 3. switch구문을 이용하세요
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.print("> ");
		String menu = scan.next();
		
		switch (menu) {
		case "수박":
			System.out.println(menu + "의 가격은 2만원입니다.");
			break;
		case "사과":
			System.out.println(menu + "의 가격은 3만원입니다.");
			break;
		case "멜론":
			System.out.println(menu + "의 가격은 4만원입니다.");
			break;
		case "포도":
			System.out.println(menu + "의 가격은 5만원입니다.");
			break;
		case "귤":
			System.out.println(menu + "의 가격은 6만원입니다.");
			break;
		default:
			System.out.println(menu + "는 메뉴에 없습니다");
			System.out.println("다시 입력해 주세요");
			break;
		}		
		
		scan.close();	
	}

}
