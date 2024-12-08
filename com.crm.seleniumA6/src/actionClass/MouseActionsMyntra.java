package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseActionsMyntra 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.myntra.com/");
	 
	 Actions act = new Actions(driver);
	 WebElement kids = driver.findElement(By.cssSelector("a[class=\'desktop-main\']"));
	 act.moveToElement(kids).build().perform();
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//a[@data-reactid=353]")).click();
	  
	}
}
