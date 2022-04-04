package _1_RahulShettyClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _6_AssertionsInWebPages {
	 static WebDriver driver;
     public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("WebDrivers",Keys.ENTER);
//		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
		
		String Title = driver.getTitle();
		String title = "vddkm";
		System.out.println(Title);
//		Assert.assertEquals(Title, "WebDrivers - Google Search");
//		System.out.println("this is ok");
		Assert.assertFalse(false, title);//false and false will become false and condtion will pass
//		Assert.assertTrue(false, Title);
		
		
		Thread.sleep(4000);
		driver.quit();

}
}