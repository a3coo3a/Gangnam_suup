package day06;

import java.util.Scanner;

public class ArrayDelete {
	public static void main(String[] args) {

		/*
		 * // 4번째 인덱스의 삭제 표현
		 * 
		 * int[] arr = {1,2,3,4,5,6,7,8,9,10}; // 길이 10
		 * 
		 * 
		 * for(int i = 4; i < arr.length-1; i++) { arr[i] = arr[i+1]; // 삭제할부분 뒤쪽을 쭉
		 * 땡겨서넣는 것 }
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */

		String[] arr = new String[] { "강타", "문희준", "토니안", "이재원", "장우혁" };

		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 학생의 별명을 입력해 주세요 >");
		String name = scan.next();

		int count = arr.length; // 사람수 , 삭제 하면 count를 줄여서 끝을 줄이는 표현

		boolean chk = true;
		
		for (int i = 0; i < count; i++) { //탐색

			if (name.equals(arr[i])) { //삭제할 항목을 찾은 경우
				System.out.println(arr[i] + "(을)를 삭제 합니다.");
				for (int j = i; j < count - 1; j++) {	//삭제하는 작업
					arr[j] = arr[j + 1];
				}
				chk = false;
				count--;
			}
		}
		if(!chk) {
			System.out.println();
			System.out.println("----- 삭제 후 정보 -----");
			System.out.print("[");
			for (int i = 0; i < count; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("]");
		}else {
			System.out.println(name + "을 찾지 못하였습니다.");
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
