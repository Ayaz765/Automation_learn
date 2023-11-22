package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public  class ExtentReporterNG {
	static ExtentReports extent;
	
	public static ExtentReports getreportobject()
	{
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Hoxton");
		reporter.config().setDocumentTitle("Hoxton-Testcase-result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Testername", "ayaz ahmad");
		return extent;

	}
}
