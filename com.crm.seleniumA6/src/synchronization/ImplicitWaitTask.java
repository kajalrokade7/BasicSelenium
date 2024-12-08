package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitTask {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://omayo.blogspot.com/");
		
	
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		act.keyDown(Keys.PAGE_DOWN).build().perform();
	  
	    act.keyDown(Keys.PAGE_DOWN).build().perform();
	
	    
	    driver.findElement(By.xpath("//button[@class=\"dropbtn\"]")).click();
	    
	 
	    driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	
	    driver.navigate().back();
	    
	    driver.navigate().refresh();
	    
	
	    driver.findElement(By.id("timerButton")).click();
	   
	    driver.switchTo().alert().accept();

	}

}
