package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName2 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		String given_url = "https://demowebshop.tricentis.com/";
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		String current_url = driver.getCurrentUrl();
		
		if(given_url.equals(current_url))
		{
			System.out.println("I am in a DWS webpage");
			Thread.sleep(2000);
			
			WebElement register = driver.findElement(By.className("cart-label"));
			register.click();
		}
		else
		{
			System.out.println("I am not a DWS webpage");
			driver.close();
		}
	}

}
