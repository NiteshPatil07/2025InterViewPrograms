package Selenium_Interview_Que;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow_Poup_Program {

	public static void main(String[]args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement search_Bar = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
		
		search_Bar.sendKeys("mru");
		
		List <WebElement>Autosuggestionlist =driver.findElements(By.xpath("//li[@class=\"_3D0G9a\"]"));
		
		for(WebElement book:Autosuggestionlist)
		{
			if(book.getText().equalsIgnoreCase("mrutunjay kadambari marathi"))
			{
				book.click();
				break;
			}
		}
		
		String mainWindow = driver.getWindowHandle(); 
		
		WebElement mrutryunjayBook = driver.findElement(By.xpath("(//img[@class=\"DByuf4\" and @alt=\"Mrityunjaya, The Death Conqueror 1st Edition (Marathi, Paperback, Shivaji Sawant)\"])[1]"));
			
		mrutryunjayBook.click();
		
		Set<String> childwindows = driver.getWindowHandles();
		
		for(String windows:childwindows)
		{
			if(windows!=mainWindow)
			{
				driver.switchTo().window(windows);
			}
		}
		Thread.sleep(5000);
		
		driver.switchTo().window(mainWindow);
			
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
