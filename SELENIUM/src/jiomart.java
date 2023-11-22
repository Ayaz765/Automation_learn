import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jiomart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
int j=0;
		String[] Veggie = { "Tomato", "Lauki", "Potato", "Coconut" };
		

		driver.get("https://www.jiomart.com/c/groceries/fruits-vegetables/fresh-vegetables/229");
		driver.manage().window().maximize();

		List<WebElement> products = driver.findElements(By.cssSelector("span.clsgetname"));
		
		for(int i=0;i<products.size();i++)
		{
			
		String[] names= products.get(i).getText().split(" ");
		String newname= names[0].trim();
		
		List itemsNeeded=Arrays.asList(Veggie);
		
		if(itemsNeeded.contains(newname))
		{
			//Add chart element
			j++;
			driver.findElements(By.xpath("//div[@class='cart_btn']//button[@class='toCart addtocartbtn']")).get(i).click();
			if(j==Veggie.length)
			{
				break;
			}
			}
			
		}
	
		
		}
	}



