package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DWSLoginUnsuccessfull {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		String given_url = "https://demwebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("admin1@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
        
        String current_url = driver.getCurrentUrl();
        TakesScreenshot ts = (TakesScreenshot) driver;
        if(given_url.equals(current_url))
        {
        	System.out.println("Login is successful...");
        }
        else
        {
        	System.out.println("Login is unsuccessful");
        	File from = ts.getScreenshotAs(OutputType.FILE);
        	File to = new File("C:\\Selenium\\.dwsLoginscreenshot.png");
        	FileHandler.copy(from, to);
        }
        
	}

}
