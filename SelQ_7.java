package excercise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class SelQ_7 {

	     public static void main(String[] args) {
			
		
		//Launch the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\holka\\Downloads\\Old\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		
		
		//Navigate to gmail application
		driver.navigate().to("https://www.gmail.com/");
		
		//enter a valid Email Id or phone number
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("def410021@gmail.com");
		
		//click next button
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
        //Enter password 
		WebElement pwd = driver.findElement(By.xpath("//input[@name='Passwd']"));
		pwd.isDisplayed();
		pwd.sendKeys("Abc@1234");
		
		//click Next button
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		//verify that gmail is logged in sucessfully
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Inbox')]")));
		
		
		WebElement Inbx = driver.findElement(By.xpath("//a[contains(text(),'Inbox')]"));
		
		if(Inbx.isDisplayed())
	    {
			System.out.println("login Successfull");
		}else {
			System.out.println("login failed");
		}
		
		//click compose
		WebElement comp = driver.findElement(By.xpath("//div[contains(text(),'Compose')]"));
		comp.click();
		
		WebElement com = driver.findElement(By.xpath("//span[contains(text(),'New Message')]"));
		

		if(com.isDisplayed())
	    {
			System.out.println("New Email window is opened ");
		}else {
			System.out.println("New Email window not find");
		}
		
    	//enter EmailId
		//w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=':f3']")));
		
		WebElement to = driver.findElement(By.xpath("//input[@class = 'agP aFw']"));
		to.sendKeys("holkarr@gmail.com");
		
		//Enter Subject
         driver.findElement(By.xpath("//input[@name = 'subjectbox']")).sendKeys("QA Automation Test Mail");
         
         //compose Email
         driver.findElement(By.xpath("//div[@class = 'Am Al editable LW-avf tS-tW']")).sendKeys("Hi, writing Automation script");
         
         //click on send button
         driver.findElement(By.xpath("//div[text() = 'Send']")).click();
		
		
	}

}

