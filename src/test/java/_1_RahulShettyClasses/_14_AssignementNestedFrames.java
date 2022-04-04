package _1_RahulShettyClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14_AssignementNestedFrames {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		WebElement topframe = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topframe);
		WebElement midframe = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(midframe);
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}

}
