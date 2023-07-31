package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelQ_4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\holka\\Downloads\\Old\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.ebay.com/");
		 
		 driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple Watches");
		 
		WebElement catg =  driver.findElement(By.name("_sacat"));
		catg.click();
		
		Select s = new Select(catg);
		s.selectByValue("293");
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		}

}
