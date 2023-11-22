package Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Automation.Hoxton_Automate.LoginPage;
import CommonMethods.Base_Class;
import io.cucumber.java.en.*;

public class Login extends Base_Class
{
	public WebDriver driver;
	public LoginPage Lp;
	
	  @Given("Browser is launched")
	    public void browser_is_launched() throws Throwable 
	    {
		  driver=Inialization_Driver();
	      
	    }
	  
	  @And("^User is landed on login Page with (.+)$")
	    public void user_is_landed_on_login_page_with(String url) throws Throwable 
	    {
		  driver.get(url);
	    }
	  

	    @When("^user enter in the username (.+) and password (.+)$")
	    public void user_enter_in_the_username_and_password(String username, String password) throws Throwable 
	    {
	    	Lp = new LoginPage(driver);
			Lp.SigninUsername(username);
			Lp.SigninPassword(password);
	    }
	    @And("Click on Login Button")
	    public void click_on_login_button() throws Throwable 
	    {
	    	Lp.LogintoApp();
	    	Thread.sleep(1000);
	    }

	    @Then("Page is navigate to the Home page")
	    public void page_is_navigate_to_the_home_page() throws Throwable 
	    {
	       System.out.println("WELCOME TO THE BROKER PORTAL");
	       driver.close();
	    }
	    @Then("Message is displaying On UI")
	    public void Message_is_displaying_On_UI() throws Throwable 
	    {
	    	String Brokername = Lp.Unsuccessfull_Message().getText();
	    	Thread.sleep(5000);
	    	Assert.assertEquals(Brokername, "Either username or password is incorrect. Please enter valid credentials. (3)");
	    	driver.close();
	    }
	  


}
