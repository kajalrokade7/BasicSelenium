package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUsingTitle {

	public static void main(String[] args) 
	{
		String given_title = "Demo Web Shop";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String current_title = driver.getTitle();
		
		if(given_title.equals(current_title))
		{
			System.out.println("I am in a DWS Homepage ");
		}
		else
		{
			System.out.println("I am not in a DWS Homepage");
		}
		driver.close();

	}

}
