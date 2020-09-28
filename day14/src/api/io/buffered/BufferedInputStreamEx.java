package api.io.buffered;

import java.io.*;

public class BufferedInputStreamEx {

	public static void main(String[] args) {

		/*
		 * Buffered 붙은 InputStream
		 * - 바이트 기반, 입력 속도를 향상시켜주기 위한 클래스
		 * 
		 */
		BufferedInputStream bf = null;

		try {
			bf = new BufferedInputStream(new FileInputStream("D:\\Course\\Java\\file\\test2.txt"));

			// byte[] arr = new byte[100];
			// bf.read(arr);
			// System.out.println(Arrays.toString(arr));

			while (true) {
				int a = bf.read();
				if (a == -1)
					break;
				System.out.print((char) a);
			}

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
		

	}// main end

}// class end
