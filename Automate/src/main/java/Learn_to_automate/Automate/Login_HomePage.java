package Learn_to_automate.Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_HomePage {
	public WebDriver driver;
	
	public Login_HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement Account_and_List;
	
	private @FindBy(xpath="//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']")
	WebElement Account_and_List_Sign_in;
	
	private @FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	private @FindBy(xpath="//input[@type='submit']")
	WebElement email_submit;
	
	private @FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	private @FindBy(xpath="//a[normalize-space()='Forgot your password?']")
	WebElement ForgetPassword;
	
	private @FindBy(xpath="//input[@type='submit']")
	WebElement Signin;
	
	
	public WebElement Get_Account_and_List() {
		return Account_and_List;
	}
	
	
	public WebElement Get_Sign_in() {
		return Account_and_List_Sign_in;
	}
	
	public WebElement Get_email() {
		return email;
	}
	
	public WebElement Get_email_submit() {
		return email_submit;
	}
	
	public WebElement Get_password() {
		return password;
	}
	
	public WebElement Get_ForgetPassword() {
		return ForgetPassword;
	}
	
	public WebElement Get_Account_and_List_Sign_in() {
		return Account_and_List_Sign_in;
	}
	
	
	

}
