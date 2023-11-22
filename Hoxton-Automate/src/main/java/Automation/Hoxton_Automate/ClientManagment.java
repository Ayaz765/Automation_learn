package Automation.Hoxton_Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientManagment {
	public WebDriver driver;

	public ClientManagment(WebDriver driver) {
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

	private @FindBy(xpath = "(//a[@class= 'has-ul' ]) [2]/span")

	WebElement Clientmana;

	private @FindBy(xpath = "(//a[@href='/ClientManagement/AddClient'])[1]") WebElement NewClient;

	private @FindBy(xpath = "//input[@name='prefixOther']") WebElement OtherPrefix;

	private @FindBy(xpath = "//button[@type='submit']") WebElement Submit;

	public WebElement mangerclien() {
		return Clientmana;
	}

	public WebElement NewClientaddition() {
		return NewClient;
	}

	public void GetFirstname(String Fn) {
		Firstname.sendKeys(Fn);
	}

	public WebElement GetMiddlename() {
		return Middlename;
	}

	public void GetLastname(String Ln) {
		Lastname.sendKeys(Ln);
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

	public WebElement EnterOtherPrefix() {
		return OtherPrefix;
	}

	public WebElement SubmitButton() {
		return Submit;

	}

}
