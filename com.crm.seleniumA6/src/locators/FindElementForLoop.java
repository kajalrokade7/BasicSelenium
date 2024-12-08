package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementForLoop 
{
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
			
			List<WebElement>rating_value = driver.findElements(By.cssSelector("input[type=\'radio\']"));
			
			//Using for loop
			for(int i=0; i<rating_value.size(); i++)
			{
				rating_value.get(i).click();
				Thread.sleep(2000);
			}
			
			Thread.sleep(2000);
			
			// Or Using for each loop
			for(WebElement web : rating_value)
			{
				web.click();
				Thread.sleep(2000);
				
			}
			//When you are trying to find any text then that element is not in <a> tag then we go for Xpath. one type of language
			//We are having two types of xpath 1.absolute(/) 2.relative
			//1.Xpath:- we are trying to find an element using absolute path (root of the path. i.e.HTML tag)
			//
		}
	}
			
}
 