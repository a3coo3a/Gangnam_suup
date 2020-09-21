package day08_quiz;

import java.util.Arrays;

public class MethodQuiz04 {
	public static void main(String[] args) {

		int[] arr = lottoNum();
		System.out.println(Arrays.toString(arr));
		long count = lottoRun(arr);
		
	}// main end

	static int[] lottoNum() {

		int[] arr = new int[6];
		int index = 0;
		start: while (index < 6) {
			int num = (int) (Math.random() * 45 + 1);

			// 중복검사
			// 0~index-1까지 같은지 확인해야지
			for (int i = 0; i < index; i++) {
				if (num == arr[i]) {
					continue start; // 중복
				}
			}

			arr[index] = num;
			index++;
		}

		return arr;
	}

	static long lottoRun(int[] arr) {
		long count = 0;
		Arrays.sort(arr);
		
		while (true) {
			int[] arr2 = lottoNum();
			Arrays.sort(arr2);
			
			if (Arrays.equals(arr, arr2)) {
				return count * 1000;
			}
			
			count++;
		}

	}

}
