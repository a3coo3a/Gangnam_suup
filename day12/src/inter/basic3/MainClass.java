package inter.basic3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		List list = new ArrayList();	// list는 arraylist의 인터페이스

		Printed p = new LG();  //new Samsung();
		p.turnOn();
		p.print("가나다");
		p.colorPrint("마바사", "black");
		p.copy(10);
		p.turnOff();
	}
}
