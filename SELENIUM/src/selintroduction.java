import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selintroduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://uatbrokerportal.hoxtoninsuranceservices.com/Login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("UserName")).sendKeys("yashaswini.malviya@xceedance.com");
		driver.findElement(By.name("password")).sendKeys("Pass@12345");
		driver.findElement(By.id("loginbtn")).click();
		Thread.sleep(3000);
	     String brokername=driver.findElement(By.className("ng-binding")).getText();
	     String[] bn1= brokername.split(",");
	    System.out.println("Brokername="+ bn1[1]);
	    

	}

}
