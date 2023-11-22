package learn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;

	public WebDriver initalizedriver() throws IOException {
		Properties pro = new Properties();
		FileInputStream Fis = new FileInputStream(
				"C:\\Users\\Ayaz.Ahamad\\eclipse-workspace\\E2EPROJECT\\src\\main\\java\\learn\\data.properties");
		pro.load(Fis);
		String BrowserName = pro.getProperty("browser");
		System.out.println(BrowserName);

		
		
		if (BrowserName.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (BrowserName.equals("Firefox")) 
		{

		}
		
		else if (BrowserName.equals("IE")) 
		{

			
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}

}
