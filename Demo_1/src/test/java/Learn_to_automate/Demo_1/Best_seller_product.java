package Learn_to_automate.Demo_1;



import org.openqa.selenium.WebDriver;

import Amazon.Best_Seller;
import Common_Methods.Base_Class;

public class Best_seller_product extends Base_Class{
	
	public WebDriver driver;
	public Best_Seller bs;
	
	 void Best_seller_Choice()
	{
		switch(Prop_file.getProperty("Seller_product_choice_by_me"))
		{
		
		case "Bestsellers_in_Home_Improvement" :
		{
			
		}
		 
		case "Bestsellers_in_Amazon_Launchpad":
		{
			bs= new Best_Seller(driver);
			bs.Get_Bestsellers_in_Amazon_Launchpad().click();
		}
		
		}
		
	}

}
