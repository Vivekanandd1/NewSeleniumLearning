package _1_RahulShettyClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_CheckBoxHandlings {
     static WebDriver driver;
     public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_IndArm']")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_IndArm']")).isSelected());
		List<WebElement> Opts  = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(Opts.size());
		driver.quit();
		
	}
}
