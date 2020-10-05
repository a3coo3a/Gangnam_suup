package quiz28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {

	public static void main(String[] args) {
		// 1. 해당 TXT읽어서 day, store, grade, detail, price을 멤버로 갖는 product 클래스를 생성
		// 2. Product 클래스는 getter,setter생성
		// 3. BufferedReader를 사용해서 건담.txt파일을 읽어 들입니다.
		// 4. 패턴별로 Product에 저장후 리스트에 추가
		// 5. 외부 라이브러리를 사용해서 xlsx엑셀 파일로 추출하면 됩니다.

		BufferedReader br = null;
		String line = null;
		String[] p = { "\\d{8}-\\d{2}-\\d+", "건담[가-힣]*\\s[가-힣]*", "\\[[가-힣]*[A-Z]*\\]", "\\d+,*\\d+원" };
		// 선생님 패턴
		// String[] p = {"\\d{8}-\\d{2}-\\d{12,13}","[가-힣]+ [가-힣]+","\\[[가-힣A-Z]+\\]","\\d+,*\\d+원"};
		int deStart = 0;
		int deEnd = 0;
		List<Product> list = new ArrayList<>();
		String[] arr = new String[5];

		// .xlsx 확장자 지원
		XSSFWorkbook xssfWb = null; 
		XSSFSheet xssfSheet = null;
		XSSFRow xssfRow = null; 
		XSSFCell xssfCell = null;

		try {
			br = new BufferedReader(new FileReader("D:\\Course\\Java\\workspace2\\quiz\\src\\quiz28\\건담.txt"));
			// br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Course\\Java\\workspace2\\quiz\\src\\quiz28\\건담.txt"),"UTF-8"));
			// 이렇게도 가능

			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				for (int i = 0; i < p.length; i++) {
					Matcher m = Pattern.compile(p[i]).matcher(line);
					if (m.find()) {
						if(i == 3) {
							String str = m.group().replace(",",	"").replace("원", "");
							str = String.format("%,d원", Integer.parseInt(str));	//% 바로 뒤에 , 를 붙이면 3자리 단위로 쉼표를 찍어줍니다.
							arr[i + 1] = str;
							deEnd = m.start() - 1;
							arr[i] = line.substring(deStart, deEnd);
						}else {
							arr[i] = m.group();
							deStart = m.end() + 1;
						}
					} // if end
				} // for end
				list.add(new Product(arr));
			} // while end
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + list.get(i).toString());
			}
			int rowNo = 0; // 행 갯수
			// 워크북 생성
			xssfWb = new XSSFWorkbook();
			// 워크시트 생성 : 이름 지정
			xssfSheet = xssfWb.createSheet("건담정보"); 
			
		    // 
			xssfRow = xssfSheet.createRow(rowNo++);
			xssfRow.createCell(0).setCellValue("날짜");
			xssfRow.createCell(1).setCellValue("매장");
			xssfRow.createCell(2).setCellValue("등급");
			xssfRow.createCell(3).setCellValue("상세");
			xssfRow.createCell(4).setCellValue("가격");
			
			while (rowNo < list.size()) {
				// 행생성
				xssfRow = xssfSheet.createRow(rowNo); // 헤더 01 //line마다
					// 열생성
					xssfCell = xssfRow.createCell(0); // product 0~4
					xssfCell.setCellValue(list.get(rowNo).getDay());
					xssfCell = xssfRow.createCell(1); 
					xssfCell.setCellValue(list.get(rowNo).getStore());
					xssfCell = xssfRow.createCell(2); 
					xssfCell.setCellValue(list.get(rowNo).getGrade());
					xssfCell = xssfRow.createCell(3); 
					xssfCell.setCellValue(list.get(rowNo).getDetail());
					xssfCell = xssfRow.createCell(4); 
					xssfCell.setCellValue(list.get(rowNo).getPrice());
					
				rowNo++;
			
			}
			FileOutputStream fos = new FileOutputStream(new File("D:\\Course\\Java\\workspace2\\quiz\\src\\quiz28\\" + "건담" + ".xlsx"));
			xssfWb.write(fos);

			if (xssfWb != null)
				xssfWb.close();
			if (fos != null)
				fos.close();

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main end

}
