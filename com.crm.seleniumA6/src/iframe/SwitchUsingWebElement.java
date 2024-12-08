package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchUsingWebElement {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		
		//Actions act = new Actions(driver);
		//act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"send-sms-iframe\"]"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("1234567890");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//div[@id=\"hamburger\"]")).click();
		driver.findElement(By.id("ffca")).click();
		
		
	}
}

//	open the browser
//	maximize
//	implicit wait
//	enter into iframe
//	verify page using webelement
//	click fb which is present at the bottom
//	click create new account 
//	send some values inside dws searchfield
//	click the google link
//	close the browser



