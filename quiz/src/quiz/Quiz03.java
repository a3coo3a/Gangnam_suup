package quiz;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		// Math.randam()*갯수  + 시작수
		
		
		int randamNum = (int)(Math.random()*11) - 5;
		
		System.out.println("랜덤값 : " + randamNum);
		System.out.println("절대값 : " + (randamNum < 0 ? -randamNum : randamNum));
		
//		int result = randamNum < 0 ? randamNum * -1 : randamNum ;
//		System.out.println(randamNum +"의 절대값 : " + result);
				
		
		
		
		
	}

}
