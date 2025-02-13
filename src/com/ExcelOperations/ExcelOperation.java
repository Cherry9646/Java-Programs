package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   //identify the excel
		FileInputStream excel = new FileInputStream("C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\src\\com\\ExcelOperations\\OpenCart-Test Scenarios .xlsx");
	
		//identify the wrokbook
		XSSFWorkbook excelworkbook = new XSSFWorkbook(excel);
		
		//identfy the sheet
		
		XSSFSheet Excelsheet = excelworkbook.getSheet("Test Scenarios");
		
		//identify the row
		
		XSSFRow Excelrow = Excelsheet.getRow(0);
		
		//identify the cell in row
		XSSFCell Excelcell = Excelrow.getCell(0);
	String value =	Excelcell.getStringCellValue();
	System.out.println(value);
		
	
	
	
	
	
	
	}

}
