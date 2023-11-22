package CLIENT_MANAGEMENT;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Baseclass;
import CLIENTMANAGMENT.AddClient;
import Login.Loginpage;
import junit.framework.Assert;

public class ValidateClientUI extends Baseclass {
	@Test
	public void ValidateUI() throws IOException {
		driver=initalizedriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		//Log.info("Homepage is navigated");
		Loginpage Lp = new Loginpage(driver);
		Lp.getUsername().sendKeys(pro.getProperty("UN"));
		Lp.getPassword().sendKeys(pro.getProperty("PASS"));
		Lp.getSignin().click();
		AddClient Ac= new AddClient(driver);
		Assert.assertEquals(Ac.ClientUIDetail().getText(), "CLIENT MANAGEMENT");
	}
	

}
