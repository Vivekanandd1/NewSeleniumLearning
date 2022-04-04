package _1_RahulShettyClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _16_AssignmentWebTables {
	static WebDriver driver;
	public static void main(String[] args) {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.cssSelector("div[style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']")).click();
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		int rowe = 0;
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		for(int i = 0;i<row.size();i++) {
			driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).get(i);
			rowe++;
			
		}
		int column = 0;
		List<WebElement> clmn = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		for(int i = 0;i<clmn.size();i++) {
			driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).get(i);
			column++;
			
		}
		System.out.println("row in table "+rowe);
		System.out.println("Column in table "+column);
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).get(2).getText());
		
		driver.quit();
}

}
