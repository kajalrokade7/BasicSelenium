package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskDWS {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Kajal");
		driver.findElement(By.id("LastName")).sendKeys("Rokade");
		driver.findElement(By.id("Email")).sendKeys("kajal123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		Thread.sleep(3000);
		driver.close();
		driver.findElement(By.linkText("Shopping cart")).click();
		
		
		
	}

}
