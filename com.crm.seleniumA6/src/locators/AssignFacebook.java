package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFacebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String given_url = "https://www.facebook.com/";
		
		driver.navigate().to("https://www.facebook.com/");
        
		String current_url = driver.getCurrentUrl();
		
		if(given_url.equals(current_url))
		{
			driver.findElement(By.linkText("Create new account")).click();
			
			driver.findElement(By.name("firstname")).sendKeys("Kajal");
			
			driver.findElement(By.name("lastname")).sendKeys("Rokade");
			
			driver.findElement(By.name("reg_email__")).sendKeys("7898789876");
			
			driver.findElement(By.name("reg_passwd__")).sendKeys("Abc@123");
		}
		else
		{
			System.out.println("I am not in a Facebook page");
		}
		driver.close();			
			
			
		
	}

}
