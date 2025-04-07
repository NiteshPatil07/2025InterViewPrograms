package Selenium_Interview_Que;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicityWait_Program {

	public static void main(String[]args)
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		WebElement luckybutton = driver.findElement(By.xpath("(*//input[@value=\"I'm Feeling Lucky\"])[2]"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 WebElement condition = wait.until(ExpectedConditions.elementToBeClickable
				 (luckybutton));
		 
		 condition.click();

		  driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
