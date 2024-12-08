package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement login_Link = driver.findElement(By.linkText("Log in"));
		
		if(login_Link.isDisplayed())
		{
			login_Link.click();
			driver.findElement(By.id("Email")).sendKeys("kajalrokade1@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Kvs123@");
			
			WebElement rememberMe = driver.findElement(By.cssSelector("input[id=\'RememberMe\']"));
			rememberMe.click();
			if(rememberMe.isSelected())
			{
				System.out.println("Remember Me checkbox is selected...");
				
				WebElement login_button = driver.findElement(By.cssSelector("input[value=\'Log in\']"));
				if(login_button.isEnabled())
				{
				  System.out.println("Login Button is enabled");
				  login_button.click();
				  driver.close();
				}
				else
				{
					System.out.println("Login Button is not unabled");
					driver.close();
			    }
				
			}
			else
			{
				System.out.println("Remember Me checkbox is not selected");
				driver.close();
			}
		}
		else
		{
			System.out.println("Login Link is not present");
		}
	}

}
