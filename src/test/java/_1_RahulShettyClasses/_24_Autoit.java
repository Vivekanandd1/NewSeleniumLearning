package _1_RahulShettyClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _24_Autoit {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://formstone.it/components/upload/demo/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
	}

}
