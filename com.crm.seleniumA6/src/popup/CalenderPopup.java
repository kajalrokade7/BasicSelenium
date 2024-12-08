package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException 
	{
      ChromeOptions options = new ChromeOptions();
      options.addArguments("disable-notifications");
      WebDriver driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.get("https://www.easemytrip.com/");
      Thread.sleep(2000);
      driver.findElement(By.id("ddate")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("23/06/2024")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("rtag")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("25/06/2024")).click();
      
      

	}

}
