package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignDWSCssSelector 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		
		driver.findElement(By.cssSelector("input[id=\'gender-female\']")).click();
		
		driver.findElement(By.cssSelector("input[id=\'FirstName\']")).sendKeys("Kajal");
		
		driver.findElement(By.cssSelector("input[id=\'LastName\']")).sendKeys("Rokade");
		
		driver.findElement(By.cssSelector("input[id=\'Email\']")).sendKeys("kajal1@gmail.com");
		
		driver.findElement(By.cssSelector("input[name=\'Password\']")).sendKeys("kvs@123");
		
		driver.findElement(By.cssSelector("input[name=\'ConfirmPassword\']")).sendKeys("kvs@123");
		
		driver.findElement(By.cssSelector("a[href=\'/login\']")).click();
		
		driver.findElement(By.cssSelector("input[autofocus=\'autofocus\']")).sendKeys("kajal1@gmail.com");
		
		driver.findElement(By.cssSelector("input[id=\'Password\']")).sendKeys("kvs@123");
		
		driver.findElement(By.cssSelector("input[name=\'RememberMe\']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
