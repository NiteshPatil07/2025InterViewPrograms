package Logical_Programs.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_1 
{

	
	public static void main (String []args) throws IOException
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File dest=new File("C:\\Users\\ADMIN\\Desktop\\ScreenShots\\Facebook.jpg");
		
		FileHandler.copy(source, dest);
		
		
		WebElement CreaAcc= driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]"));
		
		CreaAcc.click();
		
		WebElement Month = driver.findElement(By.xpath("//Select[@name=\"birthday_month\"]"));
		
		Select sel=new Select(Month);
		
		List<WebElement> ListMonth = sel.getOptions();
		
		ArrayList<String> list=new ArrayList<String>();
		
		
		for(WebElement l:ListMonth)
		{
			String name = l.getText();
			
			list.add(name);
			
		}
		
		Collections.sort(list);
		
		
		for(String l:list)
		{
			System.out.println(l);
		}
	    

		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
