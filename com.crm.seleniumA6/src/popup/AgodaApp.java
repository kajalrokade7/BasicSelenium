package popup;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AgodaApp {

	public static void main(String[] args) throws InterruptedException 
	{
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		String current_date = sim.format(date);
		
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 77);
		String after_date = sim.format(cal.getTime());
		
		
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("disable-notifications");
	      WebDriver driver = new ChromeDriver(options);
	      driver.manage().window().maximize();
	      driver.get("https://www.agoda.com/");
	      Thread.sleep(6000);
	      
	     driver.findElement(By.cssSelector("button[aria-label=\"Close Message\"]")).click(); 
	     
	     //driver.findElement(By.id("textInput")).click();
	    // driver.findElement(By.xpath("(//div[@id=\"image-container\"])[2]")).click();
	   //  Thread.sleep(2000);
	     
	     driver.findElement(By.id("check-in-box")).click();
	     for(;;)
	     {
	     try
	     {
	      driver.findElement(By.xpath("//span[@data-selenium-date=\'"+current_date+"']")).click();
	      break;
	     }
	     catch(Exception E)
	     {
	         driver.findElement(By.xpath("//button[@aria-label=\"Previous Month\"]")).click();
	     }
	     }
	     
	      
	       for(;;)
	      {
	    	  try 
	    	  {
	    	    driver.findElement(By.xpath("//span[@data-selenium-date=\'"+after_date+"']")).click();
	    	    break;
	    	  }
	    	  catch(Exception E)
	    	  {
	    		  driver.findElement(By.xpath("//button[@data-selenium=\"calendar-next-month-button\"]")).click();
	    	  }
	      }
	      
	      
	 }

}

