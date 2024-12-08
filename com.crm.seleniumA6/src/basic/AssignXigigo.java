package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssignXigigo {

	public static void main(String[] args) 
	{
        ChromeDriver driver = new ChromeDriver();
		
        String given_title = "ixigo - Best Travel Website, Book Flights, Trains, Hotels & Buses";
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ixigo.com/");
		
		String current_title = driver.getTitle();
		
		if(given_title.equals(current_title))
		{
			System.out.println("I am in ixigo page");
		}
		else
		{
			System.out.println("I am not in a ixigo page");
		}
		driver.close();

	}

}
