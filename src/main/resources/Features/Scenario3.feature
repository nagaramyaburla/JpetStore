Feature: TestCases 

Background: Below are the common steps for each scenario 
	Given User Launch browser with JpetStorePage 
	
Scenario: Adding Cat to the cart and proceed to checkout 
	When User fill login details from Excel "src/test/resources/Resources/Book1.xlsx" with SheetName "Sheet1" 
	And  buy Cat 
	Then Assert for Suucessful CheckOut and close browser 
	
Scenario: Adding Dog to the cart and proceed to checkout 
	When User fill login details from Excel "src/test/resources/Resources/Book1.xlsx" with SheetName "Sheet1" 
	And buy Dog 
	Then Assert for Suucessful CheckOut and close browser 
	
Scenario: Adding Fish to the cart and proceed to checkout 
	When User click on Sign In botton and enters User Id as "1101111345a" and password as "qwertyuiop" and click on Login 
	And buy Fish 
	Then Assert for Suucessful CheckOut and close browser 
		
Scenario: Adding Bird to the cart and proceed to checkout 
	When User click on Sign In botton and enters User Id as "1101111345a" and password as "qwertyuiop" and click on Login 
	And buy Bird 
	Then Assert for Suucessful CheckOut and close browser 
		
Scenario: Adding Reptile to the cart and proceed to checkout 
	When User click on Sign In botton and enters User Id as "1101111345a" and password as "qwertyuiop" and click on Login 
	And buy Reptile 
	Then Assert for Suucessful CheckOut and close browser 