package day03;

public class SwitchEx01 {

	public static void main(String[] args) {

		int a = 10;

		// switch 구문의 소괄호에는 변수나, 변수의 연산식 (값이 들어감)
		switch ( a ) {
		case 0:
		case 1:
			System.out.println("0 또는 1입니다");
			break;	// 스위치 구문을 빠져나와라! 가장 가까운 중괄호를 빠져나가는 것
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		default:
			System.out.println("1~3이 아닙니다.");
			break;
		}
	}
}
