package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsXpath {

	public static void main(String[] args) throws InterruptedException
	{
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		WebElement header_links = driver.findElement(By.cssSelector("class=\"header-links-wrapper\""));
		
		if(header_links.isDisplayed())
		{
			List<WebElement> reg = driver.findElements(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul"));
			
			for(int i=0; i<reg.size(); i++)
			{
				reg.get(i).click();
				driver.navigate().back();
				Thread.sleep(2000);
			}
			
		}
		
	}

}
