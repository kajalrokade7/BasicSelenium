package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSPDemoAuthenticationP {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[contains(text(),'Web Elements')]")).click();
		Thread.sleep(3000);
		//driver.findElement()
		driver.findElement(By.linkText("Authentication")).click();
		driver.findElement(By.id("AuthLink")).click();
		

	}

}
