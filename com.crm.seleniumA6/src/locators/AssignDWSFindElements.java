package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignDWSFindElements {

	public static void main(String[] args) throws InterruptedException
	{
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-register")).click();            //Click on register
		
		WebElement register = driver.findElement(By.linkText("Register"));     //Verify the page using unique element
		
		if(register.isDisplayed())
		{
			List<WebElement> ypd = driver.findElements(By.cssSelector("input[class=\'text-box single-line\']"));
			
			ypd.get(0).sendKeys("kajal");
			
			Thread.sleep(1000);
			
			ypd.get(1).sendKeys("Rokade");
			
			Thread.sleep(1000);
			
			ypd.get(2).sendKeys("kajal@gmail.com");
			
			Thread.sleep(3000);
			
			List<WebElement> yourpass = driver.findElements(By.cssSelector("input[class=\"text-box single-line password\"]"));
			
			yourpass.get(0).sendKeys("Kajal@123");
			
			Thread.sleep(1000);
			
			yourpass.get(1).sendKeys("Kajal@123");
			
		}
		
		driver.close();
		
		

	}

}
