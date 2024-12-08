package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath2 {

	public static void main(String[] args) throws InterruptedException 
	{
		String given_title = "Demo Web Shop. $25 Virtual Gift Card";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//img[@alt=\"Picture of $25 Virtual Gift Card\"]")).click();
		String current_title = driver.getTitle();
		if(given_title.equals(current_title))
		{
			driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Kajal");
			driver.findElement(By.xpath("//input[@class=\'recipient-email\']")).sendKeys("kajal@gmail.com");
			driver.findElement(By.xpath("//input[@class=\'sender-name\']")).sendKeys("Vishal");
			driver.findElement(By.xpath("//input[@class=\'sender-email\']")).sendKeys("vishal@gmail.com");
			driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys("");
			driver.findElement(By.xpath("//input[@id=\'add-to-cart-button-2\']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class=\'cart-label\']")).click();
			Thread.sleep(2000);
			
			String giventitle = "Demo Web Shop. Shopping Cart";
			String currenttitle = driver.getTitle();
			if(giventitle.equals(currenttitle))
			{
				System.out.println("Added in add to shopping cart");
				driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
				driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
				
			}
			else
			{
				System.out.println("Product is not added to shopping cart");
				driver.close();
			}
			
		}
		else
		{
			System.out.println("You are not in expected page");
			driver.close();
		}

	}

}
