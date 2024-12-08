package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TastAlertDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[onclick=\'alertbox()\']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[onclick='confirmbox()']")).click();
		driver.switchTo().alert().dismiss();
		
	}

}
