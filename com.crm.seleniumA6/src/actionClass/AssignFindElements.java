package actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFindElements 
{
    public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		WebElement header = driver.findElement(By.id("desktop-header-cnt"));
		List<WebElement> opt = driver.findElements(By.xpath("//a[@class='desktop-main']"));
		for(WebElement web : opt)
		{
			web.click();
			header = driver.findElement(By.id("desktop-header-cnt"));
			Thread.sleep(2000);
		}
		
		
		
	}

}
