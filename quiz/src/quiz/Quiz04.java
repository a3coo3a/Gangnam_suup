package quiz;

public class Quiz04 {

	
	public static void main(String[] args) {
		
		/* 
		 * 1~150까지 랜덤한 정수를 발생 시키고, 사과의 개수라고 가정
		 * bucket는 사과를 10개 담을 수 있는 바구니
		 * 
		 * 랜덤한 사과에 따라서 필요한 bucket의 수를 구하는 3항 연산자
		 *  
		 *  단, 140개 라면 14개 필요, 141개 라면 15개 필요
		 *  
		 */
				
		int bucket = 10;
		
		int apple = (int)(Math.random() * 150) + 1;
		
		int bucketCount =  apple % bucket == 0 ? apple/bucket : (apple/bucket) + 1 ;
		
		System.out.println("사과의 갯수는 : " + apple);
		System.out.println("필요한 바구니의 갯수는 : " + bucketCount);
		
		
		
		
	}
}
