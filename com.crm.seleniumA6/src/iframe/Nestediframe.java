package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[15px]'])[6]")).click();
		
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		

	
		
		driver.findElement(By.linkText("Nested iframe")).click();
		
	
		
		WebElement nestediframe = driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
		driver.switchTo().frame(nestediframe);
		
        WebElement nestediframe1 = driver.findElement(By.tagName("iframe"));
	    driver.switchTo().frame(nestediframe1);
		
	    
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		
	
	}

}
