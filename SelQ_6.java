package excercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SelQ_6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\holka\\Downloads\\Old\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
	    Actions act = new Actions(driver);
		
		WebElement frameEle = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameEle);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		//act.dragAndDrop(source, ele2).perform();
		
		act.dragAndDropBy(source, 85, 82).perform();
		
		if(target.getText().matches("Dropped!")) 
		{
			System.out.println("valid drop!");
		}else {
			System.out.println("Invalid drop!");
		}
		
		
		String beforedrp = source.getCssValue("color");
		
		act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		
		
		String Afterdrp = target.getCssValue("color");
		
		System.out.println("color before drop" + beforedrp);
		
		System.out.println("color after drop" + Afterdrp);

        
		
	
	}

}
