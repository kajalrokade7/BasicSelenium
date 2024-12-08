package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String current_url = driver.getCurrentUrl();
		
		if(given_url.equals(current_url))
		{
			System.out.println("I am in a DWS webpage");
			Thread.sleep(2000);
			WebElement register = driver.findElement(By.className("ico-login"));
			register.click();
		}
		else
		{
			System.out.println("I am not in a DWS webpage");
			driver.close();
		}
	}

}
