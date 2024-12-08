package screenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Whether the element is visible or not(based on this we have to give the waiting condition....
//Whether the element is clickable or not
public class ExplicitWaitingComments {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		WebElement login = driver.findElement(By.id("loginBtn"));
		login.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		driver.findElement(By.id("First Name")).sendKeys("kajal");
		driver.findElement(By.id("Last Name")).sendKeys("Satpute");
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("1234567890");
		driver.findElement(By.id("Email Address")).sendKeys("kajal@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Kvs@1234");
		driver.findElement(By.id("Confirm Password")).sendKeys("Kvs@1234");
		driver.findElement(By.id("Terms and Conditions")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnDisabled")));
		driver.findElement(By.id("btnDisabled")).click();
		
		
		

	}

}
