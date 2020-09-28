package quiz25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamQuiz01 {

	public static void main(String[] args) {
		// 1. 스캐너를 통해서 파일명을 입력받습니다.
		// 2. upload폴더에 해당파일이 있다면, 해당파일을 uploadcopy폴더로 복사하세요
		// 파일명이 없으면, "파일이 없습니다" 예외구문을 출력합니다.
		// 3. 복사도중 에러가 발생하면, "파일 처리중 예외발생" 구문을 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 >");
		String fileName = sc.nextLine();

		FileInputStream oldFile = null;
		FileOutputStream newFile = null;

		try {
			oldFile = new FileInputStream("D:\\Course\\Java\\upload\\" + fileName);		// 읽어오는 것
			newFile = new FileOutputStream("D:\\Course\\Java\\uploadcopy\\" + fileName);	// 새로운걸 쓰는 것

			byte[] arr = new byte[100];
			int result;

			while ((result = oldFile.read(arr)) != -1) {
				newFile.write(arr); // 범위 지정 없으면 전체 복사
			}
			System.out.println("파일이 정상적으로 복사되었습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일 처리중 예외 발생");
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		sc.close();

	}

}
