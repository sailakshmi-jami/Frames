package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	public static WebDriver startapp(WebDriver driver, String browsername, String url ) {
		
		if (browsername.equals("chrome"))
		{
	     System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
         driver = new ChromeDriver();
		}
	else
   {
	   System.out.println("this browser does not support");
   }
   
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 return driver;
	}
	
	public static void quitBrowser(WebDriver driver) 
	{
		driver.quit();
	}

}


	

