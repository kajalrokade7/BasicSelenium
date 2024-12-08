package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold 
{
    public static void main(String[] args) throws InterruptedException 
	{
    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy = driver.findElement(By.id("box106"));
		act.clickAndHold(rome).release(italy).build().perform();
		Thread.sleep(1000);
		driver.close();
		

	}

}
