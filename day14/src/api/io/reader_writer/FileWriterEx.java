package api.io.reader_writer;

import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {
		
		/*
		 * 문자를 써서 저장할때 사용하는 클래스 FileWriter클래스입니다.
		 * 기본적으로 2byte단위로 처리하기 때문에 문자를 쓰기에 적합합니다
		 */
		Writer fw = null;
		try {
			fw = new FileWriter("D:\\Course\\Java\\file\\test.txt");
			
			String str = "오늘은 9월 25일 입니다~ \r\n아 금요일이다~ \n집에 가야지~";		// 원래 정석은 \r\n이 되어야 엔터효과가 나나 속성 정의에 따라 \n만으로 가능하기도 함.
			
			fw.write(str);	// 매개변수로 String을 받아줌
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
