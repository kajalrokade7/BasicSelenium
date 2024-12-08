package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class EnterIntoDWS {

	public static void main(String[] args) 
	{
		//Step 1 - Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Step 2 - Maximize the window
		driver.manage().window().maximize();
		
		//Step 3 - Enter into dws webpage
		driver.get("https://demowebshop.tricentis.com/");
		
		//Step 4 - Close the browser
		driver.close();

	}

}
