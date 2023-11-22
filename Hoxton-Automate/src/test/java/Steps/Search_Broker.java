package Steps;

import org.openqa.selenium.WebDriver;

import Automation.Hoxton_Automate.UserManagment;
import CommonMethods.Base_Class;
import io.cucumber.java.en.*;

public class Search_Broker extends Base_Class
{
	public WebDriver driver;
	public UserManagment UM;
	
	@When("User click on UserManagment")
    public void user_click_on_usermanagment() throws Throwable
	{
		UM= new UserManagment(driver);
        UM.Get_Usermangmentdropdown().click();
    }

   
    @And("User click on Search")
    public void user_click_on_search() throws Throwable 
    {
        UM.Get_Search_Broker().click();
    }

    @When("^Enter the (.+)$")
    public void enter_the(String userid) throws Throwable 
    {
       UM.Get_User_id().sendKeys(userid);
    }
    
    @Then("Click on Search tab")
    public void click_on_search_tab() throws Throwable
    {
        UM.Get_Search_Broker_Button().click();
    }


}
