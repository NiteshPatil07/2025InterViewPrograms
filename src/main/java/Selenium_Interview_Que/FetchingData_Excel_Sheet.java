package Selenium_Interview_Que;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingData_Excel_Sheet {

	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\ScreenShots\\Sheet_Nitesh.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String Name = sheet.getRow(0).getCell(0).getStringCellValue();
		
		String Pass =sheet.getRow(0).getCell(5).getStringCellValue();
		
		System.out.println(Name);
		
		System.out.println(Pass);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
