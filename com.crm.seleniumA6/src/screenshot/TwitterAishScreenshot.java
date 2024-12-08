package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TwitterAishScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://x.com/AishwaryaSpice?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
		Thread.sleep(5000);
	    WebElement aish = driver.findElement(By.cssSelector("div[data-testid=\"UserAvatar-Container-AishwaryaSpice\"]"));
	    File from = aish.getScreenshotAs(OutputType.FILE);
	    File to = new File("C:\\Selenium\\Aish.png");
	    FileHandler.copy(from, to);
	    
	    
	    

	}

}
