package _1_RahulShettyClasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _15_Assignement {
	static ChromeDriver driver;
//
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String Checkbx1 = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		String Checkbx = Checkbx1.toLowerCase();
		driver.findElement(By.id("dropdown-class-example")).click();
//		Thread.sleep(4000);
		WebElement Dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select slct = new Select(Dropdown);
		slct.selectByValue(Checkbx);
		driver.findElement(By.id("name")).sendKeys(Checkbx1);
		driver.findElement(By.id("alertbtn")).click();
//		driver.switchTo().alert().getText().split(",");
//		String[] txt = driver.switchTo().alert().getText().split(",")[0].split(" ");
//		String lastobj = txt[1];
//		System.out.println(lastobj);
		String alrttxt = driver.switchTo().alert().getText();
		System.out.println(alrttxt);
//		alrttxt.contains(Checkbx1);
		System.out.println(alrttxt.contains(Checkbx1));

		driver.quit();

	}
}
