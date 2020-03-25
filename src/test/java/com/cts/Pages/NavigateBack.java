package com.cts.Pages;

import org.openqa.selenium.WebDriver;

public class NavigateBack 
{
	private WebDriver driver;
	
	public NavigateBack(WebDriver driver)
	{
		this.driver = driver;
	}
	public void back() 
	{
		driver.navigate().back();
	}

}
