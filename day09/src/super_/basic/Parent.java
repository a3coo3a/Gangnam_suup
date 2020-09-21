package super_.basic;

public class Parent {
	String father;
	String mother;

	// 기본 생성자가 없는 경우
	Parent(String father, String mother) {
		this.father = father;
		this.mother = mother;
	}

	void info() {
		System.out.println("아버지 : " + this.father + "어머니 : " + this.mother);
	}
}
