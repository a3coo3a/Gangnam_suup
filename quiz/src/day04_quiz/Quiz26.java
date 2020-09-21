package day04_quiz;

public class Quiz26 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {	//단수
			System.out.println(i + "단 입니다.");
			for (int j = 1; j <= 9; j++) {  //행수
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
