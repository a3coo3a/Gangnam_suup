package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopyEx {

	public static void main(String[] args) {

		FileInputStream oldFile = null;
		FileOutputStream newFile = null;

		try {

			oldFile = new FileInputStream(
					"D:\\Course\\Java\\workspace2\\day14\\src\\api\\ip\\stream\\littledeep_baby_style2.png");
			newFile = new FileOutputStream("D:\\Course\\Java\\file\\copy.png"); // 써내릴 경로

			// byte[100]씩 읽을것

			byte[] arr = new byte[100];
			// while (true) {
			// int result = oldFile.read(arr); // 100씩 읽어서 arr에 집어 넣는 것 , arr사이즈가 100이니까
			//
			// System.out.println(result);
			// if (result == -1)
			// break; // 더 읽을것이 없으면 read는 -1을 반환, 이를 이용하여 탈출조건 작성
			//
			// // newFile.write(arr);
			// newFile.write(arr, 0, result); // 길이를 지정해서 출력할 수 있어, arr에 0번째부터 result까지 읽어서 파일을 씀
			// }

			// 다른 방법으로 읽어보자
			int result;
			while ((result = oldFile.read(arr)) != -1) {
				newFile.write(arr, 0, result);
			}
			System.out.println("파일이 정상적으로 복사되었습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		
	}

}
