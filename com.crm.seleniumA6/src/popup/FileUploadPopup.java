package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{
    public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(3000);
		WebElement sendPdf = driver.findElement(By.xpath("//input[@type='file']"));
		sendPdf.sendKeys("C:\\Users\\DELL\\Downloads\\SelectToiframe.pdf");
	    
	}

}
