
package steps_file;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Common_Methods.Base_class;
import Learn_to_automate.Automate.Login_HomePage;
import io.cucumber.java.en.*;

public class Login extends Base_class
{
	public WebDriver driver;
	public Login_HomePage Lp;

@Given("Browser is launched")
public void GivenBrowserislaunched() throws Throwable
{
	driver=Driver_IntializationBack();
}

@Given("^User is launched on WebPage with (.+)$")
public void GivenUserislaunchedonWebPagewithURL(String url)
{
	driver.get(url);
}

@Given("User move the key cursor to the Account & List")
public void GivenUsermovethekeycursortotheAccountList()
{
	Actions cursor= new Actions(driver);
	cursor.moveToElement(Lp.Get_Account_and_List());
}

@Given("click on sign in")
public void Givenclickonsignin()
{
Lp.Get_Account_and_List_Sign_in();
}

@When("^User enter (.+)$")
public void WhenUserenteremail(String email)
{
	Lp.Get_email().sendKeys(email);
}

@Given("click on sumit")
public void Givenclickonsumit()
{
	Lp.Get_email_submit();
}

@When("^User enter pass (.+)$")
public void WhenUserenterpassword(String Pass)
{
	Lp.Get_password().sendKeys(Pass);
}

@Given("click on submit")
public void Givenclickonsubmit()
{
	Lp.Get_Sign_in();
}

@Then("Page is move to HomePage")
public void ThenPageismovetoHomePage()
{
	System.out.print("welcome");
	driver.close();
}
}




