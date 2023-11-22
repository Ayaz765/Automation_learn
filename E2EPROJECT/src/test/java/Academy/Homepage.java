package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import learn.Base;
import qaclick.Login;
import qaclick.Loginhomepge;

@SuppressWarnings("deprecation")
public class Homepage extends Base

{
	@SuppressWarnings("deprecation")
	@Test(dataProvider = "getData")

	public void homepagenavigation(String email, String password) throws IOException {
		driver = initalizedriver();
		driver.get("http://www.qaclickacademy.com");
		driver.getTitle();
		Login lg = new Login(driver);
		lg.closepopup().click();
		//Assert.assertEquals(lg.gettitle().getText(), "FEATURED COURSES123");
		lg.loginpage().click();
		Loginhomepge Lhp = new Loginhomepge(driver);
		Lhp.getemail().sendKeys(email);
		Lhp.getpass().sendKeys(password);
		Lhp.getsubmit().click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "ayazahmad984@gmail.com";
		data[0][1] = "Pass@12345";

		data[1][0] = "rahulsheety@gmail.com";
		data[1][1] = "123456";
		return data;

	}

}
