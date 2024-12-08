package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement double_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);
		act.moveToElement(double_click).doubleClick().build().perform();
		Thread.sleep(2000);
		act.doubleClick().build().perform();

	}

}
