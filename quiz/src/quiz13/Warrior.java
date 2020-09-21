package quiz13;

public class Warrior extends Player {

	// 1. 생성자 : name만 전달 받아서
	// hp = 1000, mp = 500, attack = 10 초기화
	Warrior(String name) {
		hp = 1000;
		mp = 500;
		attack = 10;
		this.name = name;
	}

	// 2. bash 스킬은 player 타입을 받아서 각각의 직업의 따라 해당 객체의 hp를 다르게 감소.
	// 1. Warrior 클래스의 bash()에 매개변수로 Warrior, Wizard가 모두 전달 될 수 있도록 변경해보세요.
	// 2. bash스킬에 play들이 적중되면 “~~~님 배쉬 스킬 적중“ 을 출력하고
	// 2. 전달 된 객체의 hp를 -100감소하도록 기능을 만들어 보세요.
	void bash() {
		System.out.println("때리기 스킬 사용");
	}

	void bash(Player p) {
		if (mp < 100) {
			System.out.println("mp가 부족합니다");
			return;
		}
		System.out.println(p.name + "님 배쉬 스킬 적중");
		
		if(p instanceof Warrior) {
			p.hp -= attack;
		}else if(p instanceof Wizard) {
			p.hp -= (attack*2);
		}
		
		mp -= 100;
	}
	
	

}// class end
