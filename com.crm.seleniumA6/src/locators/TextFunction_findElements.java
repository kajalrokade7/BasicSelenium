package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction_findElements {

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
			List<WebElement> ratings = driver.findElements(By.xpath("//ul[@class='poll-options']/li/label"));
			for(WebElement web : ratings)
			{
				web.click();
				System.out.println(web.getText());
				Thread.sleep(1000);
			}
	    }
		else
		{
			System.out.println("Element is not displayed");
			driver.close();
		}
	}


}
