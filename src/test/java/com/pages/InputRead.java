package com.pages;

import java.io.IOException;

import com.Utility.ReadFromExcel;

public class InputRead {
	
	//read browser from excel
	
	//String fileloc = "C:\\Rahul\\Selenium\\Workplace\\com.NZSanity\\src\\test\\resources\\TestData\\NZBMW.xlsx" ;
	
	public  String get_browser() throws IOException
	{
	ReadFromExcel rfx =new ReadFromExcel();
	
	String browser_test= rfx.readExcel(1,0,/*fileloc*/"C:\\Rahul\\Selenium\\Workplace\\com.NZSanity\\src\\test\\resources\\TestData\\NZBMW.xlsx",/*file name*/"NZBMW.xlsx","Sheet1");
	System.out.println("Browser from excel:-"+browser_test);
	return browser_test;
	
	}

	public String get_url() throws IOException {
		ReadFromExcel rfx =new ReadFromExcel();
		
		String browser_url= rfx.readExcel(1,1,/*fileloc*/"C:\\Rahul\\Selenium\\Workplace\\com.NZSanity\\src\\test\\resources\\TestData\\NZBMW.xlsx",/*file name*/"NZBMW.xlsx","Sheet1");
		System.out.println("Url  from excel:-"+browser_url);
		return browser_url;
	}
	
	
	
	
	
	
	

}
