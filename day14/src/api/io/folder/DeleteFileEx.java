package api.io.folder;

import java.io.*;

public class DeleteFileEx {

	public static void main(String[] args) {
 
		try {
			
			File file = new File("D:\\Course\\Java\\file\\test_folder");
			
			if(file.exists()) {	//폴더가 존재하면 삭제
				file.delete();		// delete 성공시 true반환, 실패시 false반환
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("해당 폴더가 존재합니다");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
