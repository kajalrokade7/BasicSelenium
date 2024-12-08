package JSExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement book_train = driver.findElement(By.linkText(""));
		js.executeScript("arguments[0].scrollIntoView(false);",book_train);
	}

}
