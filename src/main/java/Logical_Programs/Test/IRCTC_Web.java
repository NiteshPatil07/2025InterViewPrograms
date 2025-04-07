package Logical_Programs.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC_Web 
{
        public static void main(String []args)
        {
        	 WebDriverManager.chromedriver().setup();
     	    
     	    
        	 ChromeOptions option=new ChromeOptions();
        	 
        	 option.addArguments("--disable-notifications");
        	 
        	 
			WebDriver driver=new ChromeDriver(option);
     	      
        	
        	driver.get("https://www.irctc.co.in");
        	
        	driver.manage().window().maximize();        	
        	
        	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	
        	
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));	
        	
            wait .until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label=\"Menu Train\"]"))).click();

        
        	
        	WebElement CancelTicket =driver.findElement(By.xpath("//span[text()='Cancel Ticket']"));
        	
        	CancelTicket.click();
        	
        }
}
