package day08;

public class ObjectBasic02 {
	public static void main(String[] args) {

		
		System.out.println("------ 1번계산기 -----");
		
		Calculator call = new Calculator();
		
		System.out.println(call.add(1));
		System.out.println(call.add(2));
		System.out.println(call.add(3));
		
		
		System.out.println("----- 2번 계산기 ------");
		
		Calculator call2 = new Calculator();
		
		System.out.println(call2.add(10));
		System.out.println(call2.add(20));
		System.out.println(call2.add(20));
		
	}

	
}
