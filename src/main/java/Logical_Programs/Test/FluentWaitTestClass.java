package Logical_Programs.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitTestClass 
{
    public static void main(String[]args)
    {
    	
    	
    	WebDriverManager.chromedriver().setup();
    	
    	WebDriver driver=new ChromeDriver();
    	
    	
    	driver.get("https://www.google.co.in/");
    	
    	driver.manage().window().maximize();
    	
    	WebElement Moontag = driver.findElement(By.xpath("//img[@class=\"moonCta\"]"));
    	
    	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
    	
    	wait.withTimeout(Duration.ofSeconds(10));
    	wait.pollingEvery(Duration.ofSeconds(3));
    	wait.ignoring(NoSuchElementException.class);
    	
    	
    	ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOf(Moontag);
    	
    	WebElement element = wait.until(condition);
    	
    	
    	element.click();
    	
    	
    	System.out.print("Test is Pass");
    	
 

    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
