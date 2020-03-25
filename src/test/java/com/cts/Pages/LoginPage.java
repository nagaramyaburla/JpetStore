package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	private By userIdLoc = By.name("username");
	private By passwordLoc = By.name("password");
	private By loginLoc = By.name("signon");
	private By registerNowLoc = By.linkText("Register Now!");
	private By signinLoc=By.linkText("Sign In");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void ClickonSignIn() 
	{
		driver.findElement(signinLoc).click();
	}
	public void successfulLogin(String userId, String password)
	{
		driver.findElement(userIdLoc).sendKeys(userId);
		driver.findElement(passwordLoc).clear();
		driver.findElement(passwordLoc).sendKeys(password);
		driver.findElement(loginLoc).click();
	}
	public void clickOnRegisterNow()
	{
		driver.findElement(registerNowLoc).click();
	}
}
