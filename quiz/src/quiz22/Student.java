package quiz22;

import java.util.*;

public class Student {

	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;
	private Scanner sc = new Scanner(System.in);

	// 학생정보를 입력 받는 메서드
	public String inputStuInfo() {
		/*
		 * 학번, 이름, 국영수를 입력받고,
		 * 국영수는 문자열이 입력시에 다시 받을 수 있도록 예외처리
		 */
		System.out.println("학생의 정보를 입력하세요.");
		System.out.print("학번 > ");
		stuId = sc.nextLine();
		System.out.print("이름 > ");
		name = sc.nextLine();
		
		while (true) {
			try {
				System.out.print("국어점수 > ");
				kor = sc.nextInt();
				System.out.print("영어점수 > ");
				eng = sc.nextInt();
				System.out.print("수학점수 > ");
				math = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요");
			} 
		}
		sc.nextLine();
		
		calcTotAvg();

		return stuId;
	}

	// 총점, 평균, 학점을 계산 메서드
	public void calcTotAvg() {
		// 합계, 평균, 등급을 나누어서 멤버변수 저장
		total = kor+eng+math;
		avg = total/3.0;
		switch ((int)avg/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	// 학생정보 출력 메서드
	public void outputInfo() {
		System.out.printf("%4s%6s%11d점%11d점%11d점%11d점%11.2f점%10s등급\n", stuId, name, kor, eng, math, total, avg, grade);
	}

	// getter, setter
	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}// class end
