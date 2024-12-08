package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignDWSActionsClass 
{
    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		Thread.sleep(1000);
        driver.findElement(By.className("ico-register")).click();
        WebElement gender = driver.findElement(By.id("gender-female"));
        gender.click();
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB).sendKeys("kajal").build().perform();
		act.keyDown(Keys.TAB).sendKeys("satpute").build().perform();
		act.keyDown(Keys.TAB).sendKeys("kajalrokade@gmail.com").build().perform();
		act.keyDown(Keys.TAB).sendKeys("kvs@123").build().perform();
		act.keyDown(Keys.TAB).sendKeys("kvs@123").build().perform();
		
	}

    
}
