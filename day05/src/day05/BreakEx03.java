package day05;

public class BreakEx03 {
	public static void main(String[] args) {
		
		
//		for(char u = 'A'; u <= 'Z';u++) {
//			
//			for (char l = 'a'; l <= 'z';l++) {
//				System.out.println(u +" - "+l) ;
//				
//				if(l == 'c') {
//					break;
//				}
//			}// 내부
//			
//			System.out.println();
//		}// 외부
//		
		
		
//		// 고전적인 방법 : 변수를 활용해서 탈출의 조건을 만들어 주는 것
//		boolean bool = false;	//탈출을 하기 위한 변수
//		for (char u = 'A'; u <= 'Z'; u++) {
//
//			for (char l = 'a'; l <= 'z'; l++) {
//				System.out.println(u + " - " + l);
//
//				if (l == 'c') {
//					bool = true;
//					break;
//				}
//			} // 내부
//			
//			if(bool) break;
//			
//		} // 외부
		
		
		// 이름을 붙여서 탈출하는 방법 (라벨)
		start:for (char u = 'A'; u <= 'Z'; u++) {
			for (char l = 'a'; l <= 'z'; l++) {
				System.out.println(u + " - " + l);
				if (l == 'c') {
					break start;		// 지정된 라벨값으로 가 한번에 빠져나오는 것  //복잡한 형태에서 유용하게 사용할 수 있음.
				}
			}
		}

		
		
	}
}
