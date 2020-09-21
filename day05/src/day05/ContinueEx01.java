package day05;

public class ContinueEx01 {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0 ) {
				continue;		// 증감식으로 넘어감
			}
			
			System.out.println(i);
		}
	
		System.out.println("-----------------------------------");
		
		int i = 1;
		while(i <= 10) {
			
			if(i % 2 ==0 ) {
				i++;
				continue;		// 조건을 확인하러 이동함
			}
			
			System.out.println(i);
			i++;
		}
	

	}

}
