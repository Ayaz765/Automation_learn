package qaclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginhomepge {

	public WebDriver driver;
	public Loginhomepge(WebDriver driver)
	{
		this.driver=driver;
	}
	By emailid = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name=' password']");
	By submit = By.xpath("//input[@name='commit']");

	public WebElement getemail() {
		return driver.findElement(emailid);

	}

public WebElement getpass() 
{
	return driver.findElement(password);
	
}

	public WebElement getsubmit() {
		return driver.findElement(submit);
		
	}

}
