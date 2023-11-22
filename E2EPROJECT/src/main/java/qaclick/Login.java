package qaclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login

{
	public WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}

	By logpage = By.xpath("//span[normalize-space()='Login']");
	By popup=By.xpath("//button[normalize-space()='NO THANKS']");
	By title=By.xpath("//h2[normalize-space()='Featured Courses']");
	
	
	public WebElement closepopup() {
		return driver.findElement(popup);
	}



	public WebElement loginpage() {
		return driver.findElement(logpage);
	}
	
	public WebElement gettitle() {
		return driver.findElement(title);
	}


}
