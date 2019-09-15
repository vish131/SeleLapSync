package week06Day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcelObject {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(new File("./data/LoginLearnJun2.xlsx"));
		XSSFWorkbook wBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Count :"+lastRowNum+" "+"Coulmn Count :"+lastCellNum);

		for (int i=1; i<=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<lastCellNum; j++) {
				String value = row.getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		wBook.close();

	}

}
