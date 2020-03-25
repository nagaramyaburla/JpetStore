package com.cts.StepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.cts.Base.LaunchWebDriver;
import com.cts.Pages.AddToCartPage;
import com.cts.Pages.BirdsPage;
import com.cts.Pages.CatsPage;
import com.cts.Pages.CheckOutPage;
import com.cts.Pages.ContinueAndConfirmPage;
import com.cts.Pages.DogsPage;
import com.cts.Pages.FishPage;
import com.cts.Pages.HomePage;
import com.cts.Pages.LoginPage;
import com.cts.Pages.NavigateBack;
import com.cts.Pages.NavigateFront;
import com.cts.Pages.RegisterPage;
import com.cts.Pages.ReptilesPage;
import com.cts.Pages.ThankYouPage;
import com.cts.Pages.WelcomePage;
import com.cts.utils.ExcelUtils;
import com.cts.utils.ReadExcel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public WebDriver driver;

	@Given("User Launch browser with JpetStorePage")
	public void user_Launch_browser_with_JpetStorePage() {
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		this.driver = launchWebDriver.setUp();

	}

	@When("User fill login details from Excel {string} with SheetName {string}")
	public void user_fill_login_details_from_Excel_with_SheetName(String fileDetails, String sheetName)
			throws IOException {
		ReadExcel readExcel = new ReadExcel();
		String str[][] = readExcel.getSheetIntoStringArray(fileDetails, sheetName);
		HomePage homePage = new HomePage(driver);
		homePage.clickOnSignIn();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.successfulLogin(str[0][0], str[0][1]);
	}

	@When("User click on Sign In botton and click on Register Now!")
	public void user_click_on_Sign_In_botton_and_click_on_Register_Now() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnSignIn();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnRegisterNow();
	}

	@When("User enters User Id as {string} and  New password as {string} and Repeat password as {string}")
	public void user_enters_User_Id_as_and_New_password_as_and_Repeat_password_as(String userId, String newPassword,
			String RepeatPassword) {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.fillUserInformation(userId, newPassword, RepeatPassword);
	}

	@When("User enters First name as {string} and Last name as {string} and Email as {string} and Phone as {string} and AddressOne as {string} and AddressTwo as {string} and City as {string} and State as {string} and Zip as {string} and Country as {string}")
	public void user_enters_First_name_as_and_Last_name_as_and_Email_as_and_Phone_as_and_Address_as_and_Address_as_and_City_as_and_State_as_and_Zip_as_and_Country_as(
			String firstName, String lastName, String email, String phone, String addressOne, String addressTwo,
			String City, String state, String zip, String country) {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.fillAccountInformation(firstName, lastName, email, phone, addressOne, addressTwo, City, state, zip,
				country);
	}

	@When("User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner")
	public void user_selects_Language_Preference_as_English_and_Favourite_Category_as_DOGS_and_Enable_MyList_and_Enable_MyBanner() {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.fillPersonalInformation();
	}

	@When("User click on Save Account Information")
	public void user_click_on_Save_Account_Information() {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.clickOnSaveAccountInformation();
	}

	@When("User click on Sign In botton and enters User Id as {string} and password as {string} and click on Login")
	public void user_click_on_Sign_In_botton_and_enters_User_Id_as_and_password_as_and_click_on_Login(String userId,
			String password) {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnSignIn();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.successfulLogin(userId, password);
	}

	@Then("Assert for presence of Sign Out")
	public void assert_for_presence_of_Sign_Out() {
		WelcomePage welcomePage = new WelcomePage(driver);
		String actualText = welcomePage.gettingTextOfSignOut();
		String expectedText = "Sign Out";
		Assert.assertEquals(expectedText, actualText);
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("User Search for {string} and click on search")
	public void user_Search_for_and_click_on_search(String search) {
		HomePage homePage = new HomePage(driver);
		homePage.Searching(search);
	}

	@Then("Assert for presence of GoldFish and close browser")
	public void assert_for_presence_of_GoldFish_and_close_browser() {
		String pageSource = driver.getPageSource();
		boolean check = pageSource.contains("Goldfish");
		Assert.assertTrue("Not Passed", check);
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("Adding to Cart")
	public void adding_to_Cart() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCats();
		CatsPage catsPage = new CatsPage(driver);
		catsPage.clickOnPersian();
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart();
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.clickOnProceedtoCheckout();
		ContinueAndConfirmPage continueAndConfirmPage = new ContinueAndConfirmPage(driver);
		continueAndConfirmPage.clickOnContinue();
		continueAndConfirmPage.clickOnConfirm();
	}

	@Then("Assert for Suucessful CheckOut and close browser")
	public void assert_for_Suucessful_CheckOut_and_close_browser() {
		ThankYouPage thankYouPage = new ThankYouPage(driver);
		String actualMsg = thankYouPage.gettingThankYouMsg();
		String expectedMsg = "Thank you, your order has been submitted.";
		Assert.assertEquals(expectedMsg, actualMsg);
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("User click on Birds")
	public void user_click_on_Birds() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnBirds();
	}

	@Then("Print table and close browser")
	public void print_table_and_close_browser() {
		BirdsPage birdsPage = new BirdsPage(driver);
		birdsPage.printBirdsTable();
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("click on Return to Main Menu")
	public void click_on_Return_to_Main_Menu() {
		BirdsPage birdsPage = new BirdsPage(driver);
		birdsPage.clickOnReturnToMainMenu();
	}

	@Then("Assert for Presence of Sign In and close browser")
	public void assert_for_Presence_of_Sign_In_and_close_browser() {
		String pageSource = driver.getPageSource();
		boolean check = pageSource.contains("Sign In");
		Assert.assertTrue("Not Passed", check);
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("User Remove Products from Cart")
	public void user_Remove_Products_from_Cart() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCats();
		CatsPage catsPage = new CatsPage(driver);
		catsPage.clickOnPersian();
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart();
		addToCartPage.clickOnRemove();
	}

	@Then("Assert for Msg and close Browser")
	public void assert_for_Msg_and_close_Browser() {
		String pageSource = driver.getPageSource();
		boolean check = pageSource.contains("Your cart is empty.");
		Assert.assertTrue("Not Passed", check);
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("User Update Cart")
	public void user_Update_Cart() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCats();
		CatsPage catsPage = new CatsPage(driver);
		catsPage.clickOnPersian();
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart();
		addToCartPage.clickOnUpdateCart();
	}

	@Then("User close browser")
	public void user_close_browser() {
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("buy Cat")
	public void buy_Cat() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCats();
		CatsPage catsPage = new CatsPage(driver);
		catsPage.clickOnPersian();
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart();
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.clickOnProceedtoCheckout();
		ContinueAndConfirmPage continueAndConfirmPage = new ContinueAndConfirmPage(driver);
		continueAndConfirmPage.clickOnContinue();
		continueAndConfirmPage.clickOnConfirm();
	}

	@When("buy Dog")
	public void buy_Dog() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnDogs();
		DogsPage dogsPage = new DogsPage(driver);
		dogsPage.clickOnBullDog();
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart();
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.clickOnProceedtoCheckout();
		ContinueAndConfirmPage continueAndConfirmPage = new ContinueAndConfirmPage(driver);
		continueAndConfirmPage.clickOnContinue();
		continueAndConfirmPage.clickOnConfirm();
	}

	@When("buy Fish")
	public void buy_Fish() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnFish();
		FishPage fishPage = new FishPage(driver);
		fishPage.ClickOnAngelFish(driver);
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart();
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.clickOnProceedtoCheckout();
		ContinueAndConfirmPage continueAndConfirmPage = new ContinueAndConfirmPage(driver);
		continueAndConfirmPage.clickOnContinue();
		continueAndConfirmPage.clickOnConfirm();
	}

	@When("buy Bird")
	public void buy_Bird() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnBirds();
		BirdsPage birdsPage = new BirdsPage(driver);
		birdsPage.clickOnSelectedBird2();
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart();
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.clickOnProceedtoCheckout();
		ContinueAndConfirmPage continueAndConfirmPage = new ContinueAndConfirmPage(driver);
		continueAndConfirmPage.clickOnContinue();
		continueAndConfirmPage.clickOnConfirm();

	}

	@When("buy Reptile")
	public void buy_Reptile() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnReptiles();
		ReptilesPage reptilesPage = new ReptilesPage(driver);
		reptilesPage.ClickOnRattle();
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart();
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.clickOnProceedtoCheckout();
		ContinueAndConfirmPage continueAndConfirmPage = new ContinueAndConfirmPage(driver);
		continueAndConfirmPage.clickOnContinue();
		continueAndConfirmPage.clickOnConfirm();
	}

	@When("navigate back")
	public void navigate_back() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnReptiles();
		ReptilesPage reptilesPage = new ReptilesPage(driver);
		reptilesPage.ClickOnRattle();
		NavigateBack navigateBack = new NavigateBack(driver);
		navigateBack.back();
	}

	@When("navigate front")
	public void navigate_front() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnReptiles();
		ReptilesPage reptilesPage = new ReptilesPage(driver);
		reptilesPage.ClickOnRattle();
		NavigateFront navigateFront = new NavigateFront(driver);
		navigateFront.front();
	}

	@When("selecting two products and checkout")
	public void selecting_two_products_and_checkout() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnReptiles();
		ReptilesPage reptilesPage = new ReptilesPage(driver);
		reptilesPage.ClickOnRattle();
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnAddToCart();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		homePage.clickOnBirds();
		BirdsPage birdsPage = new BirdsPage(driver);
		birdsPage.clickOnSelectedBird2();
		addToCartPage.clickOnAddToCart();
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.clickOnProceedtoCheckout();
		ContinueAndConfirmPage continueAndConfirmPage = new ContinueAndConfirmPage(driver);
		continueAndConfirmPage.clickOnContinue();
		continueAndConfirmPage.clickOnConfirm();
	}

	@When("check signout happens or not")
	public void check_signout_happens_or_not() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickOnSignOut();
	}

	@Then("assert error message")
	public void assert_error_message() {
		String pageSource = driver.getPageSource();
		boolean check = pageSource.contains("Invalid username or password.  Signon failed.");
		Assert.assertTrue("Not Passed", check);
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("User get login details from Excel {string} with SheetName {string} and fill details")
	public void user_get_login_details_from_Excel_with_SheetName_and_fill_details(String fileDetails, String sheetName)
			throws IOException {
		ExcelUtils excelUtils = new ExcelUtils();
		String str[][] = excelUtils.getSheetIntoStringArray(fileDetails, sheetName);
		WelcomePage welcomePage = new WelcomePage(driver);
		for (int i = 0; i <= 1; i++) {
			HomePage homePage = new HomePage(driver);
			homePage.clickOnSignIn();
			LoginPage loginPage = new LoginPage(driver);
			loginPage.successfulLogin(str[i][0], str[i][1]);
			String actualText = welcomePage.gettingTextOfSignOut();
			String expectedText = "Sign Out";
			Assert.assertEquals(expectedText, actualText);
			welcomePage.clickOnSignOut();
		}
	}

	@When("Click On search")
	public void click_On_search() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnSearch();
	}

	@Then("Assert for Error msg and close Browser")
	public void assert_for_Error_msg_and_close_Browser() {
		String pageSource = driver.getPageSource();
		boolean check = pageSource.contains("Please enter a keyword to search for, then press the search button.");
		Assert.assertTrue("Not Passed", check);
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("click on demo")
	public void click_on_demo() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnDemo();
	}

	@Then("Assert for presence of Demo and close browser")
	public void assert_for_presence_of_Demo_and_close_browser() {
		String pageSource = driver.getPageSource();
		boolean check = pageSource.contains("JPetStore Demo");
		Assert.assertTrue("Not Passed", check);
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

	@When("User click on cart")
	public void user_click_on_cart() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCart();
	}

	@Then("Assert for the presence of Shopping cart and close browser")
	public void assert_for_the_presence_of_Shopping_cart_and_close_browser() {
		String pageSource = driver.getPageSource();
		boolean check = pageSource.contains("Shopping Cart");
		Assert.assertTrue("Not Passed", check);
		LaunchWebDriver launchWebDriver = new LaunchWebDriver(driver);
		launchWebDriver.tearDown();
	}

}
