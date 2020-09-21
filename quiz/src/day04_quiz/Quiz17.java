package day04_quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = scan.nextInt();
		
		System.out.println();
		System.out.println("1번");
		// 1. 1 ~ 입력받은 정수까지 3의 배수 이거나, 4의 배수일 경우 가로 출력
		System.out.println("1~"+ num + "까지 중에서 3의 배수 이거나 4의 배수인 경우는 ");
		while (i <= num) {
			if(i % 3 == 0 || i % 4 == 0) {
				System.out.print(i + ", ");
			}
			i++;
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("2번");
		// 2. 1~ 입력받은 정수까지 6의 배수의 합
		i = 1;
		while(i <= num) {
			if(i % 6 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("1~" + num + "까지 중 6의 배수의 합은 :" + sum);
		
		System.out.println();
		System.out.println("3번");
		// 3. 1~100까지 정수 중의 4의 배수이면서 8의 배수가 이닌 수의 개수
		i = 1;
		while(i <= 100) {
			if(i % 4 == 0 && i % 8 != 0) {
				count++;
			}
			i++;
		}
		System.out.println("1~100까지 정수 중의 4의 배수이면서 8의 배수가 이닌 수의 개수 : " + count);
		
		System.out.println();
		System.out.println("4번");
		// 4. 1000의 약수의 개수
		// 약수 : 어떤 정수를 나누어 떨어지게 하는, 0이 아닌 정수
		// 즉, 주어진 정수를 나누었을 때 나머지가 0이 되는 수
		
		i = 1;
		count = 0;
		while(i <= 1000) {
			if(1000 % i == 0) {
				System.out.print(i + ", ");
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println("1000의 약수의 갯수 : " + count);
		
		
		scan.close();
	}

}
