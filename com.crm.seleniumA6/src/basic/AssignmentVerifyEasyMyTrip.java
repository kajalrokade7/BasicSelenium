package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentVerifyEasyMyTrip {

	public static void main(String[] args) 
	{
ChromeDriver driver = new ChromeDriver();
		
        String given_title = "Flight Booking, Cheap Flights, Air tickets at Lowest Airfare Online";
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/flights.html?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=EAIaIQobChMIpMvm1L-thgMVYRSDAx3w8ADmEAAYASAAEgK89_D_BwE");
		
		String current_title = driver.getTitle();
		
		if(given_title.equals(current_title))
		{
			System.out.println("I am in EaseMyShow page");
		}
		else
		{
			System.out.println("I am not in a EaseMyShow page");
		}
		driver.close();
	}

	

}
