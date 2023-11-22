package Automation.Xceedance_Hoxton;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class

{
	public static WebDriver driver;
	String Browser_Name;

	public WebDriver Inialization_Driver() throws Throwable

	{
		Properties prop = new Properties();
		FileInputStream Fis = new FileInputStream(
		System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Data.properties");
		prop.load(Fis);
		Browser_Name = prop.getProperty("Browsername");
		
		System.out.println(Browser_Name);

		if (Browser_Name.equalsIgnoreCase("Chrome")) 
		{
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		

		else if (Browser_Name.equalsIgnoreCase("IE")) 
		{
			///
		}
		
		else if (Browser_Name.equalsIgnoreCase("Mozila")) 
		{
			///
		}
		return driver;
	
	}
	
	public void Go_To_url()
	{
		
		driver.get("https://uatbrokerportal.hoxtoninsuranceservices.com");
	}
	
	


}