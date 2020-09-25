package quiz22;

import java.util.*;

public class Point implements InterPoint {
	Scanner sc = new Scanner(System.in);

	@Override
	public void showPointUI() { // 제목
		// showPointUI기능

		System.out.println("===========================================================");
		System.out.printf("%4s%10s%10s%10s %11s%11s%11s %11s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "학점");
		System.out.println("===========================================================");

	}

	@Override
	public void input(List<Student> students) {
		// input의 기능-학생의 성적정보를 입력할 메서드
		/*
		 * 1. 학생의 객체를 1개 생성합니다.
		 * 2. 학생의 객체에 속성값을 설정하는 메서드들을 호출!
		 * -만약 입력한 학번이 이미 list에 존재하는 학번이라면 "이미 등록된 학번 입니다"를 출력하고 메서드종료
		 * 3. 정보저장이 완료된 객체를 리스트에 추가!
		 * 4. 저장완료 메세지를 출력하세요.
		 * ex) XXX님의 성적 정보가 정상적으로 입력되었습니다.
		 */
		Student student = new Student(); // 객체가 다르게 생성되야 하므로 함수에 존재해야 함.
		String stuId = student.inputStuInfo();
		if (students.size() == 0) {
			students.add(student);
			System.out.println(students.get(students.size() - 1).getName() + "님의 성적 정보가 정상적으로 입력되었습니다.");
		} else {
			for (int i = 0; i < students.size(); i++) {
				if (students.get(i).getStuId().equals(stuId)) {
					System.out.println("이미 등록된 회원입니다.");
					return;
				}
			}

			students.add(student);
			System.out.println(students.get(students.size() - 1).getName() + "님의 성적 정보가 정상적으로 입력되었습니다.");

		}
	}

	@Override
	public void showAll(List<Student> students) {
		// showAll의 기능-전체 학생들의 성적정보를 출력할 메서드
		/*
		 * 1. 리스트 안에 들어있는 학생객체들의 정보를 반복문을 통해 전체 출력하세요.
		 * 2. 우리반의 전체평균을 가장 아랫부분에 출력하세요.
		 */
		double totAvg = 0.0;
		if (students.size() == 0) {
			System.out.println("학생정보가 비어 있습니다. 등록후 이용하세요");
		} else {
			showPointUI();
			for (Student student : students) {
				student.outputInfo();
				totAvg += student.getAvg();
			}
			System.out.printf("우리반 전체 평균  : %6.2f\n", (totAvg / students.size()));
		}
	}

	@Override
	public void search(List<Student> students) {
		// search의 기능 - 학번과 일치하는 학생을 찾는 메서드
		/*
		 * 1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 정보만 출력하세요.
		 * 2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력하세요.
		 */
		if (students.size() == 0) {
			System.out.println("학생정보가 비어 있습니다. 등록후 이용하세요");
			return;
		} else {
			System.out.print("찾을 학번 입력 >");
			String stuId = sc.nextLine();
			boolean ch = false;
			for (Student student : students) {
				if (student.getStuId().equals(stuId)) {
					showPointUI();
					student.outputInfo();
					ch = true;
				}
			}
			if (!ch) {
				System.out.println(stuId + "번이 존재하지 않습니다.");
			}
		}
	}

	@Override
	public void modify(List<Student> students) {
		// modify의 기능 - 학번과 일치하는 정보를 수정하는 메서드
		/*
		 * 1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 국어,영어,수학 점수를 수정하세요.
		 * 2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력 하세요.
		 */
		if (students.size() == 0) {
			System.out.println("학생정보가 비어 있습니다. 등록후 이용하세요");
		} else {
			System.out.print("찾을 학번 입력 >");
			String stuId = sc.nextLine();
			boolean ch = false;
			for (Student student : students) {
				if (student.getStuId().equals(stuId)) {
					System.out.println("수정할 점수 입력");
					System.out.print("국어 > ");
					student.setKor(sc.nextInt());
					System.out.print("영어 > ");
					student.setEng(sc.nextInt());
					System.out.print("수학 > ");
					student.setMath(sc.nextInt());
					sc.nextLine();
					System.out.println(student.getName() + "님의 정보가 수정되었습니다.");
					ch = true;
				}
			}
			if (!ch) {
				System.out.println(stuId + "번이 존재하지 않습니다.");
			}
		}
	}

	@Override
	public void delete(List<Student> students) {
		// delete기능 - 학번과 일치하는 정보를 삭제하는 기능
		/*
		 * 1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 모든 정보를 삭제하세요.
		 * 2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력 하세요.
		 */
		if (students.size() == 0) {
			System.out.println("학생정보가 비어 있습니다. 등록후 이용하세요");
		} else {
			System.out.print("찾을 학번 입력 >");
			String stuId = sc.nextLine();
			boolean ch = false;
			for (int i = 0; i < students.size(); i++) {
				if (students.get(i).getStuId().equals(stuId)) {
					System.out.println(students.get(i).getName() + "님의 정보가 삭제되었습니다.");
					students.remove(students.get(i));
					ch = true;
				}
			}
			if (!ch) {
				System.out.println(stuId + "번이 존재하지 않습니다.");
			}
		}

	}

}
