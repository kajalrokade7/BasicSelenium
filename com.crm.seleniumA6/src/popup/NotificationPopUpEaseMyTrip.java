package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotificationPopUpEaseMyTrip 
{
 public static void main(String[]args) throws AWTException, InterruptedException
 {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.easemytrip.com/");
	 Thread.sleep(3000);
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_TAB);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	 
 }
  
}
