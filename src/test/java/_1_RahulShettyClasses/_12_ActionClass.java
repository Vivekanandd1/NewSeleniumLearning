package _1_RahulShettyClasses;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _12_ActionClass {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		Actions A = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[data-group='men']"));
		A.moveToElement(driver.findElement(By.cssSelector("input[class ='desktop-searchBar']"))).click().keyDown(Keys.SHIFT).sendKeys("saree").doubleClick().build().perform();
        A.moveToElement(move).build().perform();
        A.moveToElement(move).contextClick().build().perform();      
		
		
	}

}
