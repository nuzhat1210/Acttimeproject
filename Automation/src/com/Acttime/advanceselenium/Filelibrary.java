package com.Acttime.advanceselenium;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelibrary {
	String path="./Testdata/commondata.property";
	public String readdatafrompropertyfile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
		Properties p=new Properties();
        String value = p.getProperty(key);
	return value;	
	}
public String readdatafromexcelfile(String sheetname,int row,int column) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./Testdata/Testdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);  //download Apache poi first and build path
	String value = wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	return value;
	
	
}
}
