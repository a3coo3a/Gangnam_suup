package quiz25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StreamQuiz03 {

	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 file경로에 하위폴더로 오늘 날짜 202020928 file폴더를 생성합니다.
		 * 2. 스캐너로 파일명을 입력받고, 파일명.txt파일로 파일을 씁니다.
		 * 3. exit 입력 받을 때까지 엔터를 포함해서 실시간으로 입력 받습니다.
		 * 4. exit로 파일이 써졌다면, 아무 방법으로나 파일을 읽어들이세요.
		 * 
		 */
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Scanner sc = new Scanner(System.in);

		File file = null;
		BufferedWriter bw = null;
		BufferedReader br = null;

		try {
			// 폴더 생성
			file = new File("D:\\Course\\Java\\file\\" + sdf.format(date));
			if (file.exists()) {
				System.out.println("해당 폴더는 이미 존재합니다.");
			} else {
				file.mkdir();
				System.out.println("폴더 생성 완료!");
			}
			// 파일 생성
			System.out.print("파일명 입력> ");
			String fileName = sc.nextLine();
			bw = new BufferedWriter(new FileWriter("D:\\Course\\Java\\file\\" + sdf.format(date) + "\\" + fileName + ".txt"));
			br = new BufferedReader(new FileReader("D:\\Course\\Java\\file\\" + sdf.format(date) + "\\" + fileName + ".txt"));

			while (true) {
				// 파일 내용 작성
				System.out.print("내용 입력 > ");
				String content = sc.nextLine();
				
				if (content.equals("exit"))	break;
				
				bw.write(content + "\r\n");
				bw.flush();
				
				// 파일 읽기
				String str = "";
				while ((str = br.readLine()) != null) {
					System.out.println(str);
				}

			}// while end

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		sc.close();
	}// main end
}
