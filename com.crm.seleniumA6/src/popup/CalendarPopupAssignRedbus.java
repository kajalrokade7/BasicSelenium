package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalendarPopupAssignRedbus 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.redbus.in/");
	      Thread.sleep(3000);
	      String given_title = "Bus Ticket Booking Online made Easy, Secure with Top Bus Operators - redBus";
	      String current_title = driver.getTitle();
	      if(given_title.equals(current_title))
	      {
	    	  System.out.println("Page is verified");
	      }
	      driver.findElement(By.id("src")).sendKeys("Pune");
	      driver.findElement(By.id("dest")).sendKeys("Solapur");
	      Thread.sleep(1000);
	      driver.findElement(By.id("onwardCal")).click();
	      driver.findElement(By.xpath("//div[@class=\"sc-kAzzGY cCrHkP\"]")).click();
	      //driver.findElement(By.xpath("//span[@class=\'DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw\']")).click();
	      driver.findElement(By.xpath("(//span[@class=\"DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH\"])[3]")).click();
	      driver.findElement(By.id("search_button")).click();
	      driver.close();
	}
	      
}
