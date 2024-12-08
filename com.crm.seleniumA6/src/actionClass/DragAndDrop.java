package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
    public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.id("box106"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
		WebElement source1 = driver.findElement(By.id("box7"));
		WebElement target1 = driver.findElement(By.id("box107"));
		act.dragAndDrop(source1, target1).build().perform();
		
		WebElement source2 = driver.findElement(By.id("box1"));
		WebElement target2 = driver.findElement(By.id("box101"));
		act.dragAndDrop(source2, target2).build().perform();
		
		WebElement source3 = driver.findElement(By.id("box4"));
		WebElement target3 = driver.findElement(By.id("box104"));
		act.dragAndDrop(source3, target3).build().perform();
		
		WebElement source4 = driver.findElement(By.id("box5"));
		WebElement target4 = driver.findElement(By.id("box105"));
		act.dragAndDrop(source4, target4).build().perform();
		
		WebElement source5 = driver.findElement(By.id("box2"));
		WebElement target5 = driver.findElement(By.id("box102"));
		act.dragAndDrop(source5, target5).build().perform();
		
		WebElement source6 = driver.findElement(By.id("box3"));
		WebElement target6 = driver.findElement(By.id("box103"));
		act.dragAndDrop(source6, target6).build().perform();
		
	//	driver.quit();
		
		//Drag and drop is a action class method present in selenium. action class is used to perform the 
		// mouse and keyboard actions using methods present in it. 
		//Action class is used to stimulates the mouse and keyboard actions.
		//It is not used to perform the real time actions. so that at the end of the action we call the methods perfom();
		//
		
	}

}
