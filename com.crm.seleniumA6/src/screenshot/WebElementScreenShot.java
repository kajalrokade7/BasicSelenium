package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
        WebElement dwslogo = driver.findElement(By.className("header-logo"));
        File from = dwslogo.getScreenshotAs(OutputType.FILE);
        File to = new File("C:\\Selenium\\.dwshomelogo.png");
        FileHandler.copy(from, to);
	}

}
