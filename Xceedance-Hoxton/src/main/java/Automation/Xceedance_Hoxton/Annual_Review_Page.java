package Automation.Xceedance_Hoxton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Annual_Review_Page {
	public WebDriver driver;

	public Annual_Review_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath="//input[@type='search']")
	WebElement Primary_Insured ;
	
	private @FindBy(xpath="//a[@class='btn btn-primary'][normalize-space()='Add New Client']")
	WebElement AddClient;
	
	private @FindBy(xpath="//label[@for='home']")
	WebElement Home;
	
	private @FindBy(xpath="//label[@for='motor']")
	WebElement Motor;
	
	private @FindBy(xpath="//label[@for='travel']")
	WebElement Travel;
	
	private @FindBy(xpath="//label[@for='investment']")
	WebElement Investment;
	
	private @FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
	WebElement Cover_Start_Date;
	
	private @FindBy(xpath="//input[@value='true']")
	WebElement Direct_Debit;
	
	private @FindBy(xpath="//input[@ng-checked='vm.ddEnabled']")
	WebElement Agent_Statement;
	
	public WebElement Get_Primary_Insured() {
		return Primary_Insured;
	}
	
	public WebElement Get_AddClient() {
		return AddClient;
	}
	
	public WebElement Get_Home() {
		return Home;
	}
	
	public WebElement Get_Motor() {
		return Motor;
	}
	
	public WebElement Get_Travel() {
		return Travel;
	}
	
	public WebElement Get_Investment() {
		return Investment;
	}
	
	public WebElement Get_Cover_Start_Date() {
		return Cover_Start_Date;
	}
	public WebElement Get_Direct_Debit() {
		return Direct_Debit;
	}
	
	public WebElement Get_Agent_Statement() {
		return Agent_Statement;
	}
	
	

}
