package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		WebElement jdk = driver.findElement(By.linkText("jdk-8u411-linux-x64.tar.gz"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false);",jdk);
		jdk.click();
		Thread.sleep(2000);
		WebElement disable_element = driver.findElement(By.linkText("Download jdk-8u411-linux-x64.tar.gz"));
		js.executeScript("arguments[0].click();",disable_element);
        
		String given_url= "https://signon.oracle.com/signin";
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("Action on disable button is performed");
		}
		else
		{
			System.out.println("Action on disable button is not performed");
		}
	}

}
