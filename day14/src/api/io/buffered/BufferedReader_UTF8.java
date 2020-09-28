package api.io.buffered;

import java.io.*;

public class BufferedReader_UTF8 {
	// InputStreamReader
	// - 중간매개자
	// - 인코딩을 위해 연결해 주는것
	// - inputStream으로 들어온걸 Reader로 바꿔주는 역할
	// - UTF-8이 아닌 인코딩타입을 읽어올때 바꿔서 읽을 수 있도록 해줌.
	// - euc-kr 형식으로 읽어 들어와라.

	public static void main(String[] args) {
		BufferedReader bf = null;

		try {

			// bf = new BufferedReader(new InputStreamReader(System.in));

			// bf = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));

			bf = new BufferedReader(
					new InputStreamReader(new FileInputStream("D:\\Course\\Java\\file\\test3.txt"), "EUC-KR"));

			String str = null;

			while ((str = bf.readLine()) != null) {
				System.out.println(str);
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
