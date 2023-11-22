package UserMagnagment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Brokername {
	public WebDriver driver;
	
	public Brokername(WebDriver driver) {
		this.driver = driver;
	}
	
	By BrokerTitle=By.xpath("//span[normalize-space()='Hi, Mary']");
	
	public WebElement GetBrokername()
	{
		return driver.findElement(BrokerTitle);
		
	}

}
