package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BirdsPage 
{
	private WebDriver driver;
	private By returnToMainMenuLoc = By.linkText("Return to Main Menu");
	private By selectBirdLoc=By.linkText("AV-CB-01");
	private By selectBirdLoc2=By.linkText("AV-SB-02");
	
	public BirdsPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void clickOnReturnToMainMenu()
	{
		driver.findElement(returnToMainMenuLoc).click();
	}
	public void clickOnSelectedBird() 
	{
		driver.findElement(selectBirdLoc).click();
	}
	public void clickOnSelectedBird2()
	{
		driver.findElement(selectBirdLoc2).click();
	}
	public void printBirdsTable() 
	{
		for (int j = 1; j <= 2; j++)
			System.out.print(driver.findElement(By.xpath("//table/tbody/tr[1]/th[" + j + "]")).getText() + "\t");
		System.out.println("");
		for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(
						driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]")).getText() + "\t");
			}
			System.out.println("");
		}
	}
}
