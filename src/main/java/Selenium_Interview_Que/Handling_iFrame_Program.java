package Selenium_Interview_Que;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_iFrame_Program {

	public static void main(String[]args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
		List<WebElement> optionlist = driver.findElements(By.xpath("(//button[@type=\"button\"])"));
		
		for(WebElement option:optionlist)
		{
			if(option.getText().equalsIgnoreCase("Alerts, Frames & Windows"))
			{
				option.click();
				break;
			}
		}
		
		WebElement iframeOption = driver.findElement(By.xpath("//a[@href=\"frames.php\"]"));
		iframeOption.click();
		
       Thread.sleep(5000);
		
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@src=\"new-tab-sample.php\"])[1]"));
		
		driver.switchTo().frame(frame1);
		
		
		 WebElement tutorialpage = driver.findElement(By.xpath("//a[@href=\"https://www.tutorialspoint.com\"]"));
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement condition = wait.until(ExpectedConditions.elementToBeClickable(tutorialpage));
		 
		 condition.click();
		 
		 
		 WebElement Textfield=driver.findElement(By.xpath("//input[@class=\"search-input\" and @id=\"mobile-search-strings\"]"));
		 
		 Textfield.sendKeys("Hi Nitesh How Are You");
		 
		 driver.switchTo().parentFrame();

		 WebElement frame2 = driver.findElement(By.xpath("(//iframe[@src=\"new-tab-sample.php\"])[2]"));
		 driver.switchTo().frame(frame2);
		 
		 Thread.sleep(5000);
		 
		 
           WebElement tutorialpage2 = driver.findElement(By.xpath("//a[@href=\"https://www.tutorialspoint.com\"]"));
	
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement condition2 = wait1.until(ExpectedConditions.elementToBeClickable(tutorialpage2));
		 condition2.click();
		 
		 
		 Thread.sleep(5000);
		    driver.switchTo().defaultContent();
		
		    
		    System.out.println(driver.getTitle());
		
		    driver.findElement(By.xpath("(//button [@class=\"accordion-button collapsed\"])[1]")).click();
		    		    
		    driver.close();
		
		
	}
	
	
}

