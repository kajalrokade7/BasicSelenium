package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssignAbhibus {

	public static void main(String[] args) 
	{
ChromeDriver driver = new ChromeDriver();
		
        String given_title = "Book Bus Tickets Online at Lowest Fare, Upto ₹350 Cashback On Bus Booking | AbhiBus";
		
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		
		String current_title = driver.getTitle();
		
		if(given_title.equals(current_title))
		{
			System.out.println("I am in Abhibus page");
		}
		else
		{
			System.out.println("I am not in a Abhibus page");
		}
		driver.close();

	}

}
