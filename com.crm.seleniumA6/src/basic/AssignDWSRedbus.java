package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssignDWSRedbus {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		String given_url = "https://demowebshop.tricentis.com/";
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String curret_url = driver.getCurrentUrl();
		
		
		if(given_url.equals(curret_url))
		{
	      System.out.println("I am in DWS page");
		}
       else
       {
	     System.out.println("I an not in a DWS page");
       }
		
		
		String given_title = "Book Bus Tickets Online, Easy & Secure Booking, Top Operators - redBus";
		
		driver.get("https://www.redbus.in/");
		
		String current_title = driver.getTitle();
		
		if(given_title.equals(current_title))
		{
			System.out.println("I am in a Redbus Homepage ");
		}
		else
		{
			System.out.println("I am not in a Redbus Homepage");
		}
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.close();

		
		
	}

}
