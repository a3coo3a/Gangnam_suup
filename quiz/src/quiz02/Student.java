package quiz02;

public class Student {
	// 멤버변수
	// name : 이름
	// no : 번호
	// kor : 국어
	// eng : 영어
	// math : 수학
	// 생성자는 5개를 초기화 하는 생성자

	// 메서드
	// getTotal() - 국영수 점수의 합계를 반환
	// getAvg() - 총점을 나눈 평균을 소수점 2자리까지 반환

	String name;
	int no;
	int kor, eng, math;

	Student() {
	}

	Student(String sName, int sNo, int sKor, int sEng, int sMath) {
		name = sName;
		no = sNo;
		kor = sKor;
		eng = sEng;
		math = sMath;
	}

	int getTotal() {
		return kor + eng + math;
	}

	double getAvg() {
		double avg = getTotal() / 3.0;
		int a = (int) (avg * 100);

		return a / 100.0;
	}

	void showInfo() {
		System.out.println(name + "의 총점은 " + getTotal() + "점 이고, 평균은 " + getAvg() + "점 입니다.");
	}
}
