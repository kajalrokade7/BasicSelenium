package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AgodaApp 
{
	    public static void main(String[] args) throws InterruptedException 
	    {
		Date date = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-mm-dd");
		String current_date = sim.format(date);
		
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 99);
		String after_date = sim.format(cal.getTime());
		
		
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.cssSelector("button[aria-label=\"Close Message\"]")).click(); 
		
		driver.findElement(By.xpath("(//div[@class=\"IconBox__child\"])[2]")).click();
		
		for(;;)
		{
			try {
				driver.findElement(By.cssSelector("span[data-selenium-date=\"2024-07-02\'"+current_date+"']")).click();
				break;
			}
			catch(Exception E)
			{
				driver.findElement(By.cssSelector("button[aria-label=\"Previous Month\"]")).click();
			}
		}
		
		
		
		
		

	}

}
