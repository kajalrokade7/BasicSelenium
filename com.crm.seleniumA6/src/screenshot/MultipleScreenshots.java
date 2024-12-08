package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultipleScreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		LocalDateTime date = LocalDateTime.now();
		String current_date = date.toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Selenium\\.dwshomelogo"+current_date+".png");
		FileHandler.copy(from, to);
	}

}
