package Create_Quote;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Automation.Xceedance_Hoxton.Annual_Review_Page;
import Automation.Xceedance_Hoxton.Base_Class;
import Automation.Xceedance_Hoxton.Login;

public class Landing_page extends Base_Class {
	
	@Test
	public void GetQuote() throws Throwable 
	{
	      driver=Inialization_Driver();
		 Go_To_url();
		 Login Log= new Login(driver);
		 Log.Login_To_Homepage("yashaswini.malviya@xceedance.com","Pass@12345");
		 
		 Annual_Review_Page Ar= new Annual_Review_Page(driver);
		 Ar.Get_Primary_Insured().sendKeys("Ayaz");
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/")));
		 
		 
		 
		
	}
	

}
