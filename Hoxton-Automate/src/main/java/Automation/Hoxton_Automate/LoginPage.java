package Automation.Hoxton_Automate;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//input[@name='UserName']") WebElement UserName;

	private @FindBy(xpath = "//input[@id='password']") WebElement Password;

	private @FindBy(xpath = "//button[@type='submit']") WebElement LoginButton;

	private @FindBy(xpath = "//a[@class='btn btn-link']") WebElement ForgetPassword;

	private @FindBy(xpath = "//button[@type='button']") WebElement Signup;
	
	private By Invalid_Login=By.xpath("//div[@class='toast-message']");
	
	private By Company_Logo=By.xpath("//img[@src='/Assets/images/Hoxton-Logo.png']");
	
	
	
	public void SigninUsername(String useremail) {
		UserName.sendKeys(useremail);
	}
	
	public void SigninPassword(String userpassword) {
		Password.sendKeys(userpassword);
	}
	public void LogintoApp() {
		 LoginButton.click();
		
	}
	public WebElement Unsuccessfull_Message() {
		return driver.findElement(Invalid_Login);
	}
	public WebElement Company_logo_validation() {
		return driver.findElement(Company_Logo);
	}
     
     
}
