package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pagefactory.CreateCustomerPageNew;
import Pagefactory.LoginScenario;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition extends BaseClass{
	
	WebDriver driver=BaseClass.initializeDriver();
	LoginScenario obj=new LoginScenario(driver);
	CreateCustomerPageNew obj1=new CreateCustomerPageNew(driver);
	
	@Given("User logins into the application")
	public void user_logins_into_the_application() {
		
		System.out.println("User Login is successfull");
		
	    
	}

	@Given("User will enter the {string}")
	public void user_will_enter_the(String Username) {
		
		obj.enterUserID(Username);
		
	   
	}

	@Given("User then enters the {string}")
	public void user_then_enters_the(String Password) throws InterruptedException {
		
		obj.enterUserPassword(Password);
		AddHardcodedWait();
		
		
	   
	}

	@When("User Will click on Login Button")
	public void user_will_click_on_login_button() {
		
		obj.clickOnSubmit();
		
		
	  
	}

	@Then("User Will be navigated to homepage")
	public void user_will_be_navigated_to_homepage() throws IOException {
		
		System.out.println("Title of the Page is");
		getTitleOfPage();
		takeScreenShotMethod();
		
		
		
	   
	}
	
	
	@Given("User is Landed on the Home Page of the Application")
	public void user_is_landed_on_the_home_page_of_the_application() {
	    System.out.println("User is in Home page of application");
	    try {
			takeScreenShotMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	@Then("User will click on the New Customer link")
	public void user_will_click_on_the_new_customer_link() throws InterruptedException {
		
		obj1.clickOnNewCustomerLink();
	  
	}

	@Then("User will enter the  Cutomer name as {string}")
	public void user_will_enter_the_cutomer_name_as(String Customer_Name) {
		
		obj1.addCustomerName(Customer_Name);
	    
	}

	@Then("user will select Gender")
	public void user_will_select_gender() {
		
		obj1.selectGender();
	   
	}

	@Then("User will enter the Date of Birth as {string}")
	public void user_will_enter_the_date_of_birth_as(String date_of_birth) {
		
		obj1.enterDOB(date_of_birth);
	   
	}





}
