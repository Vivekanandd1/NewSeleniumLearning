package _1_RahulShettyClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_DynamicDropDownAndDate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='AMD']")).click();
		//driver.findElement(By.xpath("//a[@value='AMD']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI']")).click();
		//driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//td/a[@class='ui-state-default']"));
		for(WebElement date : dates) {
			if(date.getText().equalsIgnoreCase("24")) {
				date.click();
				Thread.sleep(3000);
				break;
			}
		}
		
		
		driver.quit();
		
	}

}
