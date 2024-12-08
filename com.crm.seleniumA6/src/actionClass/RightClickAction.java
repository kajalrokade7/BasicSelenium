package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.moveToElement(right_click).build().perform();
		act.contextClick().build().perform();
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(2000);
		try 
		{
		    act.contextClick().build().perform();
			System.out.println("PopUp is not displayed");
		}
		catch(Exception e)
		{
			System.out.println("PopUp is displayed");
		}
		driver.close();
		

	}

}
