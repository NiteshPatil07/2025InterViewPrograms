package Selenium_Interview_Que;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExeceutor_ScrollToElement {

	public static void main(String[]args)
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement BookNow_Button =driver.findElement(By.xpath("//button[text()=\"Book now\"]"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",BookNow_Button);
				
		js.executeScript("arguments[0].click();",BookNow_Button);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
