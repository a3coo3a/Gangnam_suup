package day07_quiz;

import java.util.Arrays;

public class MethodQuiz04 {
	public static void main(String[] args) {

		int[] arr = lottoNum();
		System.out.println(Arrays.toString(arr));
		long money = lottoRun(arr);
		System.out.println("당첨되기까지 사용한 금액 : " + money);

	}// main end

	static int[] lottoNum() {

		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		} // for
		return arr;
	}

	static long lottoRun(int[] arr) {
		long money = 1000;
		int count = 0;
		// [28, 13, 1, 22, 3, 32]
		while (true) {
			int[] arr2 = lottoNum();

		
			//Arrays.sort(arr);
			sortRun(arr);
			//Arrays.sort(arr2);
			sortRun(arr2);

			if (Arrays.equals(arr, arr2)) {// 순서까지 같으면 true
				break;
			}
			count++;
		}

		return (money * count);
	}

	static int[] sortRun(int[] arr) {
		for (int i = 0; i < arr.length; i++) {			// 가장 작은 수를 왼쪽에
			for (int j = 0; j < arr.length - 1; j++) {		
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
