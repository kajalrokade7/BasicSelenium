package actionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlayingWithActions //search using only keyboard actions (without using webelements)
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.sendKeys("mobile").build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).build().perform();
		
	}

}
