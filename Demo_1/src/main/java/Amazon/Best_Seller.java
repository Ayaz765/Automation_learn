package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Best_Seller {
	public WebDriver driver;
	
	public Best_Seller(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	private @FindBy(xpath="(//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers'])[1]")
	WebElement Best_sell;
	
	private @FindBy(xpath="(//a[@aria-label='Bestsellers in Home Improvement - See More'])[1]")
	WebElement Bestsellers_in_Home_Improvement;
	
	private @FindBy(xpath="//a[@aria-label='Bestsellers in Amazon Launchpad - See More']")
	
	WebElement Bestsellers_in_Amazon_Launchpad;
	
	public WebElement Get_Best_Seller()
	{
		return Best_sell;
	}
	public WebElement Get_Bestsellers_in_Home_Improvement()
	{
		return Bestsellers_in_Home_Improvement;
	}
	public WebElement Get_Bestsellers_in_Amazon_Launchpad()
	{
		return Bestsellers_in_Amazon_Launchpad;
	}

	
}
