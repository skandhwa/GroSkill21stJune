package Pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerPageNew {
	
WebDriver driver;
	
	public CreateCustomerPageNew(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	WebElement NewCustomerLink;
	
	
	
	
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Customer_name;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement DOB;
	
	public void clickOnNewCustomerLink() throws InterruptedException
	{
		
		NewCustomerLink.click();
		Thread.sleep(4000);
	}
	
	
	public void addCustomerName(String custname)
	{
		Customer_name.sendKeys(custname);
	}
	
	public void selectGender()
	{
		Gender.click();
	}
	
	
	public void enterDOB(String DateOfBirth)
	{
		DOB.sendKeys(DateOfBirth);
	}
	
	
	
	
	

}
