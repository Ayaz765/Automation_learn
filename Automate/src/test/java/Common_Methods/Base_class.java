package Common_Methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	public static WebDriver driver;
	String Browser_name;
	public Properties Prop_file;
	
	public WebDriver Driver_IntializationBack() throws Throwable 
	
	{
		Prop_file= new Properties();
		FileInputStream FIS= new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Data\\Data.properties");
		
		Prop_file.load(FIS);
		
		Browser_name= Prop_file.getProperty("Browsername");
		
		System.out.println(Browser_name);
		
		if(Browser_name.equalsIgnoreCase("Chrome"))
		{
			
		
			System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver-win64\\chromedriver.exe");
			
			ChromeOptions co= new ChromeOptions();
			co.setBinary("C:\\Chrome\\chrome-win64\\chrome.exe");
			 driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if (Browser_name.equalsIgnoreCase("IE")) {
			//System.setProperty("webdriver.edge.driver", "C:\\\\edgedriver_win64\\\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		
		return driver;
		
		
		
	}
	

}
