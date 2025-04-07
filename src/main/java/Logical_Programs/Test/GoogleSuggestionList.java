package Logical_Programs.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggestionList
{
    public static void main(String[]args) throws InterruptedException
    {
    	
    	
    	WebDriverManager.chromedriver().setup();
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.google.co.in/");
    	
    	WebElement serchbar = driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]"));
    	serchbar.sendKeys("test");
    	
    	Thread.sleep(2000);
    	
    	 List<WebElement> Autosuggestion = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/child::li"));
    	 
    	 for(WebElement list:Autosuggestion)
    	 {
    		 System.out.println(list.getText());
    	 }
    	 
    	 
    	 JavascriptExecutor js =(JavascriptExecutor)driver;
    	 
    	 js.executeScript("window.ScrollBy(0,500)");
    	 
    	 
    	 
    	
    }
	
	
}
