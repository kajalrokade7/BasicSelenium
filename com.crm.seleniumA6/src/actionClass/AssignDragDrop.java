package actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignDragDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		List<WebElement> country = driver.findElements(By.xpath("//div[@class='dragableBoxRight']"));
		String[]str = {"box6","box7","box1","box4","box5","box2","box3"};
		Actions act = new Actions(driver);
		int i=0;
		for(WebElement web : country )
		{
			WebElement source = driver.findElement(By.id(str[i++]));
			act.dragAndDrop(source, web).build().perform();
			Thread.sleep(1000);
		}
		
		
	}
}
