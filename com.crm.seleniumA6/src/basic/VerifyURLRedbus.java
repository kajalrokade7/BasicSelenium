package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLRedbus {

	public static void main(String[] args) 
	{
		String given_url = "https://www.redbus.in/";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		String current_url = driver.getCurrentUrl();
		
		if(given_url.equals(current_url))
		{
			System.out.println("I am in Redbus page");
		}
		else
		{
			System.out.println("I am not in a Redbus page");
		}
		
	}

}
