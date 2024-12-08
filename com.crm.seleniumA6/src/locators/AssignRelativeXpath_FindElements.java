package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignRelativeXpath_FindElements
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	    List<WebElement> header_link = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
	    for(WebElement web : header_link)
		{
			web.click();
			//Thread.sleep(2000);
	    }
	}

}
