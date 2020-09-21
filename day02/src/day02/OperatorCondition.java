package day02;

public class OperatorCondition {

	public static void main(String[] args) {

		// 0.0 ~ 1.0 미만의 랜덤 double 값을 발생		
//		System.out.println( Math.random() );
		
		// 1 ~ 10 까지 랜덤값
//		double d = Math.random() * 10;
//		int result = (int)d + 1;
		
		int result = (int) (Math.random() * 10) + 1;
		
		
		System.out.println( result );
		
		String result2 = result % 3 == 0 ? "3의 배수입니다." : "3의 배수가 아닙니다."; 
		System.out.println(result2);
		
		
		
		
	}

}
