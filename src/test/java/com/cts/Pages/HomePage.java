package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	private WebDriver driver;
	private By signInLoc = By.linkText("Sign In");
	private By searchtextBoxLoc = By.name("keyword");
	private By searchLoc = By.name("searchProducts");
	private By BirdsLoc = By.xpath("//body//area[1]");
	private By fishLoc = By.xpath("//body//area[2]");
	private By DogsLoc = By.xpath("//body//area[3]");
	private By ReptilesLoc = By.xpath("//body//area[4]");
	private By catsLoc = By.xpath("//body//area[5]");
	private By demoLoc = By.xpath("//a[text()='?']");
	private By cartLoc = By.xpath("//img[@name='img_cart']");

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnSignIn()
	{
		driver.findElement(signInLoc).click();
	}
	public void Searching(String search)
	{
		driver.findElement(searchtextBoxLoc).sendKeys(search);
		driver.findElement(searchLoc).click();
	}
	public void clickOnSearch()
	{
		driver.findElement(searchLoc).click();
	}
	public void clickOnCats()
	{
		driver.findElement(catsLoc).click();
	}
	public void clickOnBirds() 
	{
		driver.findElement(BirdsLoc).click();
	}
	public void clickOnFish() 
	{
		driver.findElement(fishLoc).click();
	}
	public void clickOnDogs() 
	{
		driver.findElement(DogsLoc).click();
	}
	public void clickOnReptiles()
	{
		driver.findElement(ReptilesLoc).click();
	}
	public void clickOnDemo() 
	{
		driver.findElement(demoLoc).click();
	}
	public void clickOnCart() 
	{
		driver.findElement(cartLoc).click();
	}
}
