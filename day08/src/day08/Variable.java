package day08;

public class Variable {
	// 멤버변수
	// - 초기화 하지 않을 시 자동 초기화 진행
	// - 선언과 동시에 초기화는 가능하나, 별도로는 안됨. >> 멤버 변수는 실제로 아직 생성되지 않았기에 , 그래서 값을 변경할 수 없음.
	int a;

	// 메서드
	//
	void printNum(int c) {
		int b = 1;
		System.out.println("멤버변수 : " + a);
		System.out.println("지역변수 : " + b);
		System.out.println("매개변수 : " + c);
	}
}
