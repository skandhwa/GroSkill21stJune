package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginScenario extends BaseClass {
	
	WebDriver driver;
	
	public LoginScenario(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name ='uid']")
	WebElement userid;
	
	@FindBy(xpath="//input[@name ='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name ='btnLogin']")
	WebElement btnLogin;
	
	
	public void enterUserID(String username1)
	{
		userid.sendKeys(username1);
	}
	
	public void enterUserPassword(String password1)
	{
		password.sendKeys(password1);
	}
	
	
	public void clickOnSubmit()
	{
		btnLogin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
