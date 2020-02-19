package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadFromExcel {
	String cell_value;
	// file name is actual paths
		
	public String readExcel(int row, int col, String FileName,String excel_name,String SheetName) throws IOException
	{
		//create object File class to open the excel file
		
		File src =new File(FileName);
		
		//Craete object of fileinputstream class to read excel file
		
		FileInputStream fis=new FileInputStream(src);
				

		//Find the extension of excel either .xlsx or .xls
		
		String excel_extenaion= excel_name.substring(excel_name.indexOf("."));
		System.out.println("Extension of read file is :-"+excel_extenaion);
		
		//Workbook excel_workbook=null;
		
		
		if (excel_extenaion.equals(".xlsx"))
		{
			
		//if its "XLSX" then create object of XSSFWorkbook class
			
			XSSFWorkbook wb  =new XSSFWorkbook(fis);
			
			XSSFSheet sheet1=wb.getSheet(SheetName);
			
			String cell_value=sheet1.getRow(row).getCell(col).getStringCellValue();
			
			System.out.println("Data read "+cell_value);
			
			wb.close();
			fis.close();
			return cell_value;	
		}
		
		else if(excel_extenaion.equals(".xls"))
		{
		// If its "XLS" then HSSFWorkbook class	
			
			HSSFWorkbook wb  =new HSSFWorkbook(fis);
			
			HSSFSheet sheet1=wb.getSheet(SheetName);
			
			String cell_value=sheet1.getRow(row).getCell(col).getStringCellValue();
			System.out.println("Data read "+cell_value);
			
			wb.close();
			fis.close();
			return cell_value;
		}
		
		//System.out.println("Before return to function fetched cell value"+cell_value);
		
		fis.close();
		return cell_value;
		
	//	return cell_value; //add return string fetched value
		
	}

}
