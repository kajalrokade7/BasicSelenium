package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement text_field = driver.findElement(By.name("q"));
		text_field.sendKeys("laptop");
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
