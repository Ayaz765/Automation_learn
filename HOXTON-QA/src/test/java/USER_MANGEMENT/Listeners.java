package USER_MANGEMENT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.Baseclass;
import Base.ExtentReporterNG;

public class Listeners extends Baseclass implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentReporterNG.getreportobject();
	ThreadLocal<ExtentTest> extentest = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		extentest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test passed");

	}

	public void onTestFailure(ITestResult result) {

		extentest.get().fail(result.getThrowable());

		WebDriver driver = null;
		String Testmethodname = result.getMethod().getMethodName();
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {

		}

		try {
			extentest.get().addScreenCaptureFromPath(getScreenShotPath(Testmethodname, driver),
					result.getMethod().getMethodName());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		extent.flush();

	}

}
