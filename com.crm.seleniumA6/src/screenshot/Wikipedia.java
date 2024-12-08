package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("AishwaryaRoy");
		driver.findElement(By.cssSelector("a[class=\"cdx-menu-item__content\"]")).click();
		WebElement aish = driver.findElement(By.xpath("(//img[@class=\"mw-file-element\"])[3]"));
		File from = aish.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Selenium\\.Aishscreenshot.png");
		FileHandler.copy(from, to);

	}

}
