package Logical_Programs.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownCompaire
{

	public static void main(String []args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	  List<WebElement>	Drop1 =driver.findElements(By.xpath("//a[@class=\"_1BJVlg\"]"));
	  
	  
	  List<WebElement>	Drop2 =driver.findElements(By.xpath("//a[@class=\"_1BJVlg\"]"));
	  
	  for(WebElement list: Drop1)
	  {
		  list.getText();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  
//	  
//	  String[] Drop11=new String[Drop1.size()];
//	  
//	  String [] Drop22=new String[Drop2.size()];
//	  
//	  
//	 for(int i=0;i<=Drop1.size()-1;i++)
//	 {
//		 Drop11[i]=Drop1.get(i).getText();
//	 }
//	 
//	 for(int i=0;i<=Drop2.size()-1;i++)
//	 {
//		 Drop22[i]=Drop2.get(i).getText();
//	 }
//	 
//	 
//	 
//	 for(String list :Drop11)
//	 {
//		 System.out.println(list);
//	 }
//	  
	}
	
	
	
	
	
	
	
	
}
