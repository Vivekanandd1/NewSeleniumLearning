package _1_RahulShettyClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _7_CheckBoxesExercise {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.cssSelector("label input[value='option1']")).isSelected());
		driver.findElement(By.cssSelector("label input[value='option1']")).click();
		System.out.println(driver.findElement(By.cssSelector("label input[value='option1']")).isSelected());
		driver.findElement(By.cssSelector("label input[value='option1']")).click();
		System.out.println(driver.findElement(By.cssSelector("label input[value='option1']")).isSelected());
		List<WebElement> boxes = driver.findElements(By.cssSelector("label input[type='checkbox']"));
		System.out.println(boxes.size());
		driver.quit();
		
	}

}
