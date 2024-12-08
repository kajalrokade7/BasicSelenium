package popup;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarUsingDateJavaClass {

	public static void main(String[] args) throws InterruptedException 
	{
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		String current_date = sim.format(date);
		
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 77);
		String after_date = sim.format(cal.getTime());
		
		
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("disable-notifications");
	      WebDriver driver = new ChromeDriver(options);
	      driver.manage().window().maximize();
	      driver.get("https://www.easemytrip.com/");
	      Thread.sleep(2000);
	      
	      driver.findElement(By.id("ddate")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id(current_date)).click();
	      Thread.sleep(2000);
	      
	      driver.findElement(By.id("rtag")).click();
	      Thread.sleep(2000);
	      for(;;)
	      {
	    	  try 
	    	  {
	    	    driver.findElement(By.id(after_date)).click();
	    	    break;
	    	  }
	    	  catch(Exception E)
	    	  {
	    		  driver.findElement(By.id("img2Nex")).click();
	    	  }
	      }


	}

}
