
		
		import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;


		public class Assignmentone
		{



		public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("input[@type='checkbox']")).size());

	}

}
