package com.toolsqa.framework.dataaccess;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ExcelReader {

	public String getExcelData(String filePath, String sheetName, int rowNumber, int colNumber) throws IOException
	{
		XSSFWorkbook workBook = new XSSFWorkbook(filePath);
		System.out.println("SheetCount: " + workBook.getNumberOfSheets());
		
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		String retValue = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
		
		workBook.close();
		
		return retValue;
	}
	
	public void setExcelData(String filePath, String sheetName, int rowNumber, int colNumber, String value) throws IOException
	{
		XSSFWorkbook workBook = new XSSFWorkbook(filePath);
		System.out.println("SheetCount: " + workBook.getNumberOfSheets());
		
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		XSSFRow row = sheet.getRow(rowNumber);
		XSSFCell cell = row.getCell(colNumber, XSSFRow.RETURN_BLANK_AS_NULL);
		
		if(cell==null)
			cell = row.createCell(colNumber);
		
		cell.setCellValue(value);
		
		workBook.write(new FileOutputStream(filePath));
		workBook.close();
	}
}