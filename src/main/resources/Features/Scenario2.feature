Feature: TestCase 



Background: Below are the common steps for each scenario 
	Given  User Launch browser with JpetStorePage 
	
Scenario: Login 
	When  User get login details from Excel "src/test/resources/Resources/JpetStore.xlsx" with SheetName "Login Details" and fill details 
	Then   User close browser 
	
Scenario: Check Invalid login 
	When User click on Sign In botton and enters User Id as "batch9" and password as "qwetyuiop" and click on Login 
	Then assert error message 
	
Scenario: Return to Main Menu 
	When   User click on Birds 
	And   click on Return to Main Menu 
	Then   Assert for Presence of Sign In and close browser 
	
Scenario: Update cart 
	When   User Update Cart 
	Then   User close browser
	
Scenario: Demo button is clicking or not
	When click on demo
	Then Assert for presence of Demo and close browser