package Automation.Xceedance_Hoxton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	private @FindBy(xpath = "//input[@name='UserName']")
	WebElement UN;

	private @FindBy(xpath = "//input[@id='password']")
	WebElement Pass;

	private @FindBy(xpath = "//button[@type='submit']")
	WebElement Signin;

	public void Login_To_Homepage(String UserName,String Password) {
		UN.sendKeys(UserName);
		Pass.sendKeys(Password);
		Signin.click();
		
	}

	
	

}
