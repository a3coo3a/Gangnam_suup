package day04_quiz;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		// Math.random()을 통해서 2~9까지 랜덤수를 만들고 해당 단수에 대한 구구단을 출력
		// for문 이용
		
		
		int dan = (int)(Math.random()*8+2);
		
		System.out.println("랜덤수 : " + dan);
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			//System.out.println(dan + " x " + i + " = " + (dan*i));
			
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
		
		
	}

}
