package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {

		/*
		 * 1. 파일을 읽어 들이는데 사용하는 클래스 FileInputStream입니다.
		 * 2. 생성자에 매개값으로 읽어들일 파일의 전체 경로를 적습니다.
		 */

		FileInputStream fis = null;
		try {

			fis = new FileInputStream("D:\\Course\\Java\\file\\hello.txt");

//			while (true) {
//				int data = fis.read();	// 1byte단위로 읽어 들어옴
//				if (data == -1) { // read() 의 return 조건중 마지막이면 -1반환이라는 것을 이용하여 탈출정의
//					break;
//				}
//				System.out.print((char) data); // 숫자로 들어오기 때문에 문자로 표현하기 위해 char로 형변환
//			}

			// 다른방식으로 가져오자
			byte[] arr = new byte[100];
			int result = fis.read(arr);
			System.out.println(result);	// 글자수 , 읽어들인 데이터의 길이
			System.out.println(Arrays.toString(arr));	// 글자별 아스키 코드 값 출력
			int i = 0;
			while (true) {
				if(arr[i] == 0) break;
				System.out.print((char)arr[i]);
				i++;
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
