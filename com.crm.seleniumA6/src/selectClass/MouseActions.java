package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseActions 
{
	public static void main(String[] args) 
	{
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.myntra.com/");
	  driver.findElement(By.cssSelector("a[class=\'desktop-main\']")).click();
	}

}
