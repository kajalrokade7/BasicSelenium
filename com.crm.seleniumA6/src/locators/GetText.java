package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//we can use any locator to use gettext()

public class GetText {

	public static void main(String[] args) throws InterruptedException
	{
		    ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			WebElement excellent = driver.findElement(By.xpath("//label[text()='Excellent']"));
			System.out.println(excellent.getText());
			Thread.sleep(2000);
			String register = driver.findElement(By.className("ico-register")).getText();
			System.out.println(register);
			driver.close();
	}

}
