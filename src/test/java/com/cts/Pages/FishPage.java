package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FishPage 
{
	private WebDriver driver;
	private By AngelFishLoc = By.linkText("FI-SW-01");
	private By TigerSharkLoc = By.linkText("FI-SW-02");
	private By KoiLoc = By.linkText("FI-FW-01");

	public FishPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void ClickOnAngelFish(WebDriver driver) 
	{
		driver.findElement(AngelFishLoc).click();
	}
	public void ClickOnTigerShark(WebDriver driver) 
	{
		driver.findElement(TigerSharkLoc).click();
	}
	public void ClickOnKoi(WebDriver driver) 
	{
		driver.findElement(KoiLoc).click();
	}
}
