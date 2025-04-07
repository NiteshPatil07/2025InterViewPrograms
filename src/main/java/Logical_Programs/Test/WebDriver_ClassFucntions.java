package Logical_Programs.Test;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class WebDriver_ClassFucntions {

	public static void main(String[]args) throws IOException, InterruptedException 
	{
	    WebDriverManager.chromedriver().setup();
	    
	    
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.flipkart.com/");
	    
	     String  pagetitle = driver.getTitle();
	     
	     
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().window().minimize();
	     
	     
	     WebElement  SearchBar = driver.findElement(By.xpath("//input[@name=\"q\" and @title=\"Search for Products, Brands and More\"]"));
	     
	     
	     SearchBar.sendKeys("Marathi Books");
	     
	     
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	     
	     System.out.println(driver.getTitle());
	     
	     
	     
	     
	      List<WebElement> Searchlist = driver.findElements(By.xpath("//li[@class=\"_3D0G9a\"]"));
	      
	      for(WebElement obj:Searchlist)
	      {
	    	 
	    	  if(obj.getText().equals("marathi books kadambari"));
	    	  {
	    		  obj.click();
	    		  break;
	    	  }
	      }
	      
	      
	      System.out.println("=============================================================");
	      
	      System.out.println(driver.getTitle());
	     
	      
	      WebElement yayatibook=driver.findElement(By.xpath("//img[@alt=\"Yayati\"]"));
	      
	      yayatibook.click();
	      
	      Thread.sleep(3000);
	      
	     String FirstWindow = driver.getWindowHandle();
	     
	     System.out.println(FirstWindow);
	      
	     Set<String> Windows = driver.getWindowHandles();
	     

	     
	     for(String itr1:Windows)
	     {
	    	 System.out.println(itr1);
				
				  if(itr1!=(FirstWindow))
				  { 
					  driver.switchTo().window(itr1); 
					  
				  }
				 
	     }
	      
			/*
			 * System.out.println(
			 * "=============================================================");
			 * 
			 * System.out.println(driver.getTitle());
//			 
	     

			
			 * File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 * 
			 * File dest=new
			 * File("C:\\Users\\ADMIN\\Desktop\\ScreenShots\\"+RandomString.make()+".jpg");
			 * 
			 * FileHandler.copy(source, dest);
			 
	}*/
	
	}
	
	
}
