package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentVerify 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
        String given_title = "Movie Tickets, Plays, Sports, Events & Cinemas nearby - BookMyShow";
		
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/");
		
		String current_title = driver.getTitle();
		
		if(given_title.equals(current_title))
		{
			System.out.println("I am in BookMyShow page");
		}
		else
		{
			System.out.println("I am not in a BookMyShow page");
		}
		driver.close();
	}
	

}
