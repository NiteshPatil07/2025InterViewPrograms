package Logical_Programs.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneLocaterWithMutipleTextData 
{

	
	public static void main (String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
				
		driver.manage().window().maximize();
						
		Thread.sleep(3000);
		List <WebElement>textfields =driver.findElements(By.xpath("//input[contains(@class,\"inputtext _55r1 _6luy\")]"));
				
		String [] text = {"niteshpatil1818","143Shiva"};
				
		for(int i=0;i<textfields.size();i++)
		{
		
			textfields.get(i).sendKeys(text[i]);
		}
				
		WebElement  email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		
		email.sendKeys("niteshpatil 1920");
				
		email.clear();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
