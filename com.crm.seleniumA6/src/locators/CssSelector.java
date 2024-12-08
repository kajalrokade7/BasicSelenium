package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		
		String given_url = "https://www.facebook.com/";
		
		driver.navigate().to("https://www.facebook.com/");
        
		String current_url = driver.getCurrentUrl();
		
		if(given_url.equals(current_url))
		{
			driver.findElement(By.cssSelector("a[role=\'button\']")).click() ;
			
		}
	}

}
