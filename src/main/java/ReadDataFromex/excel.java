package ReadDataFromex;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	public static void main(String[] args) throws Exception {
		String fileLocation="./Excel/Untitled spreadsheet.xlsx";
		
		
		XSSFWorkbook wbook=new XSSFWorkbook(fileLocation);
	
		XSSFSheet sheet=wbook.getSheetAt(0);
		
		for(int i=1;i<3;i++) {
			XSSFRow rows = sheet.getRow(i);
			for(int j=0;j<2;j++) {
				XSSFCell cell = rows.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		
		}
		
		

	
	
	}
	
	

}
