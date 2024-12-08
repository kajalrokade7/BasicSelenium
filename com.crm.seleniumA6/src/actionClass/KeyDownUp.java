package actionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownUp 
{
    public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://demowebshop.tricentis.com/");
	   Thread.sleep(1000);
	   Actions act = new Actions(driver);
	   act.keyDown(Keys.TAB).build().perform();
	   Thread.sleep(1000);
	   act.keyDown(Keys.TAB).build().perform();
	   Thread.sleep(1000);
	   act.keyDown(Keys.ENTER).build().perform();
	   Thread.sleep(1000);
	   act.keyUp(Keys.TAB).build().perform();
	   act.keyUp(Keys.ENTER).build().perform();
	   
	   

	}

}
