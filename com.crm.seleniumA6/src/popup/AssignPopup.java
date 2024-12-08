package popup;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignPopup 
{
    public static void main(String[] args) throws InterruptedException 
	{
    	String given_title = "Demo Web Shop";
    	String given_urlfb = "https://www.facebook.com/nopCommerce";
    	String given_urlTw = "https://x.com/nopCommerce";
    	String given_urlrss = "https://demowebshop.tricentis.com/news/rss/1";
    	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String current_title = driver.getTitle();
		if(given_title.equals(current_title))
		{
			System.out.println("page is verified");
		
		    Actions act = new Actions(driver);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		 for(WebElement web : list)
		 {
			 String current_url = driver.getCurrentUrl();
			 if(given_urlrss.equals(current_url))
			 {
				 driver.navigate().back();
			 }
			 web.click();
			 Thread.sleep(1000);
			 
		 }
		Set<String> child = driver.getWindowHandles();
		 
			for(String str : child)
			{
				driver.switchTo().window(str);
				String current_url = driver.getCurrentUrl();
				System.out.println(child);
				if(given_urlfb.equals(current_url))
				{
					driver.findElement(By.xpath("//input[@id=':r12:']")).sendKeys("kajalrokade@gmail.com");
				}
				if(given_urlTw.equals(current_url))
				{
					System.out.println("twitter");
				}
			}
		}
			
		
		

	}

}
