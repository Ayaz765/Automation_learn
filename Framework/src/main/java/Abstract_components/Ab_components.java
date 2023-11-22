package Abstract_components;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ab_components {
	
	
	WebDriver driver;
	public Ab_components(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void wait_until_elementvisibilty(By FindBY) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
	wait.until(ExpectedConditions.visibilityOfElementLocated(FindBY));
	}

}
