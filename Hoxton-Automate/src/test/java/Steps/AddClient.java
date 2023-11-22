package Steps;

import org.openqa.selenium.WebDriver;
import Automation.Hoxton_Automate.ClientManagment;
import CommonMethods.Base_Class;
import io.cucumber.java.en.*;

public class AddClient extends Base_Class {
	public WebDriver driver;
	public ClientManagment CM;

	@When("Click on Client Management")
	public void click_on_client_management() throws Throwable {
		
		CM = new ClientManagment(driver);
		Thread.sleep(10000);
		CM.mangerclien().click();
	}

	@And("Click Add New Client")
	public void click_add_new_client() throws Throwable {
		CM.NewClientaddition().click();
	}

	@When("^User enter all the details of client (.+) and (.+)$")
	public void user_enter_all_the_details_of_client_and(String Fn, String Ln) {
		CM.GetFirstname(Fn);
		CM.GetLastname(Ln);

	}

	@And("click on submit button")
	public void click_on_submit_button() throws Throwable {
		CM.SubmitButton().click();

	}

	@Then("^Client has been created with message on UI$")
	public void client_has_been_created_with_message_on_ui() throws Throwable {

		System.out.print("ok");

	}

}
