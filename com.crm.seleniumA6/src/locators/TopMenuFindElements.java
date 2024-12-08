package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopMenuFindElements {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> topmenu = driver.findElements(By.xpath("//ul[@class=\"top-menu\"]/li/a"));
//		topmenu.get(0).click();
//		topmenu.get(1).click();
//		topmenu.get(3).click();
//		topmenu.get(4).click();
//		topmenu.get(5).click();
//		topmenu.get(6).click();
//		topmenu.get(7).click();
		

	}

}
