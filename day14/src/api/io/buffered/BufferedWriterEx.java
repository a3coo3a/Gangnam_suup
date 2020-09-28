package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {

		/*
		 * buffered 가 붙은 writer 클래스
		 * - 문자 기반을 읽을 때 사용
		 * - 성능향상 스트링
		 * 
		 * 순서대로 readLine으로 두문장을 받아서 파일쓰세요
		 */

		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		try {
			bw = new BufferedWriter(new FileWriter("D:\\Course\\Java\\file\\test3.txt"));

			System.out.print("문장 입력 > ");
			String str1 = sc.nextLine();
			System.out.print("문장 입력 > ");
			String str2 = sc.nextLine();
			
			bw.write(str1+"\r\n"+str2);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}// main end

}// class end
