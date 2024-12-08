package iframe;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DwsAssign {

	public static void main(String[] args) throws InterruptedException 
	{
		String given_url = "https://www.facebook.com/nopCommerce";
		
		//Enter into browser 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Verify the page using WebElement
		WebElement wb = driver.findElement(By.cssSelector("img[alt=\"Tricentis Demo Web Shop\"]"));
		if(wb.isDisplayed())
		{
			System.out.println("Dws Page is verified successfully");
			
			//Click on facebook by switching controller to child page
			Actions act = new Actions(driver);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			
		
			driver.findElement(By.linkText("Facebook")).click();
			String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			child.remove(parent);
			for(String str : child)
			{
				driver.switchTo().window(str);
				String current_url = driver.getCurrentUrl();
				if(given_url.equals(current_url))
				{
					driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
					Thread.sleep(2000);
				}
			}
			
			//Sending values in searchfield of dws page by switching controller to parent page
			driver.switchTo().window(parent);
			
			driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
			driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
			
			//Click on google link
			driver.findElement(By.linkText("Google+")).click();
			
			//close the browser
			driver.close();
			
			
			
		}

	}

}
