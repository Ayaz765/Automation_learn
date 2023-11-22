import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='GOI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOP']"))
				.click();
		Thread.sleep(2000);
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains(".5")) {

			System.out.print("It disable");
		}

		else

		{
			System.out.println("It enable");

		}

		driver.findElement(By.id("divpaxinfo")).click();

		int i;

		for (i = 1; i < 5; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		WebElement dropdownone = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(dropdownone);

		dropdown.selectByIndex(2);

		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
