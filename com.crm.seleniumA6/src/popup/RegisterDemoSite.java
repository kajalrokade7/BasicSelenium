package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemoSite 
{
    public static void main(String[] args) 
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("kajal");
	  driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("Rokade");
	  driver.findElement(By.cssSelector("textarea[rows=\"3\"]")).sendKeys("At.Patkul, Tal- mohol, dist.-solapur");
	  driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("kajal@gmail.com");
	  driver.findElement(By.cssSelector("input[type=\"tel\"]")).sendKeys("9876543210");
	  driver.findElement(By.cssSelector("input[value=\"FeMale\"]")).click();
	  driver.findElement(By.id("checkbox1")).click();
	  driver.findElement(By.id("checkbox2")).click();
	  
	  WebElement img = driver.findElement(By.id("imagesrc"));
	  img.sendKeys("C:\\Users\\DELL\\Pictures\\Audi.jpg");
	  
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  
	// WebElement languages =  driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
	// Select langRef = new Select(languages);
	// langRef.selectByVisibleText("English");
	 
	 
	 WebElement skills = driver.findElement(By.id("Skills"));
	  Select ref = new Select(skills);
	  ref.selectByIndex(1);
	  ref.selectByIndex(3);
	  
	  WebElement country = driver.findElement(By.id("countries"));
	  Select countryref = new Select(country);
	  countryref.selectByVisibleText("Select Country");
	  
	//  WebElement selectcountry = driver.findElement(By.id("select2-country-container"));
	// Select selectcountryref = new Select(selectcountry);
	// selectcountryref.selectByVisibleText("India");
	  
	  WebElement year = driver.findElement(By.id("yearbox"));
	  Select yearref = new Select(year);
	  yearref.selectByIndex(84);
	  
	  WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
	  Select monthref = new Select(month);
	  monthref.selectByVisibleText("December");
	   
	  WebElement day = driver.findElement(By.id("daybox"));
	  Select dayref = new Select(day);
	  dayref.selectByIndex(27);
	    
	  
	  driver.findElement(By.id("firstpassword")).sendKeys("kvs@123");
	  driver.findElement(By.id("secondpassword")).sendKeys("kvs@123");
	  
	  driver.findElement(By.id("submitbtn")).click();
	}

}
