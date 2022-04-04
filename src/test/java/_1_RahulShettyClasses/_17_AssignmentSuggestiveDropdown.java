package _1_RahulShettyClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17_AssignmentSuggestiveDropdown {
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
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		List <WebElement>county = driver.findElements(By.cssSelector("li.ui-menu-item"));
		for(WebElement option:county){
			if(option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
			}
		
		}
	}

}
