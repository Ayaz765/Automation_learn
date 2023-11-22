import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver\\\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		signup(driver);
		
		
		
		
		
		
		
		

	}
	public static void signup(WebDriver driver) throws InterruptedException
	{

	
	
	
	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("password")).sendKeys("learning");
	driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("okayBtn")).click();
	//driver.switchTo().alert().accept();
	
	
	WebElement dropdownoption=	driver.findElement(By.xpath("//select[@class='form-control']"));
	
	Select dropdown= new Select(dropdownoption);

     dropdown.selectByIndex(0);
     
    // driver.findElement(By.xpath("//input[@id='terms']")).click();
     
     driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
     

}
}
