package day01;

public class SystemOut {

	public static void main(String[] args) {

		/*
		 * 코드실행 단축키 - Ctrl + f11
		 * sysout이라고 적고 Ctrl + space를 누르면 println()이 자동 생성
		 * 
		 * 되돌리기 Ctrl + z
		 * 정렬 Ctrl + a, Ctrl + i
		 * 
		 * 코드를 옮길때  Alt + 방향키
		 * 이름을 동시에 변경하고 싶을  때 Alt + Shift + r
		 * 
		 */

		// 1. 개행을 포함하는 println()
		System.out.println("안녕하세요");
		System.out.println("반가워요~\n");


		// 2. 개행이 없는 print()
		System.out.print("줄바꿈이 없음...");
		System.out.print("코드를 가로로 출력할 때 사용합니다\n\n");


		/*
		 * \n 줄바꿈
		 * \t 8칸 탭 정렬
		 * %s 문자열을 입력받음
		 * %d 정수를 입력받음
		 * %f 실수를 입력받음
		 * %c 문자를 입력받음
		 * 
		 */


		// 3. 형식지정 출력문 printf()
		// 자바에서는 많이 사용하지 않는 형식
		System.out.printf("안녕하세요. 제 이름은 %s이고 오늘 날짜는 %d월 %d일 입니다.\n","홍길동",8,20);
		System.out.printf("파이 값은 %f입니다\n",3.14);
		System.out.printf("파이 값은 %.2f입니다\n",3.14);
	}
}
