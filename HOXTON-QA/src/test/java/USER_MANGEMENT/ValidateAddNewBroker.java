package USER_MANGEMENT;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import Login.Loginpage;
import UserMagnagment.AddBroker;


public class ValidateAddNewBroker extends Baseclass


{
	public WebDriver driver;
	public static Logger Log = LogManager.getLogger(ValidateAddNewBroker.class.getName());

	@Test
	public void AddNewbokers() throws IOException, InterruptedException {
		driver = initalizedriver();
		Log.info("Driver is intialize");
		
		
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		Log.info("Homepage is navigated");
		Loginpage Lp = new Loginpage(driver);
		Lp.getUsername().sendKeys(pro.getProperty("UN"));
		Lp.getpassword().sendKeys(pro.getProperty("PASS"));
		Lp.getsignin().click();

		AddBroker Ab = new AddBroker(driver);
		Ab.getUsermang().click();
		Ab.getAddnewusr().click();
		String ranstr=RandomStringUtils.randomAlphabetic(8);
		Ab.getBrokeremailid().sendKeys(ranstr+"@gmail.com");
		Ab.getBrokerFirstname().sendKeys(pro.getProperty("BrokerFirstname"));
		Ab.getBrokerLastname().sendKeys(pro.getProperty("BrokerLastname"));
		Ab.getPopup().click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Ab.getSubmitButton()));
		Ab.getSubmitButton().click();
		String[] name = Ab.getBrokerSignupUsername().getText().split(" ");
		String username = name[6].trim();
		System.out.println("USERNAME TO SIGNUP =" + username);

	}
	@AfterTest
	public void closedriver() {
		driver.close();
	}
}
