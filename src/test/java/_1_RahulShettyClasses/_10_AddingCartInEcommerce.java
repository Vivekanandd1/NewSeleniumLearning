package _1_RahulShettyClasses;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _10_AddingCartInEcommerce {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		String[] itemneeded = {"Raspberry","Brinjal","Cucumber","Carrot","Pomegranate"};
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		_10_AddingCartInEcommerce obj = new _10_AddingCartInEcommerce();
		obj.Additems(itemneeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
	    driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	    driver.findElement(By.cssSelector("select[style='width: 200px;']")).click();
	    WebElement country = driver.findElement(By.cssSelector("select[style='width: 200px;']"));
	    Select slct = new Select(country);
	    slct.selectByValue("India");
	    
	    
	    
		
	}
	public void Additems(String[] itemneeded) throws InterruptedException  {
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i = 0;i<products.size();i++) {
			String[] names = products.get(i).getText().split("-");
			String Formatname  = names[0].trim();
			List itemsneeded = Arrays.asList(itemneeded);
			int j=0;
		 if(itemsneeded.contains(Formatname)) {
			 j++;
			 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			 
            if(j==itemsneeded.size()) {
            break;}
            
		 }
		}
		 
	}
	}

