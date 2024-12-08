package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omayo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
	    Thread.sleep(1000);
	    act.keyDown(Keys.PAGE_DOWN).build().perform();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//button[@class=\"dropbtn\"]")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
	    driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    
	    driver.navigate().refresh();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
	    driver.findElement(By.id("timerButton")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
		
	    

	}

}
