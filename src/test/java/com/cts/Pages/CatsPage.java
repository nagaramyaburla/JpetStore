package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatsPage
{
	private WebDriver driver;
	private By persianLoc = By.linkText("FL-DLH-02");
	private By ManxLoc=By.linkText("FL-DSH-01");
	
	public CatsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnPersian()
	{
		driver.findElement(persianLoc).click();
	}
	public void clickOnManx() 
	{
		driver.findElement(ManxLoc).click();
	}
}
