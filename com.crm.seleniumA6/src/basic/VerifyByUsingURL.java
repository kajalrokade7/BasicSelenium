package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUsingURL 
{

	public static void main(String[] args) 
	{
		String given_url = "https://demowebshop.tricentis.com/";
		
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter into demo webshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//Get current URL
		String curret_url = driver.getCurrentUrl();
		
		//Verification
		if(given_url.equals(curret_url))
				{
			      System.out.println("I am in DWS page");
				}
		else
		{
			System.out.println("I an not in a DWS page");
		}
		 
		// close the browser
		driver.close();
	}

}
