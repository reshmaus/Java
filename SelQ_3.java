package excercise1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import July_20.SelectRadio;

public class SelQ_3 {

	static WebDriver driver;
	
	public void getlinks() throws InterruptedException
	{
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 System.out.println("total links available on this page" + allLinks.size());
		 
		 for (WebElement links: allLinks)
		 {
			  System.out.println(links.getText());
			 System.out.println(links.getAttribute("href"));
		}
		 
		 Thread.sleep(2000);
		 driver.close();
		 
	    }
                 public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\holka\\Downloads\\Old\\Selenium\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
        	driver.navigate().to("http://flipkart.com");
		
		SelQ_3 s = new SelQ_3();
		s.getlinks();
		
                 }
}

		 


