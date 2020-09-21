package quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {

		/*
		 * IfEx02와 동일하게 실행 되도록 switch구문으로 변경
		 * 힌트 : 점수를 10으로 나눈 몫을 이용
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("점수 입력 > ");
		int point = scan.nextInt();
		String message = "";

		switch (point/10) {
		case 10:
		case 9:
			if(point > 100) {
				message = "잘못된 점수 입니다. 100점 이하 점수만 가능합니다.";
			}else if(point >= 95) {
				message = "A+학점";
			}else {
				message = "A학점";
			}
			break;
		case 8:
			message = "B학점";
			break;
		case 7:
			message = "C학점";
			break;
		case 6:
			message = "D학점";
			break;
		default:
			if(point < 0) {
				message = "잘못된 점수 입니다. 양수로 입력하세요";
			}else {
				message = "F학점";
			}
			break;
		}

		System.out.println(message);

		scan.close();
	}

}
