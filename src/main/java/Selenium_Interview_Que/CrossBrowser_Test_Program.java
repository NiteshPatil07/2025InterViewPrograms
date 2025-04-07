package Selenium_Interview_Que;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CrossBrowser_Test_Program {

	public WebDriver driver;
	@Test
	@Parameters("WebBrowser")
   public void openCrossBrowsers(@Optional("chrome")String browser)
   {
	   if(browser.equalsIgnoreCase("chrome"))
	   {
		   WebDriverManager.chromedriver().setup();
		   
		   driver=new ChromeDriver();
	   }
	   else if(browser.equalsIgnoreCase("edge"))
	   {
		   WebDriverManager.edgedriver().setup();
		   
		   driver=new EdgeDriver();
	   }
	   else if(browser.equalsIgnoreCase("firefox"))
	   {
		   WebDriverManager.firefoxdriver().setup();
		   
		   driver=new FirefoxDriver();
	   }
	   
	   driver.get("https://www.google.com/");
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
