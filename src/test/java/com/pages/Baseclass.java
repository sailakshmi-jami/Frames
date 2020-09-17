package com.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.utility.BrowserFactory;
import com.utility.ConfigDataProvider;
import com.utility.ExcelDataProvider;
import com.utility.Helper;

public class Baseclass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;

	@BeforeSuite
	public void setUpsuite() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}

	@BeforeClass

	public void setup() {
		driver = BrowserFactory.startapp(driver, config.getbrowser(), config.geturl());

	}

	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}

	@AfterSuite
	public void teardownmethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			Helper.capturescreenshot(driver);

		}
	}

}
