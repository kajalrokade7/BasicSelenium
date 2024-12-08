package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkedText {

	public static void main(String[] args) throws InterruptedException 
	{
		   ChromeDriver driver = new ChromeDriver();      //If text contains too much words then we go for Partial linked text
           driver.manage().window().maximize();
           driver.navigate().to("https://demowebshop.tricentis.com/");
           Thread.sleep(3000);
           driver.findElement(By.partialLinkText("$25")).click();
           Thread.sleep(2000);
           driver.close();
	}

}
