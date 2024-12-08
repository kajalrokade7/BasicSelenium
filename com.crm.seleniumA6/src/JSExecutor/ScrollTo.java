package JSExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//It has fixed values
public class ScrollTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-5000)");   //top
	}

}

