package quiz13;

public class MainClass {
	public static void main(String[] args) {
		Warrior me = new Warrior("강한친구대한전사");
		
		Wizard play2 = new Wizard("구르미그린마법사");
		Warrior play3 = new Warrior("전사약해요");
		
		
		System.out.println("---나의 캐릭 배쉬스킬 사용---");
		me.bash(play2);
		me.bash(play3);

		play2.info();
		play3.info();
		
		Player[] arr = {me, play3};
		play2.blizzard(arr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Warrior war = new Warrior();
//		Wizard wiz = new Wizard();
//		
//		war.name = "강한친구대한전사";
//		war.hp = 1000;
//		war.mp = 500;
//		
//		wiz.name = "구르미그린달빛";
//		wiz.hp = 500;
//		wiz.mp = 1000;
//		
//		System.out.println("-----마법사-----");
//		wiz.info();
//		wiz.iceArrow();
//		
//		System.out.println("-----전사-----");
//		war.info();
//		war.bash();
		
		
	}
}
