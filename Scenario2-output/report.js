$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Features/Scenario2.feature");
formatter.feature({
  "name": "TestCase",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch browser with JpetStorePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_Launch_browser_with_JpetStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User get login details from Excel \"src/test/resources/Resources/JpetStore.xlsx\" with SheetName \"Login Details\" and fill details",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_get_login_details_from_Excel_with_SheetName_and_fill_details(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch browser with JpetStorePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_Launch_browser_with_JpetStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Invalid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on Sign In botton and enters User Id as \"batch9\" and password as \"qwetyuiop\" and click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_click_on_Sign_In_botton_and_enters_User_Id_as_and_password_as_and_click_on_Login(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "assert error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.assert_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch browser with JpetStorePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_Launch_browser_with_JpetStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Return to Main Menu",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on Birds",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_click_on_Birds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Return to Main Menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.click_on_Return_to_Main_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assert for Presence of Sign In and close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.assert_for_Presence_of_Sign_In_and_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch browser with JpetStorePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_Launch_browser_with_JpetStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Update Cart",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_Update_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch browser with JpetStorePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_Launch_browser_with_JpetStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Demo button is clicking or not",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on demo",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.click_on_demo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assert for presence of Demo and close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.assert_for_presence_of_Demo_and_close_browser()"
});
formatter.result({
  "status": "passed"
});
});