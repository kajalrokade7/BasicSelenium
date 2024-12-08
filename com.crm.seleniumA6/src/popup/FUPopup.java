package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FUPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.id("register_Layer")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("name")).sendKeys("Kajal Jagadish Rokade");
	  driver.findElement(By.id("email")).sendKeys("kajalrokade1@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("kvs7@123");
	  driver.findElement(By.id("mobile")).sendKeys("9834368808");
	  driver.findElement(By.xpath("//div[@class=\"focusable optionWrap  \"]")).click();
	  WebElement uploadresume = driver.findElement(By.xpath("//input[@class=\"uploadAction\"]"));
	  uploadresume.sendKeys("C:\\Users\\DELL\\Downloads\\Resume (Kajal Rokade) (4).pdf");
	  
	  
	}
}
