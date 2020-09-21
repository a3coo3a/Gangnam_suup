package day04_quiz;

public class Quiz20 {
	public static void main(String[] args) {
		
		/*
		 * 금액을 큰 금액부터 거슬러 몇개가 나와야 하는지 처리.
		 * 
		 */
		
		int[] coin = {1000, 500, 100, 50, 10};	//동전의 금액
		int money = 17780;	//금액
		int[] count = new int[coin.length];
		
		int i = 0;
		while ( i < coin.length ) {
			count[i] = money / coin[i];
			money %= coin[i];	//money = money % coin[i];
			i++;
		}
		
		i = 0;
		while ( i < coin.length ) {
			System.out.println("※ "+ coin[i] + "원 짜리 : " + count[i] + "개");
			i++;
		}
	
	
	
	}
}
