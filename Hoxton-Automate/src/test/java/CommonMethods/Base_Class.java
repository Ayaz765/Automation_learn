package CommonMethods;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class

{
	public static WebDriver driver;
	String Browser_Name;
	public Properties prop;

	public WebDriver Inialization_Driver() throws Throwable

	{
		prop = new Properties();
		FileInputStream Fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Data\\Data.properties");
		prop.load(Fis);
		Browser_Name = prop.getProperty("Browsername");

		System.out.println(Browser_Name);

		if (Browser_Name.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();

			// System.setProperty("webdriver.chrome.driver",
			// "C:\\\\chromedriver\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (Browser_Name.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.edge.driver", "C:\\\\edgedriver_win64\\\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		else if (Browser_Name.equalsIgnoreCase("Mozila")) {
			///
		}
		return driver;

	}

}