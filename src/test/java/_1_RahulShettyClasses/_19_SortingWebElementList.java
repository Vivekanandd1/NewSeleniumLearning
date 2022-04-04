package _1_RahulShettyClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class _19_SortingWebElementList {static WebDriver driver;
public static void main(String[] args) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.xpath("//tr/th[1]")).click();
	List<WebElement> vegies = driver.findElements(By.xpath("//tr/td[1]"));
	List<String> Webele =vegies.stream().map(s->s.getText()).collect(Collectors.toList());
	List<String> sorted = Webele.stream().sorted().collect(Collectors.toList());
	Assert.assertTrue(Webele.equals(sorted));
	

}
}
