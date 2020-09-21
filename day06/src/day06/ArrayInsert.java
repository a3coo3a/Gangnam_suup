package day06;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		//배열의 insert
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];
		int count = 0;	// 입력받은 개수를 카운트 해서 index로 사용할 변수
		
		//System.out.println(Arrays.toString(arr));		// null이 출력되는 걸 확인 할 수 있음.
		
		
		//nextLine 공백 포함 출력 가능
		System.out.println("먹고 싶은 음식은? ");
		System.out.println("입력을 중지하려면 [그만]을 입력하세요");
		
		while(true) {
		
			System.out.print("> ");
			String menu = scan.nextLine();
			
			
			// 문자열의 비교는  equals
			if(menu.equals("그만")) {	// 문자열 비교는 ==이 되지 않음.
				System.out.println("입력종료");
				break;
			}
			
			arr[count] = menu;
			count++;
			
			//System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("------ 입력 받은 메뉴 -----");
		System.out.print("[ ");
			for(int i = 0; i < count; i++) {
				System.out.print(arr[i] + " ");
			}
		System.out.print("]");
		
		
		scan.close();
	}
}
