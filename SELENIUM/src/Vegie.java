import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vegie {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver\\\\chromedriver.exe" );
		
		//To store the name of vegetable in strings
		String[] Vegetable= {"Pumpkin","Onion","Apple"};



		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		additems(driver, Vegetable);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		System.out.print( driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		//To search the name of products like pumpkin 1kg,onion 1kg
	}
	
	
	
	public static void additems(WebDriver driver,String[] Vegetable)
	{
	
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
	//product.size is the size of product array

	for(int i=0;i<products.size();i++)
	{
		// to get all the vegetable name according to index, spilt is used spilt the vegetable
		
		String[] name = products.get(i).getText().split("-");
		
		//Formatedname store the name of zero index with space trim
		String Formatedname= name[0].trim();
		
		// converting array to array list,Syntax
		
		List itemsNeeded=Arrays.asList(Vegetable);
		
		// To compare the itemNeeded to formated name
		
		if(itemsNeeded.contains(Formatedname))
		{
			//Add chart element
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}
	}
	}
	
	
}


