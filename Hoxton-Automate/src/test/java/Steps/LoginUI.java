package Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Automation.Hoxton_Automate.LoginPage;
import CommonMethods.Base_Class;
import io.cucumber.java.en.*;

public class LoginUI extends Base_Class {
	public WebDriver driver;
	public LoginPage Lp;

	@Given("Browser is Opened")
	public void browser_is_Opened() throws Throwable {
		driver = Inialization_Driver();

	}

	@Then("^User is to login Page with (.+)$")
	public void user_is_navigate_to_login_page_with(String url) throws Throwable {
		driver.get(url);
		String Logo = Lp.Company_logo_validation().getText();

		Assert.assertEquals(Logo, "Either username or password is incorrect. Please enter valid credentials. (3)");
		driver.close();

	}

}
