package Corecode;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Base.Baseclass;
import HOXTON_AUTOMATION.HOXTON_QA.Loginpage;
import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class Hoxton extends Baseclass

{
	public WebDriver driver;
	public ExtentReports extent;

	@BeforeTest
	public void ExtentReport() {

		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Hoxton");
		reporter.config().setDocumentTitle("Hoxton-Testcase-result");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Testername", "ayaz ahmad");

	}

	

	
	
	@BeforeMethod
	public void Login( ) throws InterruptedException, IOException {

		driver = initalizedriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		Loginpage lp= new Loginpage(driver);
		lp.getUsername().sendKeys("yashaswini.malviya@xceedance.com");
		lp.getpassword().sendKeys("Pass@12345");
		lp.getsignin().click();
		

	}

	@Parameters({ "Brokeremail" })
	@Test(priority = 1)
	public void AddnewUser(String brokermail) throws InterruptedException

	{
		ExtentTest test = extent.createTest("AddnewUser");
		driver.findElement(By.xpath("(//a[contains(@ng-click,'rc.showHideAction()')])[1]")).click();

		driver.findElement(By.xpath("(//a[@href='/UserManagement/Add'])[1]")).click();

		WebElement Brokername = driver.findElement(By.xpath("(//select[@name='roleId'])[1]"));

		Select dropdown = new Select(Brokername);

		dropdown.selectByIndex(0);

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("TEST");

		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("AUTOMATION");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(brokermail);

		driver.findElement(By.xpath("//a[@class='btn btn-primary search-quote legitRipple']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[normalize-space()='YES'])[1]")).click();
		Thread.sleep(3000);
		String[] name = driver.findElement(By.xpath(
				"//div[@class='alert alert-success alert-styled-left alert-arrow-left alert-bordered ng-binding']"))
				.getText().split(" ");
		String username = name[6].trim();

		System.out.println("USERNAME TO SIGNUP =" + username);
	}

	@Test(priority = 2)
	public void SearchUserByUserID() throws InterruptedException {

		ExtentTest test = extent.createTest("SearchUserByUserID");

		driver.findElement(By.xpath("(//a[contains(@ng-click,'rc.showHideAction()')])[1]")).click();

		driver.findElement(By.xpath("(//a[@href='/UserManagement'])[1]")).click();

		driver.findElement(By.xpath("//input[@name='UserId']")).sendKeys("WER");

		WebElement Searchbrokername = driver.findElement(
				By.xpath("(//select[@class='form-control field-md ng-pristine ng-untouched ng-valid ng-empty'])[1]"));

		Select dropdown = new Select(Searchbrokername);

		dropdown.selectByIndex(0);

		driver.findElement(By.xpath("//a[@class='btn btn-primary search-table']")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void SearchUserByUserFitstname() throws InterruptedException {
		ExtentTest test = extent.createTest("SearchUserByUserFitstname");
		driver.findElement(By.xpath("(//a[contains(@ng-click,'rc.showHideAction()')])[1]")).click();

		driver.findElement(By.xpath("(//a[@href='/UserManagement'])[1]")).click();

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ayaz");

		WebElement Searchbrokername = driver.findElement(
				By.xpath("(//select[@class='form-control field-md ng-pristine ng-untouched ng-valid ng-empty'])[1]"));

		Select dropdown = new Select(Searchbrokername);

		dropdown.selectByIndex(0);

		driver.findElement(By.xpath("//a[@class='btn btn-primary search-table']")).click();

		Thread.sleep(4000);
	}

	@Test(priority = 4)
	public void Gdpr() throws InterruptedException {

		ExtentTest test = extent.createTest("Gdpr");

		driver.findElement(By.xpath("(//a[@class='has-ul'])[5]")).click();

		driver.findElement(By.xpath("(//a[@href='/Gdpr'])[1]")).click();

		driver.findElement(By.xpath("//input[@ng-model='vm.InsuredName']")).sendKeys("sam");

		driver.findElement(By.xpath("(//a[@class='btn btn-primary search-table'])[1]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void creatquote() throws InterruptedException

	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//span[contains(text(),'CREATE A QUOTE OR SEARCH FOR EXISTING QUOTE/POLICY')]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Create Quote')]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='client']")).sendKeys("Ra");
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='client']")).sendKeys("j");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='client']")).sendKeys("a");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@id='selected_option']"));
		for (WebElement option : options)

		{
			if (option.getText().contains("Raja Raja")) {

				Thread.sleep(3000);
				// System.out.println(option);
				option.click();
				break;
			}
		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[normalize-space()='Motor']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Travel']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Investment']")).click();

		int day = 31;
		driver.findElement(By.name("EffectiveDate")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar'] //a[text() =" + day + "]")).click();

		jsExecutor.executeScript("window.scrollTo(0,400);");

		driver.findElement(By.xpath("//input[@value='true']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
		WebElement ddown = driver.findElement(By.xpath("//select[@name='IssuredEmployemnt']"));

		Select select = new Select(ddown);
		select.selectByVisibleText("Voluntary Work");
		Thread.sleep(3000);

		jsExecutor.executeScript("window.scrollTo(0,200);");

		driver.findElement(By.xpath("//label[@for='IsResidentAtMainAddrtrue']")).click();
		Thread.sleep(3000);
		jsExecutor.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='IsConvictedfalse']")).click();
		jsExecutor.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='HadInsurancefalse']")).click();
		jsExecutor.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='HadFinancialConcernfalse']")).click();
		jsExecutor.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Home']//a[1]")).click();
		Thread.sleep(3000);

		WebElement Nameinsured = driver.findElement(By.xpath("//select[@name='NamedInsuredId']"));

		Select Insuredname = new Select(Nameinsured);
		Insuredname.selectByVisibleText("Raja Raja");

		jsExecutor.executeScript("window.scrollTo(0,500);");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='IsSameAsContact']")).click();
		Thread.sleep(9000);

		driver.findElement(By.xpath("//label[@for='building']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Valuable Articles']")).click();
		driver.findElement(By.xpath("//label[@for='content']")).click();
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,400);");

		driver.findElement(By.xpath("//input[@name='BuildingSumInsured']")).sendKeys("1000000");

		driver.findElement(By.xpath("//input[@name='ContentSumInsured']")).sendKeys("100000");

		driver.findElement(By.xpath("//label[@for='IsAnyProfessionalActivityfalse']")).click();
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='HasEmptyForLongTimefalse']")).click();
		driver.findElement(By.xpath("//label[@for='HasUnoccupiedForLongTimefalse']")).click();
		driver.findElement(By.xpath("//label[@for='IsSufferedFromFloodfalse']")).click();
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,350);");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='HasPropertySufferedfalse']")).click();
		driver.findElement(By.xpath("//label[@for='IsUnderwayWorkfalse']")).click();
		driver.findElement(By.xpath("//label[@for='IsPlanningWorkfalse']")).click();

		WebElement propertyType = driver.findElement(By.xpath("//select[@id='propertyType']"));

		Select PT = new Select(propertyType);
		PT.selectByVisibleText("Detached Bungalow");
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,300);");
		Thread.sleep(2000);

		WebElement drdown1 = driver.findElement(By.xpath("//select[@name='numberOfFloors']"));

		Select select1 = new Select(drdown1);
		select1.selectByVisibleText("2");

		driver.findElement(By.xpath("//label[@for='UIIsHabitableBasementfalse']")).click();
		driver.findElement(By.xpath("//label[@for='IsLoftConversionfalse']")).click();
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);

		WebElement drdown2 = driver.findElement(By.xpath("//select[@name=' listedStatus ']"));

		Select select2 = new Select(drdown2);
		select2.selectByVisibleText("Grade A (Northern Ireland)");

		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,300);");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='IsSecurityAlarmExistsfalse']")).click();

		driver.findElement(By.xpath("//label[@for='HasClaimsfalse']")).click();
		Thread.sleep(2000);

		jsExecutor.executeScript("window.scrollBy(0,430);");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='HaveOutbuildingsfalse']")).click();

		driver.findElement(By.xpath("//label[@for='IsAnyOutbuildingLetoutForMoreDayfalse']")).click();
		driver.findElement(By.xpath("//input[@ng-required='baseVM.home.data.QuestionModel.IsTenantCover']"))
				.sendKeys("5000");
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,450);");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='ArtCollectiblesInsuredSum']")).sendKeys("999");

		driver.findElement(By.xpath("//input[@name='UnspecifiedValuablesInsuredSum']")).sendKeys("999");

		driver.findElement(By.xpath("//label[@for='IsSpecifiedArticlefalse']")).click();

		jsExecutor.executeScript("window.scrollBy(0,300);");

		driver.findElement(By.xpath("//label[@for='Mortgagefalse']")).click();

		driver.findElement(By.xpath("//div[@title='Motor']//a[@class='ng-binding']")).click();
		Thread.sleep(5000);

		WebElement Insurename = driver.findElement(By.xpath("//select[@name='InsuredPersonId']"));

		Select IN = new Select(Insurename);
		IN.selectByVisibleText("Raja Raja");
		Thread.sleep(3000);

		jsExecutor.executeScript("window.scrollTo(0,500);");

		driver.findElement(By.xpath("//label[@for='IsVehicleRegisteredtrue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='registrationNumber']")).sendKeys("OE17CYH");
		driver.findElement(By.xpath("(//div[@class='question'])[6]")).click();

		jsExecutor.executeScript("window.scrollBy(0,300);");

		WebElement Fueltype = driver.findElement(By.xpath("//select[@name='fuelType']"));

		Select FT = new Select(Fueltype);
		FT.selectByVisibleText("Petrol");
		Thread.sleep(2000);

		WebElement Vehicleusage = driver.findElement(By.xpath("//select[@name='vehicleUsage']"));

		Select VU = new Select(Vehicleusage);
		VU.selectByVisibleText("Social and Commuting");
		Thread.sleep(2000);

		WebElement VehicleEstimated = driver.findElement(By.xpath("//select[@name='vehicleEstimatedTotalMileage']"));

		Select VE = new Select(VehicleEstimated);
		VE.selectByVisibleText("6,000-7,000 Miles");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='isModifiedfalse']")).click();
		Thread.sleep(2000);

		WebElement VehicleKeptDuringDay = driver.findElement(By.xpath("//select[@name='vehicleKeptDuringDayId']"));

		Select VKDD = new Select(VehicleKeptDuringDay);
		VKDD.selectByVisibleText("Driveway");
		Thread.sleep(2000);

		WebElement VehicleKeptDuringNight = driver.findElement(By.xpath("//select[@name='vehicleKeptDuringNightId']"));

		Select VKDN = new Select(VehicleKeptDuringNight);
		VKDN.selectByVisibleText("Locked Garage");
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,300);");

		driver.findElement(By.xpath("//label[@for='isVehicleKeptInPropertytrue']")).click();

		WebElement VehicleDriveType = driver.findElement(By.xpath("//select[@name='vehicleDriveType']"));

		Select VDT = new Select(VehicleDriveType);
		VDT.selectByVisibleText("Right hand drive");
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.xpath("//label[@for='SecurityStatusDescriptionUIfalse']")).click();
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.xpath("//a[normalize-space()='Driver1']")).click();

		WebElement Drivername = driver.findElement(By.xpath("//select[@name='driver_0']"));

		Select DN = new Select(Drivername);
		DN.selectByVisibleText("Raja Raja");
		Thread.sleep(2000);

		WebElement LicenseType = driver.findElement(By.xpath("//select[@name='LicenseType']"));

		Select LT = new Select(LicenseType);
		LT.selectByVisibleText("Full UK Car Licence");
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,300);");

		driver.findElement(By.xpath("//label[@for='isRegularAccess01']")).click();

		driver.findElement(By.xpath("//label[@for='isMedicalCondition01']")).click();

		driver.findElement(By.xpath("//label[@for='isAnyClaims01']")).click();
		Thread.sleep(2000);

		jsExecutor.executeScript("window.scrollBy(0,400);");

		WebElement Drivertype = driver.findElement(By.xpath("//select[@name='driverType_0']"));

		Select DT = new Select(Drivertype);
		DT.selectByVisibleText("Primary");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='licenceHeldMonths']")).sendKeys("12");

		driver.findElement(By.xpath("//label[@for='isMotorConvictions01']")).click();

		driver.findElement(By.xpath("//div[@title='Travel']//a[@class='ng-binding']")).click();
		Thread.sleep(5000);

		WebElement Insuredpersonid = driver.findElement(By.xpath("//select[@name='InsuredPersonId']"));

		Select IPI = new Select(Insuredpersonid);
		IPI.selectByVisibleText("Raja Raja");
		Thread.sleep(4000);

		jsExecutor.executeScript("window.scrollTo(0,500);");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@name='travellerInsuredPersonsIds' and @role='listbox']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//md-option//div[contains(text(), 'Raja Raja')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='isWaitingForResultfalse']")).click();

		driver.findElement(By.xpath("//label[@for='isTravelRelatedClaimsfalse']")).click();
		Thread.sleep(2000);

		jsExecutor.executeScript("window.scrollBy(0,400);");

		driver.findElement(By.xpath("//label[@for='isMedicalTreatmentfalse']")).click();

		driver.findElement(By.xpath("//label[@for='isMedicalOngoingMonitoringfalse']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@title='Investment']//a[@class='ng-binding']")).click();
		Thread.sleep(5000);

		WebElement Nameinsuredname = driver.findElement(By.xpath("//select[@name='NamedInsured']"));

		Select NIN = new Select(Nameinsuredname);
		NIN.selectByVisibleText("Raja Raja");
		Thread.sleep(2000);

		jsExecutor.executeScript("window.scrollTo(0,400);");

		driver.findElement(By.xpath("//input[@name='a1']")).click();
		Thread.sleep(9000);
		jsExecutor.executeScript("window.scrollBy(0,300);");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//label[@for='IsBuildingCoverfalse']")).click();

		WebElement InvestmentPropertyOwnedYears = driver
				.findElement(By.xpath("//select[@name='InvestmentPropertyOwnedYears']"));
		Select IPOY = new Select(InvestmentPropertyOwnedYears);
		IPOY.selectByVisibleText("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='IsContentCoverfalse']")).click();
		driver.findElement(By.xpath("//label[@for='IsValuableCoverfalse']")).click();
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,300);");
		driver.findElement(By.xpath("//label[@for='IsRentalIncomeInsurefalse']")).click();
		driver.findElement(By.xpath("//label[@for='IsAnyProfessionalActivityfalse']")).click();
		driver.findElement(By.xpath("//label[@for='HasUnoccupiedForLongTimefalse']")).click();
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,400);");
		driver.findElement(By.xpath("//label[@for='HasLetoutByAgentfalse']")).click();
		driver.findElement(By.xpath("//label[@for='HasPropertyUnderAssuredfalse']")).click();
		Thread.sleep(2000);
		WebElement PropertyLetTo = driver.findElement(By.xpath("//select[@name='PropertyLetTo']"));
		Select PLG = new Select(PropertyLetTo);
		PLG.selectByVisibleText("Professionals");
		driver.findElement(By.xpath("//label[@for='IsUsedForHolidayfalse']")).click();
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,400);");
		driver.findElement(By.xpath("//label[@for='IsSufferedFromFloodfalse']")).click();
		driver.findElement(By.xpath("//label[@for='HasPropertySufferedfalse']")).click();
		driver.findElement(By.xpath("//label[@for='IsUnderwayWorkfalse']")).click();
		jsExecutor.executeScript("window.scrollBy(0,350);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='IsPlanningWorkfalse']")).click();
		WebElement drdown3 = driver.findElement(By.xpath("//select[@id='propertyType']"));
		Select select3 = new Select(drdown3);
		select3.selectByVisibleText("Detached Bungalow");
		WebElement drdown4 = driver.findElement(By.xpath("//select[@name='numberOfFloors']"));
		Select select4 = new Select(drdown4);
		select4.selectByVisibleText("2");
		driver.findElement(By.xpath("//label[@for='UIIsHabitableBasementfalse']")).click();
		jsExecutor.executeScript("window.scrollBy(0,400);");
		driver.findElement(By.xpath("//label[@for='IsLoftConversionfalse']")).click();

		Thread.sleep(2000);

		WebElement drdown8 = driver.findElement(By.xpath("//select[@name=' listedStatus ']"));
		Select select8 = new Select(drdown8);
		select8.selectByVisibleText("Grade A (Scotland)");

		WebElement drdown9 = driver.findElement(By.xpath("//select[@name='numberOfBedRoom']"));
		Select select9 = new Select(drdown9);
		select9.selectByVisibleText("2");

		WebElement drdown10 = driver.findElement(By.xpath("//select[@name='numberOfBathrom']"));
		Select select10 = new Select(drdown10);
		select10.selectByVisibleText("2");

		driver.findElement(By.xpath("//label[@for='IsSecurityAlarmExistsfalse']")).click();

		jsExecutor.executeScript("window.scrollBy(0,300);");

		driver.findElement(By.xpath("//label[@for='HasClaimsfalse']")).click();
		driver.findElement(By.xpath("//label[@for='Mortgagefalse']")).click();

	}

	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@AfterTest
	public void endreports() {
		extent.flush();

	}

}
