package overriding.basic;

public class MainClass {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		Child c = new Child();
		c.method01();
		c.method02();
		
	}
}
