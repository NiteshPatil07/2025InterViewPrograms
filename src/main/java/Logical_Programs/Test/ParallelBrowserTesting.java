package Logical_Programs.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowserTesting 
{

	public WebDriver driver;
	
	
	@Test
	@Parameters("browser")
	public void openBrowser (@Optional("edge")String browser) //@Optional("chrome")
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromiumdriver().setup();
			
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			
			driver =new EdgeDriver();
		}
		
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();			
			driver =new FirefoxDriver();
		}
		
		
		driver.get("https://www.flipkart.com/");	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
