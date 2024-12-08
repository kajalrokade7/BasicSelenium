package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DwsScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Selenium\\.dwsscreenshot.png");
		FileHandler.copy(from, to);
	}
}