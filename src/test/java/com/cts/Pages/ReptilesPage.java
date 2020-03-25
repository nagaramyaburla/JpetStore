package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReptilesPage
{
	private WebDriver driver;
	private By rattleSnakeLoc = By.linkText("RP-SN-01");
	private By IguanaLoc = By.linkText("RP-LI-02");

	public ReptilesPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void ClickOnRattle() 
	{
		driver.findElement(rattleSnakeLoc).click();
	}

	public void ClickOnIguana() 
	{
		driver.findElement(IguanaLoc).click();
	}
}
