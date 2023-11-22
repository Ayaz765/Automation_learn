package USER_MANGEMENT;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import Login.Loginpage;
import UserMagnagment.Brokername;

public class ValidateBrokername extends Baseclass {

	public WebDriver driver;
	public static Logger Log = LogManager.getLogger(ValidateBrokername.class.getName());

	@Test
	public void Brokernamevalidation() throws IOException {
		driver = initalizedriver();
		Log.info("Driver is intialize");
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		Log.info("Homepage is navigated");
		Loginpage Lp = new Loginpage(driver);
		Lp.getUsername().sendKeys(pro.getProperty("UN"));
		Lp.getpassword().sendKeys(pro.getProperty("PASS"));
		Lp.getsignin().click();
		Brokername BN = new Brokername(driver);
		String[] Broker = BN.GetBrokername().getText().split(",");
		String brokername = Broker[1].trim();
		Assert.assertEquals(brokername, "MARY");
	}

	@AfterTest
	public void closedriver() {
		driver.close();
	}

}
