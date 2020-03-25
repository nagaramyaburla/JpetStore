package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage 
{
	private WebDriver driver;
	private By userIdLoc = By.name("username");
	private By newPasswordLoc = By.name("password");
	private By repeatPasswordLoc = By.name("repeatedPassword");
	private By firstNameLoc = By.name("account.firstName");
	private By lastNameLoc = By.name("account.lastName");
	private By emailLoc = By.name("account.email");
	private By phoneLoc = By.name("account.phone");
	private By addressOneLoc = By.name("account.address1");
	private By addressTwoLoc = By.name("account.address2");
	private By cityLoc = By.name("account.city");
	private By stateLoc = By.name("account.state");
	private By zipLoc = By.name("account.zip");
	private By countryLoc = By.name("account.country");
	private By languagePreferenceLoc = By.name("account.languagePreference");
	private By favouriteCategoryIdLoc = By.name("account.favouriteCategoryId");
	private By listOptionLoc = By.name("account.listOption");
	private By bannerOptionLoc = By.name("account.bannerOption");
	private By saveAccountInformationLoc = By.name("newAccount");
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void fillUserInformation(String userId, String newPassword, String RepeatPassword)
	{
		driver.findElement(userIdLoc).sendKeys(userId);
		driver.findElement(newPasswordLoc).sendKeys(newPassword);
		driver.findElement(repeatPasswordLoc).sendKeys(RepeatPassword);
	}
	
	public void fillAccountInformation(String firstName, String lastName, String email, String phone, String addressOne, String addressTwo,
			String City, String state, String zip, String country)
	{
		driver.findElement(firstNameLoc).sendKeys(firstName);
		driver.findElement(lastNameLoc).sendKeys(lastName);
		driver.findElement(emailLoc).sendKeys(email);
		driver.findElement(phoneLoc).sendKeys(phone);
		driver.findElement(addressOneLoc).sendKeys(addressOne);
		driver.findElement(addressTwoLoc).sendKeys(addressTwo);
		driver.findElement(cityLoc).sendKeys(City);
		driver.findElement(stateLoc).sendKeys(state);
		driver.findElement(zipLoc).sendKeys(zip);
		driver.findElement(countryLoc).sendKeys(country);
	}
	
	public void fillPersonalInformation()
	{
		Select language = new Select(driver.findElement(languagePreferenceLoc));
		language.selectByVisibleText("english");
		Select category = new Select(driver.findElement(favouriteCategoryIdLoc));
		category.selectByVisibleText("DOGS");
		driver.findElement(listOptionLoc).click();
		driver.findElement(bannerOptionLoc).click();
	}
	
	public void clickOnSaveAccountInformation()
	{
		driver.findElement(saveAccountInformationLoc).click();
	}
}
