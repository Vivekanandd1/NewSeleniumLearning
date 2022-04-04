package _1_RahulShettyClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _8_AssignMents {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("form div input[name='name']")).sendKeys("Rony");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Rony11888@hotmail.com");
		driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("rony@83482");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		WebElement Gender = driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
		Select Gen = new Select(Gender);
		Gen.selectByIndex(0);
		System.out.println(Gen.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("12/9/1993");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
