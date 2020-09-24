package quiz21;

import java.util.*;

public class ArrayListQuiz01 {
	public static void main(String[] args) {
		// list 에 1~20 까지 정수를 저장
		List<Integer> list = new ArrayList<Integer>(); 
		
		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
		System.out.println(list.toString());
		// 저장한 값을 반복문으로 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	
	}
}
