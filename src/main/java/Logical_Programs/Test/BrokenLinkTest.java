package Logical_Programs.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkTest
{
      
	public static void main(String[]args) throws MalformedURLException, IOException
	{
		WebDriverManager.chromedriver().setup();
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
				
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int value=0;
		
		ArrayList<WebElement> active=new ArrayList<WebElement>();
		
		for(int i=0;i<=links.size()-1;i++)
		{
			if(links.get(i).getAttribute("href")!=null)
			{
				active.add(links.get(i));
			}
			else
			{
				value++;
			}
		}
				 
		System.out.println("Active  Links "+active.size());
		
		System.out.println("Inactive links value "+value);
		
		for(int j=0;j<=active.size()-1;j++)
		{
			HttpURLConnection connection= (HttpURLConnection)new URL(active.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			
		  String Message =connection.getResponseMessage();
		  
		  int code = connection.getResponseCode();
		  
		  connection.disconnect();
		  
		 System.out.println(active.get(j).getAttribute("href")+"     "+Message+"    "+code);
		  
		}
				
	}
	
	
}
