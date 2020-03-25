package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContinueAndConfirmPage 
{
	private WebDriver driver;
	private By continueLoc = By.name("newOrder");
	private By confirmLoc = By.linkText("Confirm");
	
	public ContinueAndConfirmPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnContinue()
	{
		driver.findElement(continueLoc).click();
	}
	public void clickOnConfirm()
	{
		driver.findElement(confirmLoc).click();
	}
}
