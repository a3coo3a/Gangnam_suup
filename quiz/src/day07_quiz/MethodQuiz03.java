package day07_quiz;

public class MethodQuiz03 {
	public static void main(String[] args) {

		String str = java(10);
		System.out.println(str);

		System.out.println(sum(6));

		System.out.println("3의 소수의 개수 : " + primeNum(3));
		
		System.out.println("7~9의 사이의 수의 합 : " + sumNum(7, 9));
		System.out.println("9~7의 사이의 수의 합 : " + sumNum(9, 7));
		System.out.println("5~5의 사이의 수의 합 : " + sumNum(5, 5));
		
	}

	// quiz18  - 원하는 수만큼 자, 바 출력
	static String java(int n1) {
		String str = "";

		for (int i = 1; i <= n1; i++) {
			str += i % 2 != 0 ? "자" : "바";
		}
		return str;
	}
	// quiz19  - 약수의 합
	static int sum(int n1) {
		int sum = 0;

		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0)
				sum += i;
		}

		return sum;
	}
	// quiz20  - 소수의 갯수
	static int primeNum(int n1) {
		int count = 0;		// 소수인지 판별
		int num = 0;		// 소수의 갯수
		
		for (int i = 1; i <= n1; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			} // 내부 for
			if (count == 2) {
				num++;
			}
		} // 외부 for
		return num;
	}
	// quiz21  - 사이의 수의 합
	static int sumNum(int n1, int n2) {
		if( n1 == n2 ) return n1;
		
		int sum = 0;
		for(int i = (n1 < n2 ? n1 : n2); i <= (n1 > n2? n1 : n2); i++) {
			sum += i;
		}				
		return sum;
	}

}
