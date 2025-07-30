package genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary implements FrameworkConstatnt {
	static FileInputStream fis;
	static Workbook book;
	

	public static String readData(String sheet, int row, int column)
	{
		System.out.println("Read data successful");
		//1.Convert external file into java readable file using File input stream class
		 try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2.Create an workbook using work book factory
		 try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Read the data using workbook, sheet, row, and column
	String	data=book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		
		return data;
		
	}
public static String writeData(String sheet, int row, int column, String data) {
	
	System.out.println("Write data successful");
	//1.Convert external file into java readable file using File input stream class
	 try {
		fis = new FileInputStream(excelpath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//2.Create an workbook using work book factory
	 try {
		book = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//3.Write the data in Existing sheet and row
	book.getSheet(sheet).getRow(row).createCell(column).setCellValue(data);
	
	return data;
	
}

}
