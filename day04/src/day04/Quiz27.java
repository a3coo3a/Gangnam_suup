package day04;

public class Quiz27 {
	public static void main(String[] args) {
		//quiz 13-1
		
		for (int i = 1; i <= 9; i += 3) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", i, j, i * j);
				System.out.printf("%d x %d = %d\t", i+1, j, (i+1) * j);
				System.out.printf("%d x %d = %d\t", i+2, j, (i+2) * j);
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
