package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarPopUpAssign {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("disable-notifications");
	      WebDriver driver = new ChromeDriver(options);
	      driver.manage().window().maximize();
	      driver.get("https://www.agoda.com/");
	      Thread.sleep(6000);
	      
	      String given_url = "https://www.agoda.com/";
	      String current_url  = driver.getCurrentUrl();
	      if(given_url.equals(current_url))
	      {
	    	  System.out.println("Agoda Page is verified");
	      }
	   
	      driver.findElement(By.id("check-in-box")).click();
	      Thread.sleep(2000)	  ;  
	      driver.findElement(By.xpath("//span[@data-selenium-date=\'2024-09-28\']")).click();
	     
	    
	     for(;;)
	      {
	    	  try 
	    	  {
	    	    driver.findElement(By.xpath("//span[@data-selenium-date=\'2025-01-28\']")).click();
	    	    break;
	    	  }
	    	  catch(Exception E)
	    	  {
	    		  driver.findElement(By.xpath("//button[@data-selenium=\"calendar-next-month-button\"]")).click();
	    	  }
	      }
	      
	      
	 
	}


	

}
