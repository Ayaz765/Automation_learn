package Hoxton;

import org.testng.annotations.Test;



import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class UserMangement

{
	WebDriver driver;
@Parameters({"URL","USERNAME","PASSWARD"})
	@BeforeMethod
	public void Login(String urlname,String Username, String Password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(urlname);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

	}
@Parameters({"Brokeremail"})
	@Test(priority = 1)
	public void AddnewUser(String brokermail) throws InterruptedException

	{
		driver.findElement(By.xpath("(//a[contains(@ng-click,'rc.showHideAction()')])[1]")).click();

		driver.findElement(By.xpath("(//a[@href='/UserManagement/Add'])[1]")).click();

		WebElement Brokername = driver.findElement(By.xpath("(//select[@name='roleId'])[1]"));

		Select dropdown = new Select(Brokername);

		dropdown.selectByIndex(0);

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("TEST");

		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("AUTOMATION");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(brokermail);

		driver.findElement(By.xpath("//a[@class='btn btn-primary search-quote legitRipple']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='YES'])[1]")).click();
		Thread.sleep(3000);
		String[] name = driver.findElement(By.xpath(
				"//div[@class='alert alert-success alert-styled-left alert-arrow-left alert-bordered ng-binding']"))
				.getText().split(" ");
		String username = name[6].trim();

		System.out.println("USERNAME TO SIGNUP =" + username);
	}

	@Test(priority = 2)
	public void SearchUserByUserID() throws InterruptedException {

		driver.findElement(By.xpath("(//a[contains(@ng-click,'rc.showHideAction()')])[1]")).click();

		driver.findElement(By.xpath("(//a[@href='/UserManagement'])[1]")).click();

		driver.findElement(By.xpath("//input[@name='UserId']")).sendKeys("WER");

		WebElement Searchbrokername = driver.findElement(
				By.xpath("(//select[@class='form-control field-md ng-pristine ng-untouched ng-valid ng-empty'])[1]"));

		Select dropdown = new Select(Searchbrokername);

		dropdown.selectByIndex(0);

		driver.findElement(By.xpath("//a[@class='btn btn-primary search-table']")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void SearchUserByUserFitstname() throws InterruptedException {

		driver.findElement(By.xpath("(//a[contains(@ng-click,'rc.showHideAction()')])[1]")).click();

		driver.findElement(By.xpath("(//a[@href='/UserManagement'])[1]")).click();

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ayaz");

		WebElement Searchbrokername = driver.findElement(
				By.xpath("(//select[@class='form-control field-md ng-pristine ng-untouched ng-valid ng-empty'])[1]"));

		Select dropdown = new Select(Searchbrokername);

		dropdown.selectByIndex(0);

		driver.findElement(By.xpath("//a[@class='btn btn-primary search-table']")).click();

		Thread.sleep(4000);
	}

	@Test(priority = 4)
	public void Gdpr() throws InterruptedException {

		driver.findElement(By.xpath("(//a[@class='has-ul'])[5]")).click();

		driver.findElement(By.xpath("(//a[@href='/Gdpr'])[1]")).click();

		driver.findElement(By.xpath("//input[@ng-model='vm.InsuredName']"))
				.sendKeys("sam");

		driver.findElement(By.xpath("(//a[@class='btn btn-primary search-table'])[1]")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}
