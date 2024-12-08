package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFeatures {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
