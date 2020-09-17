package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithOutFramework {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sailakshmi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sai123");
		driver.findElement(By.id("u_0_b")).click();
        driver.quit();
		
		
		
	}
	

}
