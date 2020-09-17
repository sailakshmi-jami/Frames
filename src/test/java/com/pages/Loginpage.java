package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver Ldriver) {
		this.driver=Ldriver;
	}

	@FindBy(id="email")WebElement ename;
	@FindBy(id="pass")WebElement pwd;
	@FindBy(id="u_0_b")WebElement sub;

public void logintofb(String emailapp, String pswdapp) {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	ename.sendKeys(emailapp);
	pwd.sendKeys(pswdapp);
	sub.click();
}
}