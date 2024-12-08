package iframe;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DwsIframe {

	public static void main(String[] args) throws InterruptedException 
	{
String given_url = "https://www.facebook.com/nopCommerce";
		
		//Enter into browser 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/DELL/Downloads/iframe%20(1)%20(1).html");
		
		//Verify the page using WebElement
				WebElement wb = driver.findElement(By.id("FR1"));
				if(wb.isDisplayed())
				{
					System.out.println(" Page is verified successfully");
					driver.switchTo().frame("FR1");
					//Click on facebook by switching controller to child page
					Actions act = new Actions(driver);
					act.keyDown(Keys.PAGE_DOWN).build().perform();
					act.keyDown(Keys.PAGE_DOWN).build().perform();
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
				
				driver.switchTo().window(parent);
				driver.switchTo().frame("FR1");
				act.keyDown(Keys.PAGE_UP).build().perform();
				act.keyDown(Keys.PAGE_UP).build().perform();
				act.keyDown(Keys.PAGE_UP).build().perform();
				act.keyDown(Keys.PAGE_UP).build().perform();
				driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
				driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
				driver.switchTo().parentFrame();
				driver.findElement(By.linkText("Google")).click();
				driver.close();
				}
	}

}
