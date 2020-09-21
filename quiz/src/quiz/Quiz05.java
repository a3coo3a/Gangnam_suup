package quiz;

public class Quiz05 {
	
	public static void main(String[] args) {
		
		
		// -5~5까지 랜덤값을 만들고 0이라면 "0" 출력 양수라면 "양수", 음수라면 "음수" 출력
		
		int randamNum = (int)(Math.random()*11) -5;
		
		System.out.println("랜덤 값 : " + randamNum);
		
		System.out.println((randamNum == 0 ? "0" : randamNum > 0 ? "양수" : "음수") + "입니다.");
		
		
		
		long ll = 9223372036854775807l;
		float ff = ll;
		
		System.out.println(ff);
		
	
		
		
		
	}
	

}
