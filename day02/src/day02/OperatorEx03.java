package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		
		// if뒤에 소괄호가 true면 if 중괄호를 실행, false라면 else 중괄호 실행
//		if ( x != 10 & ++y == 21) { // false & true  > false
//			System.out.println("참입니다.");
//		} else {
//			System.out.println("거짓입니다.");
//		}
//		
//		System.out.println("x의 값 : " + x + ", y의 값 : " + y);  // 10,21

		if ( x != 10 && ++y == 21) { // false && 실행하지 않음  > false
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
		
		System.out.println("x의 값 : " + x + ", y의 값 : " + y);  // 10, 20
		
		
//		if (x == 10 | ++y == 21) { // true | false  > true
//			System.out.println("참입니다.");
//		}else {
//			System.out.println("거짓입니다.");
//		}
//		
//		System.out.println("x의 값 : " + x + ", y의 값 : " + y);  // 10, 22
		
		if (x == 10 || ++y == 21) { // true || 실행하지 않음  > true
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓입니다.");
		}
		
		System.out.println("x의 값 : " + x + ", y의 값 : " + y);  // 10, 20
		
		
		
		
		
		
		
		
		
	}
}
