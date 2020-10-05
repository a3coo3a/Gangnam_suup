package 두개뽑아서더하기;

import java.util.*;

// 정수 배열 numbers가 주어집니다.
// numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
// 제한사항
// numbers의 길이는 2 이상 100 이하입니다.
// numbers의 모든 수는 0 이상 100 이하입니다.
// numbers result
// [2,1,3,4,1] [2,3,4,5,6,7]
// [5,0,2,7] [2,5,7,9,12]

public class Solution {

	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		int[] numberss = { 5, 0, 2, 7 };
		System.out.println(Arrays.toString(solution(numberss)));
	}

	public static int[] solution(int[] numbers) {
		int[] answer = {};
		Set<Integer> set = new HashSet<Integer>();
		
		for (int k = 0; k < numbers.length; k++) {
			for (int j = k + 1; j < numbers.length; j++) {
				set.add(numbers[k] + numbers[j]);
			}
		}
		answer = new int[set.size()];
		int index = 0;
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			answer[index++] = iter.next();
		}

		Arrays.sort(answer);

		return answer;

	}

}
