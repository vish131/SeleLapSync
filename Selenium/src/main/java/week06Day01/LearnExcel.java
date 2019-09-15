package week06Day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public Object[][] readExcel() throws IOException {
		FileInputStream fis = new FileInputStream(new File("./data/LoginLearnJun2.xlsx"));
		XSSFWorkbook wBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int RowNum = sheet.getLastRowNum();
		int ColNum = sheet.getRow(0).getLastCellNum();
		
		Object [][] data = new Object [RowNum] [ColNum];
		System.out.println("Row Count :"+RowNum+" "+"Coulmn Count :"+ColNum);

		for (int i=1; i<=RowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<ColNum; j++) {
				String value = row.getCell(j).getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			}
		}
		wBook.close();
		return data;

	}

}
