package com.cts.Pages;

import org.openqa.selenium.WebDriver;

public class NavigateFront 
{
	private WebDriver driver;
	
	public NavigateFront(WebDriver driver)
	{
		this.driver = driver;
	}
	public void front()
	{
		driver.navigate().forward();
	}

}
