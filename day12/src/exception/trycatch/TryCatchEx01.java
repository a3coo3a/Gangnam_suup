package exception.trycatch;

public class TryCatchEx01 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;

		System.out.println(i + j);

		try {
			System.out.println(i / j);
			System.out.println("여기 있는 문장은 예외 발생시 실행되지 않습니다.");
		} catch (Exception e) {	// 모든 예외를 다 받을 수 있다.
			System.out.println("0으로 나누지 말라니깐~!");
		}
		System.out.println(i - j);

	}
}
