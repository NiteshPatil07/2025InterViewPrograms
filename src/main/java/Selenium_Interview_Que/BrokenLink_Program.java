package Selenium_Interview_Que;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink_Program {

	public static void main(String...args) throws MalformedURLException, IOException
	{
		
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.google.co.in/");
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   	   
	   List<WebElement> weblink=driver.findElements(By.tagName("a"));
	   
	   ArrayList<WebElement> active=new ArrayList<WebElement>();
	   
	   for(int i=0;i<=weblink.size()-1;i++)
	   {
		   if(weblink.get(i).getAttribute("href")!=null)
		   {
			   active.add(weblink.get(i));
		   }
	   }
	   
	   for(int j=0;j<=active.size()-1;j++)
	   {
 		   HttpURLConnection  connection = (HttpURLConnection)new URL(active.get(j).getAttribute("href")).openConnection();
 		   
 		   connection.connect();
 		   
 		  String responseMessage =connection.getResponseMessage();
 		  
 		  int Statuscode =connection.getResponseCode();
 		   
 		   connection.disconnect();
 		   
 		 System.out.println(active.get(j).getAttribute("href")+"   "+responseMessage+"   "+Statuscode);
	   }
	
	}
		
		
		
		
		

	
		
}
