package Automation.Xceedance_Hoxton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_Details {

	public WebDriver driver;

	public Client_Details(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//input[@name='firstName']") WebElement Firstname;

	private @FindBy(xpath = "//input[@name='middleName']") WebElement Middlename;

	private @FindBy(xpath = "//input[@name='lastName']") WebElement Lastname;

	private @FindBy(xpath = "//input[@name='primaryInsuredMobile']") WebElement Mobileno;

	private @FindBy(xpath = "//select[@name='prefix']") WebElement Clientnameprefix;

	private @FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']") WebElement Dob;

	private @FindBy(xpath = "//input[@name='autocomplete']") WebElement SearchAdress;

	public WebElement GetFirstname() {
		return Firstname;
	}

	public WebElement GetMiddlename() {
		return Middlename;
	}

	public WebElement GetLastname() {
		return Lastname;
	}

	public WebElement GetMobileno() {
		return Mobileno;
	}

	public WebElement GetClientprefix() {
		return Clientnameprefix;
	}

	public WebElement GetSearchAdress() {
		return SearchAdress;
	}

}
