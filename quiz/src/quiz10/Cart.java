package quiz10;

//부모클래스
public class Cart {
	// 장바구니가 가져야 하는 변수를 선언
	String[] cart = new String[1];
	int money;
	int i = 0; // 배열의 인덱스에 사용될 변수

	int tv; // 상품의 가격
	int com;
	int radio;
	Cart(){}
	Cart(int tv, int com, int radio){
		this.tv = tv;
		this.com = com;
		this.radio = radio;
	}
	Cart(int money){
		this.money = money;
	}
	void buy(String product) {
		System.out.println("재정의 해야 합니다.");
	}

	void add(String puduct) {
		System.out.println("재정의 해야 합니다.");
	}
	void info() {
		System.out.println("재정의 해야 합니다.");
	}

}// class end
