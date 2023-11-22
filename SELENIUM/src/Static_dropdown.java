import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
			/*WebElement dropdownone=	driver.findElement(By.id("dropdown-c"));
			
			Select dropdown= new Select(dropdownone);
			//Select is class for dropdown
		dropdown.selectByIndex(2);
		// to select the drop down by index
		 
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("option1");
		System.out.println(dropdown.getFirstSelectedOption().getText());*/
				
				/*
				
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(3000L);
				int i=1;
				
				while(i<5)
				{
				
				driver.findElement(By.id("hrefIncAdt")).click();
				
				i++;
				
				}
				driver.findElement(By.id("btnclosepaxoption")).click();
				
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			*/
				
				
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

			
				
				driver.findElement(By.xpath("//a[@value= 'PNQ']")).click();
				
			
				
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value= 'GOP']")).click();
				
				
				

	}

}
