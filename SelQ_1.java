package excercise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelQ_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\holka\\Downloads\\Old\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://vitshr.com/");
		String T = driver.getTitle();
		
	   if(T.matches("VITS HR"))
	   {
		   System.out.println("PASS");
	   }else {
		   System.out.println("Fail");
	   }
		
	   driver.navigate().to("https://www.facebook.com/");
	   
	   driver.navigate().to("https://vitshr.com/");
	   
	   System.out.println(driver.getCurrentUrl());
	   
	   driver.navigate().forward();
	   driver.navigate().refresh();
	   
	   driver.close();
	}

}
