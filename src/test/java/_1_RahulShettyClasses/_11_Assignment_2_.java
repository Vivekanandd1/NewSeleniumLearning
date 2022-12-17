package _1_RahulShettyClasses;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _11_Assignment_2_ {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {	
	WebDriverManager.chromedriver().setup();
    driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("password")).sendKeys("learning");
	driver.findElement(By.cssSelector("label input[value='user']")).click();
	WebDriverWait dc = new WebDriverWait(driver, Duration.ofSeconds(10000));
	//Thread.sleep(3000);
	dc.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
	driver.findElement(By.id("okayBtn")).click();
	WebElement Sc = driver.findElement(By.cssSelector("select[class='form-control']"));
	Select role = new Select(Sc);
	role.selectByValue("consult");
	driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	driver.findElement(By.id("signInBtn")).click();
	dc.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-info")));
	List<WebElement> products = driver.findElements(By.cssSelector("button.btn-info"));
	for(int i=0;i<products.size();i++) {
		products.get(i).click();
	}
	driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
	
	driver.quit();
	
	
}

}
