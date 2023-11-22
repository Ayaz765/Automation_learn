package USER_MANGEMENT;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import Login.Loginpage;
import UserMagnagment.AddBroker;
import UserMagnagment.BrokerUserId;
import UserMagnagment.SearchBroker;

public class ValidatesearchBrokerByUserId extends Baseclass {

	public WebDriver driver;
	public static Logger Log = LogManager.getLogger(ValidateAddNewBroker.class.getName());

	@Test
	public void Searchbroker() throws IOException, InterruptedException {
		driver = initalizedriver();
		Log.info("Driver is intialize");
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		Log.info("Homepage is navigated");
		Loginpage Lp = new Loginpage(driver);
		Lp.getUsername().sendKeys(pro.getProperty("UN"));
		Lp.getPassword().sendKeys(pro.getProperty("PASS"));
		Lp.getSignin().click();
		AddBroker Ab = new AddBroker(driver);
		Ab.getUsermang().click();
		Ab.getSearchUser().click();
		SearchBroker SB = new SearchBroker(driver);
		SB.GetSearchByUSerID().sendKeys(pro.getProperty("BROKERUSERID"));
		SB.GetSearcUser().click();
		Thread.sleep(9000);
		BrokerUserId Id = new BrokerUserId(driver);
		
		List<WebElement> options = Id.GetUserID();
		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("WER-U-000161"))

			{

				option.click();

				break;

			}

		}
	}
	@AfterTest
	public void closedriver() {
		driver.close();
	}
}
