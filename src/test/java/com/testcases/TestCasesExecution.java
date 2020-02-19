package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.InitializeBrowser;


public class TestCasesExecution {
	
	 public static WebDriver driver;

	
    @Test
    public static void browser_setup() throws IOException
    
    {
    	
    	InitializeBrowser init_browser =new InitializeBrowser(driver);
    	
    	System.out.println("Browser_setup and driver ref:- "+driver);
    	
    	driver=init_browser.Browser_Initialisation(driver);
    
    	//accept the driver value
    	
    	System.out.println("Before enter to Login Home page web driver:" +driver);
    	
    	
    }
    

    @Test
    public static void login_homePage() throws IOException
    {
     
    	System.out.println("In Login Home page WebDriver  "+driver);
    	
    	//need to fix here
    	
      LoginToNZ lz = new LoginToNZ(driver);
      
      lz.LoginToNZDFE(driver);
      
      System.out.println("Login to DFE is completed and driver is "+driver);
      
      lz.get_loginPage(driver);
      
      //return driver;
      
    }
    
    
    

}
