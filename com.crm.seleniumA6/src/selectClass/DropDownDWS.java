package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDWS 
{
    public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		WebElement sort_by = driver.findElement(By.id("products-orderby"));
		Select s = new Select(sort_by);
		List<WebElement> options = s.getOptions();
		int i = 0;
		for(WebElement web : options)
		{
		s.selectByIndex(i++);
		sort_by = driver.findElement(By.id("products-orderby"));
		s = new Select(sort_by);
		Thread.sleep(1000);
		}
	}
}
