package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {

		BufferedReader bf = null;

		try {
			// System.in의 반환 값이 InputStream 타입인걸 활용하여 적용
			// - 카보드로 부터 값을 받을 수 있습니다.
			// InputStreamReader is = new InputStreamReader(System.in);
			// bf = new BufferedReader(is);
			// bf = new BufferedReader(new InputStreamReader(System.in));

			// 경로로부터 파일 데이터를 읽어옴.
			bf = new BufferedReader(new FileReader("D:\\Course\\Java\\file\\test3.txt"));

			// readLine() - 한줄씩 읽어오는 기능 ,
			// System.out.println(bf.readLine());
			// System.out.println(bf.readLine());
			// System.out.println(bf.readLine());

			String str = "";
			while ((str = bf.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
