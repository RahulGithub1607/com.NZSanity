package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


// put gecko driver on "C:\Rahul\Selenium\drivers\geckodriver-v0.24.0-win64\geckodriver.exe"

// put IE driver C:\\Rahul\\Selenium\\drivers\\IE driver\\selenium-html-runner-4.0.0-alpha-1.jar

//put chrome driver C:\\Rahul\\Selenium\\drivers\\Chrome Driver\\chromedriver_win32\\chromedriver.exe

public class InitializeBrowser {
	String login_url;
	WebDriver driver;
	
	public InitializeBrowser(WebDriver driver) {
		

		this.driver=driver;
	}

	public WebDriver Browser_Initialisation(WebDriver driver) throws IOException {

    	//Read browser and URL from test data excel
		
    	InputRead ln =new InputRead();
    	String browser_use=ln.get_browser();
    	
    	System.out.println("browser coming into code :"+browser_use);
    	
    	login_url = ln.get_url();
    	System.out.println("Url used in the code:-"+login_url);
    	
    	if(browser_use.equals("IE"))
    	{
    		//IE browser code
    		System.out.println("In IE browser");
    		System.setProperty("webdriver.ie.driver", "C:\\Rahul\\Selenium\\drivers\\IE driver\\selenium-html-runner-4.0.0-alpha-1.jar");
    		driver =new InternetExplorerDriver();
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		driver.manage().window().maximize();
    		
    		// Launch the URL
    		
    		driver.get(login_url); 		
    		return driver;
    	}
    	
    	else if (browser_use.equals("Chrome"))   		
    	{
    		System.out.println("In Chrome browser");
    		System.setProperty("webdriver.chrome.driver", "C:\\Rahul\\Selenium\\drivers\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get(login_url);
    	   	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	   	System.out.println("browser initiliazed and driver :-"+driver);
    	   	return driver;
    		
		}
    	
    	
    	else if (browser_use.equals("FireFox"))
    	{
    		System.out.println("In fire fox browser");
    		System.setProperty("webdriver.gecko.driver", "C:\\Rahul\\Selenium\\drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
    		driver =new FirefoxDriver();
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		driver.manage().window().maximize();  		
    		return driver;
		}
    	
    	else 
    	
    	{
    		
			//select the proper browser name
    		System.out.println("Please select/Write browser 'IE' or 'Chrome' or 'FireFox' in excel ");
    		return driver;
		}
		
    	
	}

}
