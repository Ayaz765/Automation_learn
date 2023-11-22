package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {
	public WebDriver driver;
	public Properties pro;

	public WebDriver initalizedriver() throws IOException {
		pro = new Properties();
		FileInputStream Fis = new FileInputStream(
				"C:\\properties\\getdata.properties");
		pro.load(Fis);
		String BrowserName = pro.getProperty("browser");
		System.out.println(BrowserName);

		if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (BrowserName.equals("Firefox")) {

		}

		else if (BrowserName.equals("IE")) {
			System.setProperty("webdriver.edge.driver", "C:\\\\edgedriver_win64\\\\msedgedriver.exe");
			driver=new EdgeDriver ();
			driver.manage().window().maximize();

		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public String getScreenShotPath(String TestcaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + TestcaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

	}

}
