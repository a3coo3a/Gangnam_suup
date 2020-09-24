package quiz22;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Student student = new Student();
		Point p = new Point();
		List<Student> students = new ArrayList<Student>();

		// student.inputStuInfo();
		// student.outputInfo();
		end : while (true) {
			InterPoint.menuInfo();
			System.out.print("메뉴 입력 > ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1: // 성적정보 입력
				p.input(students);
				break;
			case 2: // 전체성적 조회
				p.showAll(students);
				break;
			case 3: // 개별성적 조회
				p.search(students);
				break;
			case 4:	// 성적정보 수정
				p.modify(students);
				break;
			case 5:	// 성적정보 삭제
				p.delete(students);
				break;
			case 6:	// 프로그램 종료
				System.out.println("프로그램이 종료됩니다");
				break end;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}

	}

}
