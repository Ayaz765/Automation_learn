package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Abstract_components.Ab_components;

public class Product_catalogue extends Ab_components {
	WebDriver driver;

	public Product_catalogue(WebDriver driver) {
		super(driver);

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".mb-3")
	List<WebElement> products;

	By producttype = By.cssSelector(".mb-3");

	public List<WebElement> getproductlist() {

		wait_until_elementvisibilty(producttype);
		return products;
	}

	public WebElement GetproductByname(String Productname) {
		WebElement Prod = getproductlist().stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(Productname)).findFirst()
				.orElse(null);
		return Prod;
	}

	public void addtocart(String Productname) {
		WebElement Prod = GetproductByname(Productname);

		Prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

	}

}
