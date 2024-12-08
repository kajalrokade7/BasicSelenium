package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement community_poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if(community_poll.isDisplayed())
		{
			System.out.println("Element is displayed");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//label[text()='Excellent']")).click();
			
		}
		else
		{
			System.out.println("Element is not displayed");
			driver.close();
		}
	}

}
