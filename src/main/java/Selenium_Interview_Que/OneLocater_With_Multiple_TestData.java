package Selenium_Interview_Que;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneLocater_With_Multiple_TestData {

	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.bugbug.io/sign-in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		List<WebElement> InputFields= driver.findElements(By.xpath("//input[@data-testid=\"Input\"]"));
		
		String [] text= {"Nitesh Patil 1848","Pslv@123"};
		
		for(int i=0;i<=InputFields.size()-1;i++)
		{
			InputFields.get(i).sendKeys(text[i]);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
