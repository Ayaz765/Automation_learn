package UserMagnagment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddBroker {
	public WebDriver driver;

	private By Usermangement = By.xpath("(//a[contains(@ng-click,'rc.showHideAction()')])[1]");
	private By Addnew = By.xpath("(//a[@href='/UserManagement/Add'])[1]");
	private By SearchUm = By.xpath("//a[@href='/UserManagement']");
	private By Brokeremail = By.xpath("//input[@name='email']");
	private By Firstname = By.xpath("//input[@name='firstName']");
	private By Lastname = By.xpath("//input[@name='lastName']");
	private By Popup = By.xpath("//a[@class='btn btn-primary search-quote legitRipple']");
	private By Submit = By.xpath("(//button[normalize-space()='YES'])[1]");
	private By BrokerUsername = By
			.xpath("//div[@class='alert alert-success alert-styled-left alert-arrow-left alert-bordered ng-binding']");

	public AddBroker(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsermang() {
		return driver.findElement(Usermangement);
	}
	public WebElement getSearchUser() {
		return driver.findElement(SearchUm);

	}

	public WebElement getAddnewusr() {
		return driver.findElement(Addnew);

	}

	public WebElement getBrokeremailid() {
		return driver.findElement(Brokeremail);

	}

	public WebElement getBrokerFirstname() {
		return driver.findElement(Firstname);

	}

	public WebElement getBrokerLastname() {
		return driver.findElement(Lastname);

	}

	public WebElement getPopup() {
		return driver.findElement(Popup);

	}

	public WebElement getSubmitButton() {
		return driver.findElement(Submit);

	}
	
	public WebElement getBrokerSignupUsername() {
		return driver.findElement(BrokerUsername);

	}
}
