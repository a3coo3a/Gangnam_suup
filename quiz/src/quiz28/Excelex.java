package quiz28;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelex {

	public static void main(String[] args) {

		//.xlsx 확장자 지원
		XSSFWorkbook xssfWb = null; // .xlsx
		XSSFSheet xssfSheet = null; // .xlsx
		XSSFRow xssfRow = null; // .xlsx
		XSSFCell xssfCell = null;// .xlsx
		
		try {
			int rowNo = 0; // 행 갯수 
			// 워크북 생성
			xssfWb = new XSSFWorkbook();
			xssfSheet = xssfWb.createSheet("건담정보"); // 워크시트 이름
			
			CellStyle cellStyle_Body = xssfWb.createCellStyle(); 
			cellStyle_Body.setAlignment(HorizontalAlignment.LEFT); 
			
			//헤더 생성
			xssfSheet.addMergedRegion(new CellRangeAddress(rowNo, rowNo, 0, 1)); //첫행,마지막행,첫열,마지막열
			
			while (rowNo < 5) {
				xssfRow = xssfSheet.createRow(rowNo++); // 헤더 01 //line마다
				for (int i = 0; i < 5; i++) {
					xssfCell = xssfRow.createCell((short) i); // product 0~4
					xssfCell.setCellStyle(cellStyle_Body);
					xssfCell.setCellValue("헤더0"+(i+1)+ "셀0"+(i+1));
				}
			}
			FileOutputStream fos = new FileOutputStream(new File("D:\\Course\\Java\\workspace2\\quiz\\src\\quiz28\\" + "연습" + ".xlsx"));
			xssfWb.write(fos);

			if (xssfWb != null)	xssfWb.close();
			if (fos != null) fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
