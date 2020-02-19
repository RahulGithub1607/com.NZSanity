package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.Utility.ReadFromExcel;
import com.pages.LoginPageObject;




public class LoginToNZ {
	
	WebDriver driver;
	public String username_excel;
	public String pwd_excel;
	
	
public LoginToNZ(WebDriver driver) {
		driver=this.driver;
		
	
	}

	
	
public void LoginToNZDFE(WebDriver driver) throws IOException {
	
	System.out.println("In Login to NZ DFE webdriver is :- "+driver);
	// find the username and password field
	
		ReadFromExcel ex = new ReadFromExcel();
		
		//username
		
		String username_excel = ex.readExcel(1, 2, /*fileloc*/"C:\\Rahul\\Selenium\\Workplace\\com.NZSanity\\src\\test\\resources\\TestData\\NZBMW.xlsx",/*file name*/"NZBMW.xlsx", "Sheet1");
		System.out.println("Username fetched from the Provided Excel:- "+username_excel);
		this.username_excel=username_excel;
		
		//password
	
		String pwd_excel =ex.readExcel(1, 3, /*fileloc*/"C:\\Rahul\\Selenium\\Workplace\\com.NZSanity\\src\\test\\resources\\TestData\\NZBMW.xlsx",/*file name*/"NZBMW.xlsx", "Sheet1");
		System.out.println("Password Fetched from the Provided Excel:- "+pwd_excel);
		this.pwd_excel=pwd_excel;
		
	}



	public void get_loginPage(WebDriver driver) throws IOException {
		
	//enter the login credentials and click on login button
	
	LoginPageObject lpo =new LoginPageObject(driver);
	
	System.out.println("In Login page username :-"+username_excel);
	
	lpo.setUsername(username_excel);
	System.out.println("User name is set:-"+username_excel);
	
	
	lpo.setPassword(pwd_excel);
	System.out.println("Password is set"+pwd_excel);
	
	lpo.clickLoginbutton();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	
	
	
}


	
	

	

	
	
	
	

}
