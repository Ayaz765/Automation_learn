package UserMagnagment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBroker {
	public WebDriver driver;

	public SearchBroker(WebDriver driver) {
		this.driver = driver;
	}

	By SearchUserMangement = By.xpath("//a[@href='/UserManagement']");
	By Brokerid=By.xpath("//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-0005'] //button");
	By Firstname = By.xpath("(//input[@type='text'])[2]");
	By Lastname = By.xpath("(//input[@type='text'])[4]");
	By SearchUser=By.xpath("//a[@class='btn btn-primary search-table']");
	By UserId=By.xpath("//input[@name='UserId']");
	By No_of_Page=By.xpath("//span[@class='ui-grid-pager-max-pages-number ng-binding']");
	By Next_page=By.xpath("//button[@title='Page forward']");
	
	public WebElement GetNext_page() {
		return driver.findElement(Next_page);
	}
	
	
	public WebElement GetPage_no() {
		return driver.findElement(No_of_Page);
	}
	
	public WebElement GetSearchUM() {
		return driver.findElement(SearchUserMangement);
	}

	public List<WebElement> GetBrokerID() {
		return driver.findElements(Brokerid);
	}
	
	public WebElement GetUserId() {
		return driver.findElement(UserId);
	}

	public WebElement GetSearchByFirstName() {
		return driver.findElement(Firstname);
	}

	public WebElement GetSearchByLastName() {
		return driver.findElement(Lastname);
	}

	public WebElement GetSearcUser() {
		return driver.findElement(SearchUser);
	}
}
