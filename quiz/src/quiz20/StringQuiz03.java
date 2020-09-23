package quiz20;

import java.util.Scanner;

public class StringQuiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String message = Palindrome.setMessage();
			if(message.equals("종료")) break;
			//Palindrome.palindromeCheck(message);
			//Palindrome.myCheck(message);
			//Palindrome.myCheck2(message);
			//System.out.println(Palindrome.samCheck(message));
			System.out.println(Palindrome.strBufferCheck(message));
		}
		
		sc.close();
	}
}
