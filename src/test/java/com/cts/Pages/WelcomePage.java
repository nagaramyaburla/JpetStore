package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage 
{
	private WebDriver driver;
	private By signOutLoc = By.linkText("Sign Out");
			
	public WelcomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public String gettingTextOfSignOut()
	{
		String actualText = driver.findElement(signOutLoc).getText();
		return actualText;
	}
	public void clickOnSignOut()
	{
		driver.findElement(signOutLoc).click();
	}
}
