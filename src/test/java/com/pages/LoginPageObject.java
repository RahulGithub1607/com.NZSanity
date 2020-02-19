package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver driver;
	
	// find the objects for username , password and login button
	
		@FindBy(id="ctl00_cBc_wcLogin_lstxtLoginID")  WebElement usernmae_loginpage;
		
		@FindBy(id="ctl00_cBc_wcLogin_lstxtPassword") WebElement password_loginpage;
		
		@FindBy(id="ctl00_cBc_wcLogin_lsbtnLogin") WebElement Loginbutton_homepage;
		
	public LoginPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//set user name in textbox
	
	

	public void setUsername(String Username)
	{
		System.out.println("Setting uername method Username from excel Username ="+Username);
		System.out.println("User Input text box reference="+usernmae_loginpage);
		
		usernmae_loginpage.sendKeys(Username);
		
	}
	
	//set password in textbox
	
	public void setPassword(String password)
	{
		password_loginpage.sendKeys(password);
		
	}	
	
	//click on login button
	
	public void clickLoginbutton()
	{
		
		Loginbutton_homepage.click();
	}
	
	
	
	
}
