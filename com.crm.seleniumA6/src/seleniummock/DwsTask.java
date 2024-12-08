package seleniummock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DwsTask extends Base {

	public static void main(String[] args) throws InterruptedException 
	{
		String givenUrl = "https://demowebshop.tricentis.com/";
		Base.preCondition("chrome","https://demowebshop.tricentis.com/");
		String currentUrl = driver.getCurrentUrl();
		
		
		if(givenUrl.equals(currentUrl))
		{
			System.out.println("I am in DWS webpage");
			
			Base.login();
	
			Thread.sleep(2000);
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,510);");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[@href='/25-virtual-gift-card'])[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("recipient-name")).sendKeys("Muddassar Shaikh");
			driver.findElement(By.className("recipient-email")).sendKeys("maddy41@gmail.com");
			driver.findElement(By.className("message")).sendKeys("Happy birthday!!!");
			WebElement value = driver.findElement(By.xpath("//input[@value='1']"));
			value.clear();
			value.sendKeys("5");
			
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			
			WebElement gift = driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[2]"));
			
			if(gift.isDisplayed())
			{
				System.out.println("Gift card is added successfully");
				Base.logout();
			}
			else
			{
				System.out.println("Gift card is not added");
			}
		}
		
		else
		{
			System.out.println("I am not in DWS webpage");
			driver.close();
		
		}
		
		
	}


	

}
