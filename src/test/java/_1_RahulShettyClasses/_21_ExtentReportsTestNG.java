package _1_RahulShettyClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class _21_ExtentReportsTestNG {
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		String path =System.getProperty("user.dir")+"\\reports\\reports.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Vivekanand");
		reporter.config().setDocumentTitle("Test Results");
		
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "Vivek");
	}
@Test
public void setup()
  { extent.createTest("DemoTest");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	extent.flush();
	}
}
