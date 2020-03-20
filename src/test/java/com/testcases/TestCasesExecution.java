package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.InitializeBrowser;

import junit.framework.Assert;




public class TestCasesExecution {
	
	 public static WebDriver driver;

	
    @Test
    public static void browser_setup() throws IOException
    
    {
    	InitializeBrowser init_browser =new InitializeBrowser(driver);
    	
    	//InitializeBrowser init_browser =new InitializeBrowser(driver);
    	
    	System.out.println("Browser_setup and driver ref:- "+driver);
    	
    	driver=init_browser.Browser_Initialisation(driver);
    
    	//accept the driver value
    	
    	System.out.println("Before enter to Login Home page web driver:" +driver);
    	
    	
    }
    

    @Test
    public static void login_homePage() throws IOException
    {
     
    	System.out.println("In Login Home page WebDriver  "+driver);
    	
    		
      LoginToNZ lz = new LoginToNZ(driver);
      
      lz.LoginToNZDFE(driver);
      
      System.out.println("Login to DFE is completed and driver is "+driver);
      
      lz.get_loginPage(driver);
      
      String page_title=driver.getTitle();
      
      System.out.println("Assertion is for page title");
      Assert.assertEquals(page_title, "Inbox");
      
      //return driver;
      
      
      
    }
    
    
    @Test
    public static void quote_creation()
    {
    	
    	System.out.println("Quote creation code::");
    	CreateQuote cq =new CreateQuote(driver);
    	cq.into_quotePage();
    	
    }

}
