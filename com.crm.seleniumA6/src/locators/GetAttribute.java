package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) 
	{
		String data = "mobile";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search_field = driver.findElement(By.cssSelector("input[id=\'small-searchterms\']"));
		search_field.sendKeys(data);
		String attributeValue = search_field.getAttribute("value");
		if(data.equals(attributeValue))
		{
			System.out.println("my data is same");
			driver.findElement(By.cssSelector(""));
		}
		else
		{
			System.out.println("my data is not same");
		}
	  driver.close();
	}

}
