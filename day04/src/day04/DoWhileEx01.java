package day04;

public class DoWhileEx01 {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}

		System.out.println("   while : 1~10까지의 합계 : " + sum);
		
		i = 1;
		sum = 0;
		do {
			sum += i;
			i++;
		}while( i <= 10);
		 
		System.out.println("do~while : 1~10까지의 합계 : " + sum);
		
		// 2바퀴이상 돌아가면 결과 값은 똑같다고 생각하면되
		// 그래서 잘 사용하지 않음.
		// 일단 한번은 실행하게 된다.
		
		
		

	}

}
