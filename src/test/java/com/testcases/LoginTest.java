package com.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.Baseclass;
import com.pages.Loginpage;
import com.utility.BrowserFactory;
import com.utility.ExcelDataProvider;
import com.utility.Helper;

public class LoginTest extends Baseclass{
	



@Test
public void loginapp() {
	ExcelDataProvider excel= new ExcelDataProvider();

	
	Loginpage loginpage=PageFactory.initElements(driver, Loginpage.class);
	loginpage.logintofb(excel.getStringData("Login", 0,0),excel.getStringData("Login", 0, 1));
	}

	

}

