package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//When we get NOSuchElementException 

public class CalendarNSEE {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("disable-notifications");
	      WebDriver driver = new ChromeDriver(options);
	      driver.manage().window().maximize();
	      driver.get("https://www.easemytrip.com/");
	      Thread.sleep(2000);
	      driver.findElement(By.id("rtag")).click();
	      Thread.sleep(2000);
	      for(;;)
	      {
	    	  try 
	    	  {
	    	    driver.findElement(By.id("fiv_1_25/11/2024")).click();
	    	    break;
	    	  }
	    	  catch(Exception E)
	    	  {
	    		  driver.findElement(By.id("img2Nex")).click();
	    	  }
	      }
	      
	   // task1  write a script for agoda application
	      //1.open the browser 2. maximize the browser 3.enter into agoda webpage 4.after entering verify the page
	      //by using url 5.select a date inside departure date i.e 28 sep 6.select a date inside return date i.e 28 jan 2026
	      //close the browser
	      //write a script for redbus website 
	      //open the browser 2.maxize the browser 3. enter into browser 4 verify using title
	      //5 fill all the details from and to 6 In date click 27the sep and search the bus
	      
	      
	      
	}

}
