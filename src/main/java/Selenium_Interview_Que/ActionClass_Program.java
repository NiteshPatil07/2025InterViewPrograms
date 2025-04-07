package Selenium_Interview_Que;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_Program {

	
	
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement value = driver.findElement(By.xpath("//li[@data-id=\"2\"and @id=\"fourth\"][1]"));
		
		WebElement placeholder =driver.findElement(By.xpath("//ol[@class=\"field13 ui-droppable ui-sortable\"and @id=\"amt7\"]"));
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOf(Image));
    
		WebElement value2 =driver.findElement(By.xpath("//li[@data-id=\"2\"and @id=\"fourth\"][2]"));
		
		WebElement placeholder2 = driver.findElement(By.xpath("//ol[@class=\"field13 ui-droppable ui-sortable\" and @id=\"amt8\"]"));
		
		
		WebElement Image =driver.findElement(By.xpath("//img[@alt=\"Random Image\"]"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(value).moveToElement(placeholder).release().build().perform();
		
		
	    act.dragAndDrop(value2, placeholder2).perform();
	    
	    
	    act.scrollToElement(Image).perform();
	    act.contextClick().perform();
	    act.click().perform();
	  
	   
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
