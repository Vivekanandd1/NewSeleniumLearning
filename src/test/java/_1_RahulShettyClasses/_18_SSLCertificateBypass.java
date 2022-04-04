package _1_RahulShettyClasses;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class _18_SSLCertificateBypass {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://expired.badssl.com/");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(src,new File(System.getProperty("user.dir") + "/src/test/java/ScreenShots/screenshot"+System.currentTimeMillis()+"sct.jpg"));
        driver.quit();
        
	}
}
