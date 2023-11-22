import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class E_commerce {

	public static void main(String[] args) throws Exception {
		String Productname = "ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("ayazahmad984@gmail.com");
		driver.findElement(By.cssSelector("#userPassword")).sendKeys("Pass@12345");
		driver.findElement(By.cssSelector("#login")).click();

		// To Store the all the products avaible on cart

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> Products = driver.findElements(By.cssSelector(".mb-3"));

		// To Filter out each product from home page and to get the product which we
		// want and store in prod webelemnt
		WebElement Prod = Products.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(Productname)).findFirst()
				.orElse(null);
		// To Click on Add to Cart
		Prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();

		List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match = cartproducts.stream()
				.anyMatch(cartproduct -> cartproduct.getText().equalsIgnoreCase(Productname));
		Assert.assertTrue(match);
		driver.findElement(By.cssSelector(".totalRow button")).click();

		Actions country = new Actions(driver);
		country.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "India").build()
				.perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();

		String Confirmation_Message = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(Confirmation_Message.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

		driver.close();

	}
}
