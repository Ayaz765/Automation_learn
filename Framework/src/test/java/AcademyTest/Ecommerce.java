package AcademyTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Academy.LandingPage;
import Academy.Product_catalogue;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Ecommerce {

	public static void main(String[] args)
	{
		String Productname = "ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		driver.manage().window().maximize();
		LandingPage Lp=new LandingPage(driver);
		Lp.GotoUrl();
		Lp.LoginToApplication("ayazahmad984@gmail.com", "Pass@12345");
		
		Product_catalogue productscatlogue = new Product_catalogue(driver);
		List<WebElement>Products= productscatlogue.getproductlist();
		
		productscatlogue.addtocart(Productname);
		

}
}