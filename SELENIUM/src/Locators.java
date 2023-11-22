import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {


		
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://uatbrokerportal.hoxtoninsuranceservices.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.id("UserName")).sendKeys("yashaswini.malviya@xceedance.com");
			driver.findElement(By.name("password")).sendKeys("Pass@12345");
			driver.findElement(By.id("loginbtn")).click();
		

	}

}
