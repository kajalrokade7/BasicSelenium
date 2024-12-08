package popup;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPRedbus 
{
	 public static void main(String[] args) throws InterruptedException, AWTException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.agoda.com/");
			
		
		}
}
