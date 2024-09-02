package DynamicExcel;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class part2 {
	public static String[][] excel() throws Exception{
		String fileLocation="./Excel/Untitled spreadsheet.xlsx";
		//locate the book
		XSSFWorkbook wbook=new XSSFWorkbook(fileLocation);
		
		//locate the sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
	
		//get last row value
	int lastrow=	sheet.getLastRowNum();
//get last cell
	short lastcell=	sheet.getRow(0).getLastCellNum();	
	String[][]data=new String[lastrow][lastcell];
		for(int i=1;i<=lastrow;i++) {
		//locate row
	
		XSSFRow row=	sheet.getRow(i);
	
	//locate the cell
	for(int j = 0 ; j<lastcell;j++) {
	XSSFCell cell = row.getCell(j);
	
	//String value=cell.getStringCellValue();
	DataFormatter formate=new DataFormatter();
	String formated=formate.formatCellValue(cell);
	System.out.println(formated);
	data[i-1][j]=formated;
	}
		}
		wbook.close();
		return data;
		
		
		
		
	}

}
