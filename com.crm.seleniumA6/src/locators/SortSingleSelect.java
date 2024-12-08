package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortSingleSelect 
{
    public static void main(String[] args) throws InterruptedException 
	{
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement Sub=driver.findElement(By.cssSelector("input[id='newsletter-subscribe-button']"));
		if(Sub.isDisplayed()) 
		{
			System.out.println("Varification is successfull");	
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			
			String given_url="https://demowebshop.tricentis.com/digital-downloads";
			
			String current_url=driver.getCurrentUrl();
			if(given_url.equals(current_url)) 
			{
				System.out.println("Verification of  the page is successfull....");
				
				WebElement single_Select=driver.findElement(By.id("products-orderby"));
				Select ref=new Select(single_Select);
				List<WebElement> options = ref.getOptions();
				int i=0;
				for(WebElement web:options)
				{
					ref.selectByIndex(i++);
					Thread.sleep(1000);
				}
			}
			else
			{
				System.out.println("Verification of the page is not successfull");
			}
				
			
		}
		else 
		{
			System.out.println("verification of the page is not succesfull");
		}
   }
}


