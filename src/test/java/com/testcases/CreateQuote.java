package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.CreateQuoteObjects;

public class CreateQuote {
 
	WebDriver driver;
 
	public CreateQuote(WebDriver driver) 
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
  public void into_quotePage()
  {
	  CreateQuoteObjects quote_obj=new CreateQuoteObjects(driver);
	  
	  System.out.println("Into quote creation page");
	  
	  //click on quote/Application
	  
	  quote_obj.into_quotepage();
	  System.out.println("Into the Quote/Application page for quote creation ,driver::"+driver);
	  
	  System.out.println("Enter the data into quote");
	  quote_obj.insert_quote_data();
	  
  }
	
	
	
	
	
	
}