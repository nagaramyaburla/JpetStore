package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage
{
	private WebDriver driver;
	private By addToCartLoc = By.xpath("(//a[text()='Add to Cart'])[1]");
	private By removeLoc = By.linkText("Remove");
	private By updateCartLoc = By.name("updateCartQuantities");
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnAddToCart()
	{
		driver.findElement(addToCartLoc).click();
	}
	public void clickOnRemove()
	{
		driver.findElement(removeLoc).click();
	}
	public void clickOnUpdateCart()
	{
		driver.findElement(updateCartLoc).click();
	}
	
}
