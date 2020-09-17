package com.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Helper {
public static void capturescreenshot(WebDriver driver) {
	
File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
try {
	FileHandler.copy(src, new File("./Screenshots/Login.png"));
	System.out.println("captured screenshot");
} catch (IOException e) {
	System.out.println("unable to take screenshot"+e.getMessage());
	}
}
}
