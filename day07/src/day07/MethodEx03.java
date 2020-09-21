package day07;

public class MethodEx03 {

	public static void main(String[] args) {

		/*
		 * 반환유형 (return type) 
		 * 1. 반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type 
		 * 2. 반환유형이 있는 메서드는 호출문이 하나의 값이기 때문에 다른 메서드의 매개값으로 사용이 가능하다.
		 * 		ex) println(메서드호출문)
		 * 3. 반환값이 없는 경우는 void라고 적습니다.
		 * 4. 모든 메서드는 return을 만나면 강제종료 됩니다.
		 *   그래서 return문 아래 코드 작성을 할 수 없습니다.
		 *   
		 */
		
		
		int result = add(add(1,2), add(2,3));
		System.out.println("결과 : " + result);
		
		// void형 메소드는 return값이 없기때문에 단순히 호출만 가능함.
		//int result2 = sub(10, 5); - return값이 없기에 사용 불가
		//System.out.println(sub(10, 5));  - return값이 기에 사용할 수 없는 방법
		sub(10, 5);
		
		multi();
		
		noReturn("똑똑이");
		
	}// main end

	static int add(int a, int b) {

		return a + b;
	}

	static void sub(int a, int b) {		// 호출했을때 실행만 하고 끝남.
		System.out.println(a + " - " + b + " = " + (a-b));		
	}
	
	static void multi() {
		System.out.println("5 X 3 = 15");
	}
	
	static void noReturn(String s) {		// 반환 유형이 없는 void형의 return은 종료의 의미를 갖고 있음.
		if (!s.equals("똑똑이")) {
			System.out.println(s+"가 아니고 똑똑이를 전달하세요~");
			return;
		}
		System.out.println("똑똑합니다");
		
	
	}
	
}
