package JSExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		WebElement custom_gender = driver.findElement(By.name("custom_gender"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='trans';", custom_gender);
	}

}
