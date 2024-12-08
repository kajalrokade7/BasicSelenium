package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		String expected_result = "vishal";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() = 'Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert art = driver.switchTo().alert();
		art.sendKeys(expected_result);
		Thread.sleep(2000);
		art.accept();
		String actual_result = driver.findElement(By.id("demo1")).getText();
		if(actual_result.contains(expected_result))
		{
			System.out.println("Data is successfully passed");
		}
		else
		{
			
		}
		

	}

}
