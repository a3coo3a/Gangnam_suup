package quiz03;

public class Cafe {
	String coffee;
	String tea;
	String bread;

	int coffeePrice;
	int teaPrice;
	int breadPrice;

	Cafe() {
	}

	Cafe(String pCoffee, int pCoffeePrice, String pTea, int pTeaPrice, String pBread, int pBreadPrice) {
		coffee = pCoffee;
		tea = pTea;
		bread = pBread;
		coffeePrice = pCoffeePrice;
		teaPrice = pTeaPrice;
		breadPrice = pBreadPrice;
	}


	int order(String food, int su) {
		int change = 0;
		switch (food) {
		case "아메리카노":
			change = coffeePrice * su;
			break;
		case "유자차":
			change = teaPrice * su;
			break;
		case "치즈케이크":
			change = breadPrice * su;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			change = 0;
			break;
		}
		
		return change;
	}

	void pay(String food, int su, int money) {
		System.out.println("총 "+ order(food,su) +"원 입니다.");
		System.out.println(money + "원 받았습니다.");
		System.out.println("거스름돈은 "+ (money-order(food,su)) +"입니다.");
		System.out.println();
	}

}
