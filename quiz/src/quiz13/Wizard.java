package quiz13;

public class Wizard extends Player {

	Wizard(String name) {
		hp = 500;
		mp = 1000;
		attack = 10;
		this.name = name;
	}

	void iceArrow() {
		System.out.println("얼음화살 사용");
	}

	// 기능
	// 1. 매개변수 players배열을 향상된 for문으로 회전
	// 2. for문안에서는 10~15사이의 랜덤 난수를 발생
	// 3. players 배열의 hp를 각각 랜덤난수 만큼 감소 시킵니다.
	// 4. players 배열의 이름과 함께 랜덤 피해를 각각 출력하세요
	public void blizzard(Player[] players) {
		System.out.println("------------------------");
		System.out.println(name + "님의 눈보라 시전!");

		for (Player p : players) {	//길이만큼 회전
			int damage = (int)(Math.random()*6) + 10;
			p.hp -= damage;
			System.out.println(p.name+"님이 "+damage+"만큼 피해를 입었습니다.");
		}
	}

}// class end
