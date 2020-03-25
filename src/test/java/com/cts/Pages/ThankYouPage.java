package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage 
{
	private WebDriver driver;
	private By thankYouMsgLoc = By.xpath("//li[text()='Thank you, your order has been submitted.']");
	
	public ThankYouPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public String gettingThankYouMsg()
	{
		String actualMsg = driver.findElement(thankYouMsgLoc).getText();
		return actualMsg;
	}
}
