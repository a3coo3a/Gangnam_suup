package quiz25;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StreamQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 file경로에서 오늘 날짜 이름으로 파일을 씁니다. ex)20200925.txt 
		 * 2. 내용은 아무거나 작성하세요.
		 * 3. 파일을 정상적으로 썻다면, BufferedReader를 이용해서 파일을 읽어오세요
		 * 
		 */
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		// System.out.println(df.format(date)); // String 반환

		// 파일 작성
		BufferedWriter bw = null;
		// 파일 읽기
		BufferedReader br = null;

		try {
			// 파일 작성
			bw = new BufferedWriter(new FileWriter("D:\\Course\\Java\\file\\" + df.format(date) + ".txt"));
			bw.write("하이 헬로 ~ 나나나나나나~");
			bw.flush();

			// 파일 읽기
			br = new BufferedReader(new FileReader("D:\\Course\\Java\\file\\" + df.format(date) + ".txt"));
			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}// main end

}
