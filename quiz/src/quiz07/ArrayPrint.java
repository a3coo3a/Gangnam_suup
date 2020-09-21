package quiz07;

public class ArrayPrint {

	// 매서드 오버로딩, 문자열 배열 받아서, 배열 요소를

	String printArray(int[] a) {
		String arr;
		arr = "[";
		for (int i = 0; i < a.length; i++) {
			arr += a[i];
			if (i != a.length - 1) {
				arr += ",";
			}
		}
		arr += "]";

		return arr;
	}
	String printArray(String[] a) {
		String arr;
		arr = "[";
		for (int i = 0; i < a.length; i++) {
			arr += a[i];
			if (i != a.length - 1) {
				arr += ",";
			}
		}
		arr += "]";

		return arr;
	}
	String printArray(double[] a) {
		String arr;
		arr = "[";
		for (int i = 0; i < a.length; i++) {
			arr += a[i];
			if (i != a.length - 1) {
				arr += ",";
			}
		}
		arr += "]";

		return arr;
	}
	String printArray(char[] a) {
		String arr;
		arr = "[";
		for (int i = 0; i < a.length; i++) {
			arr += a[i];
			if (i != a.length - 1) {
				arr += ",";
			}
		}
		arr += "]";

		return arr;
	}
	String printArray(boolean[] a) {
		String arr;
		arr = "[";
		for (int i = 0; i < a.length; i++) {
			arr += a[i];
			if (i != a.length - 1) {
				arr += ",";
			}
		}
		arr += "]";

		return arr;
	}
	
}
