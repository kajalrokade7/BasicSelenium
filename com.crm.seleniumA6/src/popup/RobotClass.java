package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_K);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_U);
		
        r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_K);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_U);
		
		}

}
