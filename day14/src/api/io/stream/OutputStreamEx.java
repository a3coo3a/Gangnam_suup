package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {

		/*
		 * 1. FileOutputStream은 파일을 쓸때 사용하는 클래스 입니다
		 * 2. 생성자 매개값으로 파일을 쓸 전체 경로를 지정합니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 > ");
		String name = sc.next();
		sc.nextLine();
		FileOutputStream fos = null;
		try {
			
			fos = new FileOutputStream("D:\\Course\\Java\\file\\" + name + ".txt");
			System.out.print("문장을 입력하세요 > ");
			String str = sc.nextLine();

			byte[] arr = str.getBytes();

			fos.write(arr);			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		sc.close();

	}

}
