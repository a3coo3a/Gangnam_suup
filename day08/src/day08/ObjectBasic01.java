package day08;

public class ObjectBasic01 {
	public static void main(String[] args) {

		System.out.println("------ 1번계산기 -----");
		System.out.println(add(1));
		System.out.println(add(2));
		System.out.println(add(3));
		System.out.println("------ 2번계산기 -----");
		System.out.println(add(10));
		System.out.println(add(20));
		System.out.println(add(30));

	}

	// 1번계산기
	static int result = 0;

	static int add(int n) {
		result += n;
		return result;
	}

	// 2번계신기
	static int result2 = 0;

	static int add2(int n) {
		result2 += n;
		return result2;
	}
}
