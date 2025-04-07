package Logical_Programs.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorPrograms
{
            public static void main(String[]args)
            {
            	WebDriverManager.chromedriver().setup();
            	
            	WebDriver driver=new ChromeDriver();
            	
            	
            	driver.get("https://www.redbus.in/");
            	
            	driver.manage().window().maximize();
            	
            	
            	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
            	
            	
            	JavascriptExecutor js =(JavascriptExecutor)driver;
            	
            	
            	// Passing text data by javascriptexecutor
            
             	WebElement from = driver.findElement(By.xpath("//input[@id=\"src\"]"));
            	
            	js.executeScript("arguments[0].value='Hyderabad';",from);
            	
            	
            	//Scroll Down page last bottom
            	
            	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            	
           
            	//js.executeScript("history.go();");
          	
            	
            	
            	//Scroll to webelement
            	
            	WebElement flag =driver.findElement(By.xpath("//div[text()='India']"));
            	
            	js.executeScript("arguments[0].scrollIntoView(true);",flag);
            	
            	
//            	
//            	try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                driver.quit();
//            	   
            	
            	
            }
 }
