package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDWS {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a"));
		
		register.click();
		
		Thread.sleep(2000);
		
		WebElement wishlist = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a"));
		
		wishlist.click();
		
		Thread.sleep(3000);
		
		WebElement searchfield = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[1]"));
		
		searchfield.sendKeys("laptop");
		
		Thread.sleep(2000);
		
		WebElement searchbutton = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[2]"));
		
		searchbutton.click();

	}

}
