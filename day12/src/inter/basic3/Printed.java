package inter.basic3;

// 1. 인터페이스 사용방법이 동일한 클래스를 만드는 방법
// 2. 클래스를 사용하는데, 반드시 구현해야 할 메서드를 정의 

/*
 * Ms에서 만든 print 를 사용하려면 Printed 하여라~
 */

public interface Printed {
	public void turnOn();
	public void turnOff();
	public void print(String document);
	public void colorPrint(String document, String color);
	public int copy(int n);
	
}
