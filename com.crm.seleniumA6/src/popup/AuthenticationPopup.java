	package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        Thread.sleep(2000);
        
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_D);
        r.keyPress(KeyEvent.VK_M);
        r.keyPress(KeyEvent.VK_I);
        r.keyPress(KeyEvent.VK_N);
        
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        r.keyPress(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_D);
        r.keyPress(KeyEvent.VK_M);
        r.keyPress(KeyEvent.VK_I);
        r.keyPress(KeyEvent.VK_N);
        
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        r.keyPress(KeyEvent.VK_ENTER);
        
        
	}
}
