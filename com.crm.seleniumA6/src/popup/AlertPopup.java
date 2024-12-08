package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup 
{
    public static void main(String[] args) throws InterruptedException 
	{
    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[value=\'Search\']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
