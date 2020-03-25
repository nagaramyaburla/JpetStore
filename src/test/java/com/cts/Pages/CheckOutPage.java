package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage 
{
	private WebDriver driver;
	private By checkOutLoc = By.linkText("Proceed to Checkout");
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnProceedtoCheckout()
	{
		driver.findElement(checkOutLoc).click();
	}
}
