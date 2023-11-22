package CLIENT_MANAGEMENT;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Baseclass;
import CLIENTMANAGMENT.AddClient;
import CLIENTMANAGMENT.ClientDetail;
import Login.Loginpage;
import USER_MANGEMENT.ValidateAddNewBroker;

public class ValidateAddClient extends Baseclass {
	public WebDriver driver;
	public Loginpage Lp;
	public static Logger Log = LogManager.getLogger(ValidateAddNewBroker.class.getName());

	@Test
	public void AddNewClient(String emailid, String pass) throws IOException, InterruptedException {
		driver = initalizedriver();
		Log.info("Driver is intialize");

		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		Log.info("Homepage is navigated");
		Lp = new Loginpage(driver);
		Lp.getUsername().sendKeys(pro.getProperty("UN"));
		Lp.getPassword().sendKeys(pro.getProperty("PASS"));
		Lp.getSignin().click();

		AddClient Ac = new AddClient(driver);
		Ac.ClientUI().click();
		Ac.NewClientaddition().click();
		String FirstName = RandomStringUtils.randomAlphabetic(5);

		ClientDetail Cd = new ClientDetail(driver);
		Cd.Firstname().sendKeys(FirstName);

		String MiddleName = RandomStringUtils.randomAlphabetic(5);
		Cd.Middlename().sendKeys(MiddleName);

		String LastName = RandomStringUtils.randomAlphabetic(5);
		Cd.Lastname().sendKeys(LastName);

		Select NamePrefix = new Select(Cd.Clientprefix());
		NamePrefix.selectByValue("Mr");

	}
}
