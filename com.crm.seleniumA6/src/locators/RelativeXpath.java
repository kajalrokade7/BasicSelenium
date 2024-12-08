package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath 
{
      public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		String given_url = "https://demowebshop.tricentis.com/";
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("I am in a dws page");
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
			Thread.sleep(3000);
			WebElement laptop14inch = driver.findElement(By.xpath("//a[@class=\"product-name\"]"));
			if(laptop14inch.isDisplayed())
			{
				System.out.println("Verification of laptop14inch is successfull");
				//driver.close();
			}
			else
			{
				System.out.println("Verification of laptop14inch is not successfull");
				driver.close();
			}
			
		}
		else
		{
			driver.close();
		}
	}

}
