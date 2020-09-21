package quiz04;

public class MainClass {
	public static void main(String[] args) {
		Warrior war = new Warrior();
		Wizard wiz = new Wizard();
		
		war.name = "강한친구대한전사";
		war.hp = 1000;
		war.mp = 500;
		
		wiz.name = "구르미그린달빛";
		wiz.hp = 500;
		wiz.mp = 1000;
		
		System.out.println("-----마법사-----");
		wiz.info();
		wiz.iceArrow();
		
		System.out.println("-----전사-----");
		war.info();
		war.bash();
	}
}
