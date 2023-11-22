package Automation.Hoxton_Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagment {
	public WebDriver driver;

	public UserManagment(WebDriver driver)
	{
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath="a[ng-click='rc.showHideAction()']")
	WebElement Usermangmentdropdown;
	
	private @FindBy(xpath="//a[@href='/UserManagement']")
	WebElement Search_Broker;
	
	private @FindBy(xpath="//input[@name='UserId']")
	WebElement User_id;
	
	
    private @FindBy(xpath="(//input[@type='text'])[2]")
    WebElement First_name;
    
    private @FindBy(xpath="(//a[@class='btn btn-primary search-table'])[1]")
    WebElement Search_Broker_Button;
    
    public WebElement Get_Usermangmentdropdown()
    {
    	return Usermangmentdropdown;
    }
    
    
    public WebElement Get_Search_Broker()
    {
    	return Search_Broker;
    }
    
    
    public WebElement Get_User_id()
    {
    	return User_id;
    }
    
    public WebElement Get_First_name()
    {
    	return First_name;
    }
    
    public WebElement Get_Search_Broker_Button()
    {
    	return Search_Broker_Button;
    }

}
