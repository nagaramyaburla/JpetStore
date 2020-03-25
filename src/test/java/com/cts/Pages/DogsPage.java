package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DogsPage
{
	private WebDriver driver;
	private By BulldogLoc=By.linkText("K9-BD-01");
	private By poodleLoc=By.linkText("K9-PO-02");
	private By  Dalmation=By.linkText("K9-DL-01");
	private By  GoldenRetriever=By.linkText("K9-RT-01");
	private By  Labrodar=By.linkText("K9-RT-02");
	
	public DogsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnBullDog()
	{
		driver.findElement(BulldogLoc).click();
	}
	public void clickOnPoodle()
	{
		driver.findElement(poodleLoc).click();
	}
	public void clickOnDalmation()
	{
		driver.findElement(Dalmation).click();
	}
	public void clickOnGoldenRet()
	{
		driver.findElement(GoldenRetriever).click();
	}
	public void clickOnLabrodar()
	{
		driver.findElement(Labrodar).click();
	}



}
