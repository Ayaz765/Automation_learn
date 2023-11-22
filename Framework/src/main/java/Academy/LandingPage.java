package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstract_components.Ab_components;

public class LandingPage extends Ab_components{
	WebDriver driver;

	@FindBy(css="#userEmail")
	WebElement Email;
	
	@FindBy(css="#userPassword")
	WebElement Pass;
	
	@FindBy(css="#login")
	WebElement Submit;
	
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginToApplication(String Emailid,String Password)
	{
		Email.sendKeys(Emailid);
        Pass.sendKeys(Password);
        Submit.click();
	}
	
	public void GotoUrl()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	}

