package USER_MANGEMENT;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import Login.Loginpage;
import UserMagnagment.AddBroker;
import UserMagnagment.SearchBroker;

public class ValidatesearchBrokerByUserId2 extends Baseclass {

	public WebDriver driver;
	String Userinput;
	public SearchBroker SB;
	public JavascriptExecutor js;
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
		SB = new SearchBroker(driver);

		switch (pro.getProperty("Userinput")) 
		
		{
		case "BrokerUserid": {

			// System.out.print(SB.GetPage_no().getText());
			Boolean count = false;

			SB.GetUserId().sendKeys(pro.getProperty("BROKERUSERID"));
			Thread.sleep(4000);
			SB.GetSearcUser().click();
			Thread.sleep(4000);
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,700)");
			String size = SB.GetPage_no().getText();
			// int Page_length = Integer.parseInt(size);
			// System.out.println(Page_length);

			if (count == true) {

				for (int i = 0; i < 3; i++)
				     {
					List<WebElement> options = SB.GetBrokerID();

					      for (WebElement option : options)

					      {
					    	  Thread.sleep(1000);
						      if (option.getText().equalsIgnoreCase("WER-U-000900"))

						          {

							      option.click();
							      count = false;
							          break;

						          }
					       }
					      
					   SB.GetNext_page().click();

				}
				count=false;

			}
			
			else
			{
				System.out.print("Not_found");
			}
		}
		
		case "FirstName": {
			SB.GetSearchByFirstName().sendKeys(pro.getProperty("FN"));
			SB.GetSearcUser().click();
			break;
		
		
		

		
		

		}

	}

}
