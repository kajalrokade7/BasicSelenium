package mocktask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DwsLogin extends MockTask 
{

	public static void main(String[] args) throws InterruptedException 
	{
		MockTask.precondition("chrome");
		String givenurl = "https://demowebshop.tricentis.com/";
		
		String current_url = driver.getCurrentUrl();
		if (givenurl.equals(current_url)) 
		{
			System.out.println("I am in DWS page...");
			
			MockTask.login();
			Thread.sleep(1000);
			
			driver.findElement(By.linkText("Digital downloads")).click();
			Thread.sleep(1000);
			
			WebElement sorby = driver.findElement(By.id("products-orderby"));
			
			Select se =new Select(sorby);
			
			List<WebElement> sort = se.getOptions();
			for (int i=0; i<6; i++) 
			{
				se.selectByIndex(i);
				sorby = driver.findElement(By.id("products-orderby"));
				se=new Select(sorby);
				Thread.sleep(2000);
			}
			Thread.sleep(1000);
			
            WebElement view = driver.findElement(By.id("products-viewmode"));
			Select vi=new Select(view);
			List<WebElement> v = vi.getOptions();
			for (int i=0; i<2; i++) 
			{
				vi.selectByIndex(i);
				view = driver.findElement(By.id("products-viewmode"));
				vi=new Select(view);
				Thread.sleep(2000);
			}
			Thread.sleep(1000);
			
			 WebElement display = driver.findElement(By.id("products-pagesize"));
				
			Select dis=new Select(display);
				
			List<WebElement> d = dis.getOptions();
			for (int i = 0; i < 3; i++) 
			{
					dis.selectByIndex(i);
					display = driver.findElement(By.id("products-pagesize"));
					dis=new Select(display);
					Thread.sleep(1000);
			}
				Thread.sleep(1000);
			
			MockTask.logout();
			Thread.sleep(1000);
			MockTask.postCondition();
			}
		   else
		  {
			System.out.println("I am not in DWS page...");
		  }
	}

	}


