package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		/*
		 * buffered가 붙은 클래스는 입출력 성능을 향상시키기 위한 클래스
		 * buffered 뒤에 붙은 이름별 성향을 따라감
		 * outputStream : 바이트기반, 출력(쓰기) 위한 클래스
		 * 
		 * 생성자 매개변수(초기값)로 바이트기반 클래스를 받음.
		 * 
		 * buffered가 붙어 있는 클래스는 flush명령을 통해서 데이터를 밀어주는 작업을 해야합니다.
		 */

		// 매개변수 : OutputStream 이라는건 그 밑에 자식도 다 가능하다는 이야기! 즉, fileoutputStream도 가능하다는 이야기

		// FileOutputStream fos = new FileOutputStream("경로");
		// BufferedOutputStream bf = new BufferedOutputStream(fos);
		Scanner sc = new Scanner(System.in);
		BufferedOutputStream br = null;
		try {
			br = new BufferedOutputStream(new FileOutputStream("D:\\Course\\Java\\file\\test2.txt"));
			
			System.out.print("문자 >");
			String str = sc.nextLine();
			
			br.write(str.getBytes());	// getBytes로 바이트 배열로 변경해서 파일을 써내림.
			br.flush();	// 모은 버퍼의 내용을 밀어주는 역할.
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 뭐든지 close() 를 통해 닫을 때는 바깥 클래스 부터 닫아주어야 오류 없이 실행가능.
				br.close();		// bf가 닫힐때 자동으로 flush가 호출됩니다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	
	}

}
