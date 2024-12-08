package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyPageController {

	public static void main(String[] args) throws InterruptedException 
	{   
		String given_url = "https://www.facebook.com/nopCommerce";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		for(String str : child)
		{
			driver.switchTo().window(str);
			String current_url = driver.getCurrentUrl();
			if(given_url.equals(current_url))
			{
				driver.findElement(By.xpath("//input[@id=':r12:']")).sendKeys("kajalrokade@gmail.com");
			}
		}

	}

}
