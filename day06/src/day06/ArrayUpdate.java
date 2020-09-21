package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		
		// 스캐너로 입력 받고 입력 값이 있는지 찾는다. 
		// 없으면 , 없다고 출력
		// 찾으면 , 찾아서 수정함.
		// 찾았다, 못찾았다를 표현할 변수를 생성
		
		String[] arr = new String[] {"강타", "문희준", "토니안", "이재원", "장우혁"};
				
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 학생의 별명을 입력 >");
		String name = scan.next();
		
		boolean chk = true;
		
		for(int i = 0; i < arr.length; i++) {
		
			if(name.equals(arr[i])) {
				
				System.out.println(arr[i] + "의 별명을 수정합니다.");
				System.out.print("수정할 별명은 > ");
				arr[i] = scan.next();
				chk = false;
			}		
		}
		if(chk) {		// true면, 별명을 못찾은 것! 
			System.out.println(name + "(이)라는 별명은 없습니다.");
		}else {
			System.out.println(Arrays.toString(arr));
		}
		scan.close();
	}
}
