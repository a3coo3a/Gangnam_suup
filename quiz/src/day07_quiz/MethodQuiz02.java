package day07_quiz;

import java.util.Arrays;

public class MethodQuiz02 {
	public static void main(String[] args) {

		int n1 = 1;
		int n2 = 10;
		int n3 = 15;
		String s1 = "*";
		String s2 = "abc";
		char[] c1 = {'A', 'B', 'C'};
		int[] nn1 = {1, 2, 3, 4};
		
		// 호출
		method1();
		
		String result1 = method2(s1);
		System.out.println("method2 : " + result1);
		
		double result2 = method3(n1, n2, n3);
		System.out.println("method3 : " + result2);
		
		String result3 = method4(n1);
		System.out.println("method4 : " + result3);
		
		method5(s1, n2);
		
		int result4 = maxNum(n1, n2);
		System.out.println("maxNum : " + result4);
		
		int result5 = abs(n1);
		System.out.println("abs : " + result5);
		
		String result6 = method6(c1);
		System.out.println("method6 : " + result6);
		
		int result7 = method7(nn1);
		System.out.println("method7 : " + result7);
		
		String[] result8 = method8(s1, s2);
		System.out.println("method8 : " + Arrays.toString(result8));
		
		
		
		
		
		
	}// main end

	static void method1() {
		System.out.println("안녕");
	}

	static String method2(String s1) {
		return s1;
	}

	static double method3(int n1, int n2, double n3) {
		return n1 + n2 + n3;
	}

	static String method4(int n1) {

		if (n1 % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}

	}

	static void method5(String s1, int n1) {
		for (int i = 0; i < n1; i++) {
			System.out.print(s1);
		}
		System.out.println();
	}

	static int maxNum(int n1, int n2) {
		if (n1 > n2)
			return n1;
		else if (n1 < n2)
			return n2;
		else {
			System.out.println("두수는 같은 수 입니다.");
			return 0;
		}
	}

	static int abs(int n1) {
		int result = 0;
		if (n1 < 0) {
			result = n1 * (-1);
		} else {
			result = n1;
		}
		return result;
	}

	static String method6(char[] c1) {  //확인필요
		String str = "";
//		for (int i = 0; i < c1.length; i++) {
//			str += c1[i];
//		}
		for(char c : c1) {
			str += c;
		}
		return str;
	}
	
	static int method7(int[] n1) {
		int sum = 0;
		for(int i = 0; i < n1.length;i++) {
			sum += n1[i];
		}
		return sum;
	}
	
	static String[] method8(String s1, String s2) {
//		String[] str = new String[2];
//		
//		str[0] = s1;
//		str[1] = s2;
//		
		String[] str = {s1, s2};
		return str;
	}
}
