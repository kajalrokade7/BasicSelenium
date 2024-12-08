package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		WebElement poll = driver.findElement(By.id("vote-poll-1"));
		
		if(poll.isDisplayed())
		{
			System.out.println("I am in a DWS page");
			
			List<WebElement>rating_value = driver.findElements(By.cssSelector("[type=\'radio\']"));
			
			rating_value.get(0).click();
			
			Thread.sleep(2000);
			
			rating_value.get(1).click();
			
			Thread.sleep(2000);
			
			rating_value.get(2).click();
			
			Thread.sleep(2000);
			
			rating_value.get(3).click();
			
		}
		
		
		else
		{
			System.out.println("I am not in a DWS page");
		}
		driver.close();
	}

}
