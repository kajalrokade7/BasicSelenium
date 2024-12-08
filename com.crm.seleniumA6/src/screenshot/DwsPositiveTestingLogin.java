package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DwsPositiveTestingLogin {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		String given_title = "Demo Web Shop";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String current_title = driver.getTitle();
		if(given_title.equals(current_title))
		{
			System.out.println("Dws page is verified");
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("admin01");
			driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
			WebElement logout =  driver.findElement(By.cssSelector("a[class=\"ico-logout\"]"));
			if(logout.isDisplayed())
			{
				System.out.println("No bug found in login");
			}
			else
			{
				TakesScreenshot ts = (TakesScreenshot)driver;
				File from = ts.getScreenshotAs(OutputType.FILE);
				File to = new File("C:\\Selenium\\.dwsscreenshot.png");
			    FileHandler.copy(from, to);
			    System.out.println("Bug found in the login");
			}
		}
	}

}
