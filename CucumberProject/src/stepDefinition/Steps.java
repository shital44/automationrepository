package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps 
{
	@Given("^Application is up and running$")
	public void application_is_up_and_running() throws Throwable 
	{
	   System.out.println("^Application is up and running$");
	}
 
	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable
	{
		System.out.println("Enter Username and Password");
	    
	}

	@Then("^I should be logged in successfully$")
	public void i_should_be_logged_in_successfully() throws Throwable {
		System.out.println("User should be login successfully");
	    
	}
	@When("^I enter (.*?) and( .*?) login page$")
	public void i_enter_anandabcdd_and_temp_sefon_login_page(String username,String password) throws Throwable {
	    System.out.println("Enter username="+username);
	    System.out.println("Enter password="+password);
	}

}
