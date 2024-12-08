package seleniummock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	public static WebDriver driver;
	public static void preCondition(String browser,String url)
		
		{
			
			if (browser.equals("chrome")) {
				driver = new ChromeDriver();
			}
			else if (browser.equals("firefox")) {
				driver= new FirefoxDriver();
			}
			else if (browser.equals("edge")) {
				driver= new EdgeDriver();
			}
			else
			{
				System.out.println("Invalid Browser");
				System.out.println("Select any one from: chrome/ firefox/ edge");
			}
			
			maximizeBrower(url);
		}
			public static void maximizeBrower(String url)
			{
			driver.manage().window().maximize();
			
		
			
			driver.navigate().to(url);
			
		}
		
		public static void postCondition()
		{
			
			driver.close();
		}
		
		
		
		public static void login()
		{
			
			driver.findElement(By.xpath("//a[text()='Log in']")).click();  
			driver.findElement(By.id("Email")).sendKeys("vaibhav7447@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("VAish@0416");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
		}
		
		public static void logout()
		{
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
		}
		
	
}
