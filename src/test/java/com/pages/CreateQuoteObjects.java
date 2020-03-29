package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateQuoteObjects {
	
	 WebDriver driver;
	  
	//find the object of create quote page 
	  
	  //Quote Application hyperlink
	 
	 /*x path for Create/Application hyperlink
	  * xpath =//a[@href="/BMWDFEWeb/CreateLoanQuoteAppln.aspx"]
	  */
	 
	 @FindBy(xpath="//a[@href='/BMWDFEWeb/CreateLoanQuoteAppln.aspx']") WebElement create_quote_click ;
	  
	  // F & I drop down  id= "ctl00_cBc_wcLC_lsddlAppFnI"
	  
	  
	  @FindBy(id = "ctl00_cBc_wcLC_lsddlAppFnI") WebElement F_I_DropDown;
	  
	  //Loan purpose drop down ID "ctl00_cBc_wcLC_lsddlLoanPurpose"
	  
	  @FindBy(id = "ctl00_cBc_wcLC_lsddlLoanPurpose") WebElement Loan_purpose_dropdwon;
	  
	  //select 50% drop down list id=ctl00_cBc_wcLC_lsddlVehRegistered1
	  
	  @FindBy(id="ctl00_cBc_wcLC_lsddlVehRegistered1") WebElement domestic_purpose;
	  
	  //status drop down id=ctl00_cBc_wcLC_lsddlAsDStatus
	  
	  @FindBy(id="ctl00_cBc_wcLC_lsddlAsDStatus" ) WebElement status_dropdwon;
	  
	  //Product dropw down id=ctl00_cBc_wcLC_lsddlPrProduct
	  
	  @FindBy(id="ctl00_cBc_wcLC_lsddlPrProduct") WebElement product_dropdwon;
	  
	  //Sub product drop down id=ctl00_cBc_wcLC_lsddlSubProduct

	  @FindBy(id="ctl00_cBc_wcLC_lsddlSubProduct") WebElement subproduct_dropdwon;
	  
	  //Make drop down id=ctl00_cBc_wcLC_lsddlAsDMake
	  
	  @FindBy(id="ctl00_cBc_wcLC_lsddlAsDMake") WebElement make_dropdwon;
	  
	  //Year drop down id=ctl00_cBc_wcLC_lsddlAsDYear
	  
	  @FindBy(id="ctl00_cBc_wcLC_lsddlAsDYear") WebElement year_dropdwon;
	  
	 
	  //Model drop down id=ctl00_cBc_wcLC_lsddlAsSSeries	  

	  @FindBy(id="ctl00_cBc_wcLC_lsddlAsSSeries") WebElement model_dropdown;
	  

	  //description drop down id=ctl00_cBc_wcLC_lsddlAsDModel
	  
	  @FindBy(id="ctl00_cBc_wcLC_lsddlAsDModel") WebElement desc_dropdown;
	  
	  
	  
	  
	  
	  public CreateQuoteObjects(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);	
		  
	}
	   
	  public void into_quotepage()
	  {
		  create_quote_click.click();
		  
	  }
	  
	 public void insert_quote_data()
	 {
		 
		 // select F & I drop down by index
		 
		 Select fimnagaer =new Select(F_I_DropDown);
		 fimnagaer.selectByIndex(3);
		 
		 System.out.println("F & I drop down is selected");
		 
		 // select Loan Purpose by Visible text
		 
		 Select lop =new Select(Loan_purpose_dropdwon);
		 lop.selectByVisibleText("First");
		 	 
		 System.out.println("Loan Purpose drop down is selected");
		 
		 // domestic purpose question yes or No
		 
		 Select domp =new Select(domestic_purpose);
		 domp.selectByVisibleText("Yes");
		 
		 System.out.println("Domestic purpose answer is selected");
		 
		 //status New is selected
		 
		 Select status_sel =new Select(status_dropdwon);
		 status_sel.selectByVisibleText("New");
		 
		 System.out.println("New status drop down is selected");
		 
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		 
		 //Product index 1= Loan
		 
		 Select produt_type=new Select(product_dropdwon);
		 produt_type.selectByIndex(2);
		 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		 
		 System.out.println("Loan by index 2 is selected");
		 
		 // WAIT TILL SUB PRODUCT LOAN SHOULD BE VISIBLE
		 
		 WebDriverWait wait =new WebDriverWait(driver, 30);
		 
		 //wait.until(ExpectedConditions.visibilityOf(subproduct_dropdwon));
		
		 //below is webelement
		 
		wait.until(ExpectedConditions.textToBePresentInElement(subproduct_dropdwon, "Loan"));
		 
		// wait.until(ExpectedConditions.textToBePresentInElementValue(make_dropdwon, "BMW"));
		 
		// wait.until(ExpectedConditions.visibilityOf(make_dropdwon));
		 
		 //Year select by value
		 
		 Select year_select =new Select(year_dropdwon);
		 year_select.selectByValue("2018");
		 System.out.println("Year is selected as value 2018");
		 
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
		 wait.until(ExpectedConditions.textToBePresentInElementValue(year_dropdwon, "2018"));
		
		
		//Model select by visible text i3
		 
		 try
		 {
		
		Select model_select =new Select(model_dropdown);	
		//model_select.selectByIndex(3);
		
		model_select.selectByVisibleText("i3");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		 }
		 catch (org.openqa.selenium.StaleElementReferenceException e) {
			
			 Select model_select =new Select(model_dropdown);	
				//model_select.selectByIndex(3);
				
				model_select.selectByVisibleText("i3");
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS ); 
			 
		}
		 wait.until(ExpectedConditions.textToBePresentInElement(model_dropdown, "i3"));
		System.out.println("Model i3 is selected");
		
		//description select by index 1 .. wait for load the list size greater than 1
		
		try
		{
			// Wait until expected condition size of the dropdown increases and becomes more than 1
			
			wait.until((ExpectedCondition<Boolean>) new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver)
					{
				Select des_sel=new Select(desc_dropdown);
				return des_sel.getOptions().size()>1;			
					}
			});
			
			Select des_sel=new Select(desc_dropdown);
			 des_sel.selectByIndex(2);
			 System.out.println("Data is entered till description");
			
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );	 
		 
	 }
		catch (Exception e) {
		System.out.println("Error message is found::"+e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
}
