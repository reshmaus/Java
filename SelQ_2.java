package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import July_20.SelectRadio;

public class SelQ_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\holka\\Downloads\\Old\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.fb.com");
		
		String T = driver.getCurrentUrl();
		
		if(T.matches("https://www.facebook.com/")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		 WebElement acc = driver.findElement(By.linkText("Create new account"));
		     boolean a1 = acc.isDisplayed();
		     System.out.println(a1);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Avni");
		driver.findElement(By.name("lastname")).sendKeys("Gayakwad");
		driver.findElement(By.name("reg_email__")).sendKeys("avni@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("avni@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Avni@123");
		
        driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		
        driver.findElement(By.id("day")).sendKeys("01");
        driver.findElement(By.id("month")).sendKeys("Jun");
        driver.findElement(By.id("year")).sendKeys("2015");
        
        driver.findElement(By.name("websubmit")).click();
        
    	Thread.sleep(5000);
        WebElement ele = driver.findElement(By.linkText("Log In"));
          		
        if(ele.getText().matches("Log In")) {
        	System.out.println("sucessfully created Account");
        }else {
        	System.out.println("Account not created");
        }
        
        driver.close();
		
	}

}
