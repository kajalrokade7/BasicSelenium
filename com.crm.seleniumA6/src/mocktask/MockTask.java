package mocktask;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockTask 
{
	public static ChromeDriver driver;
	public static void precondition(String browser)
	{
		if(browser.equals("chrome"))
		{
	   driver = new ChromeDriver();	
	   driver.manage().window().maximize();
	  
	   }
		else if(browser.equals("edge")) 
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
			
		else if(browser.equals("safari")) 
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("firefox")) 
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		 driver.get("https://demowebshop.tricentis.com/");
			
		}
	
	public static void login() throws InterruptedException
	{
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin01@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin01");
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	   public static void logout()
	  {
		driver.findElement(By.className("ico-logout")).click();
	  }
	  public static void postCondition()
	  {
		driver.close();
	  }
	
	

}
