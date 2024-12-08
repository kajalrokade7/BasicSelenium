package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUpRedbus {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("disable-notifications");
	      WebDriver driver = new ChromeDriver(options);
	      driver.manage().window().maximize();
	      driver.get("https://www.redbus.in/");
	      Thread.sleep(2000);
	      driver.findElement(By.id("onwardCal")).click();
	      driver.findElement(By.xpath("//span[text()='25']")).click();
	      driver.findElement(By.id("src")).sendKeys("Solapur");
	      driver.findElement(By.className("placeHolderMainText")).click();
	      
	}

}
