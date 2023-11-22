package USER_MANGEMENT;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Baseclass;
import Login.Loginpage;

public class ValidateLogin extends Baseclass {
	@Test(dataProvider = "getData")
	public void homepagenavigation(String Username, String Password) throws IOException {

		driver = initalizedriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		Loginpage lp = new Loginpage(driver);
		lp.getUsername().sendKeys(Username);
		lp.getpassword().sendKeys(Password);
		lp.getsignin().click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "ayazahmad984@gmail.com";
		data[0][1] = "Pass@12345";

		data[1][0] = "yashaswini.malviya@xceedance.com";
		data[1][1] = "Pass@12345";
		return data;

	}
	
	@AfterTest
	public void closedriver() {
		driver.close();

}
}
