package api.lang.stringbuilder;

public class StringTest {

	public static void main(String[] args) {

//		long start = System.currentTimeMillis();
//
//		String s = "";
//		for (int i = 0; i <= 300000; i++) {
//			s += "A";
//		}
//
//		long end = System.currentTimeMillis();
//		System.out.println("String 소요 시간 : " +(end-start)*0.001+"초");		// 약 17초
		
		
		long start = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("A");
		for (int i = 0; i <=300000; i++) {
			sb.append("A");
		}
				
		
		long end = System.currentTimeMillis();
		System.out.println("String 소요 시간 : " +(end-start)*0.001+"초");		// 약 0.001초
		
		
		
		
	}

}
