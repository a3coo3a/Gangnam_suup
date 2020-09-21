package quiz07;


public class MainClass {
	public static void main(String[] args) {

		ArrayPrint ap = new ArrayPrint();

		int[] arr = { 1, 2, 34, 100, 50 };
		String[] arr2 = { "a", "b", "c", "d" };

		System.out.println(ap.printArray(arr));
		System.out.println(ap.printArray(arr2));
		
	}
}
