package day05_quiz;

import java.util.Scanner;

public class Quiz33 {
	public static void main(String[] args) {
		
		//quiz15
		
		Scanner scan = new Scanner(System.in);
		
		int count_o = 0;
		int count_x = 0;
		
		while(true) {
		int ran1 = (int)(Math.random()*100+1);
		int ran2 = (int)(Math.random()*100+1);
		
		System.out.println("--------------------------");
		System.out.println(ran1 + " + " + ran2 + " = ?");
		System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
		System.out.print("> ");
		int an = scan.nextInt();
		
		if(an == 0) {
			System.out.println("종료되었습니다.");
			break;
		}else if(an != ran1+ran2) {
			count_x++;
			System.out.println("오답입니다!");
		}else {
			count_o++;
			System.out.println("정답입니다!");
		}

		}
		System.out.println("정답횟수 : " + count_o + "회");
		System.out.println("오답횟수 : " + count_x + "회");
			scan.close();
	}
}
