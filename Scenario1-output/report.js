$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Features/Scenario%201.feature");
formatter.feature({
  "name": "TestCases",
  "description": "\tTest case one",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Register and Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User click on Sign In botton and click on Register Now!",
  "keyword": "When "
});
formatter.step({
  "name": "User enters User Id as \"\u003cuserId\u003e\" and  New password as \"\u003cpassword\u003e\" and Repeat password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters First name as \"\u003cfirstName\u003e\" and Last name as \"\u003clastName\u003e\" and Email as \"\u003cemail\u003e\" and Phone as \"\u003cphone\u003e\" and AddressOne as \"\u003caddressOne\u003e\" and AddressTwo as \"\u003caddressTwo\u003e\" and City as \"\u003ccity\u003e\" and State as \"\u003cstate\u003e\" and Zip as \"\u003czip\u003e\" and Country as \"\u003ccountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner",
  "keyword": "And "
});
formatter.step({
  "name": "User click on Save Account Information",
  "keyword": "And "
});
formatter.step({
  "name": "User click on Sign In botton and enters User Id as \"\u003cuserId\u003e\" and password as \"\u003cpassword\u003e\" and click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "Assert for presence of Sign Out",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "password",
        "firstName",
        "lastName",
        "email",
        "phone",
        "addressOne",
        "addressTwo",
        "city",
        "state",
        "zip",
        "country"
      ]
    },
    {
      "cells": [
        "1234567bbbc",
        "qwertyuiop",
        "Ramu",
        "Ragam",
        "aasdfghjkl@gmail.com",
        "9876543210",
        "Chinna gari colony",
        "Kotha Peta",
        "Kaikalur",
        "AP",
        "521333",
        "India"
      ]
    },
    {
      "cells": [
        "1234567bdbc",
        "asdfghjkl",
        "Krishna",
        "katugga",
        "aasdfghjkl@gmail.com",
        "9876543211",
        "Chinna gari colony",
        "Kotha Peta",
        "Kaikalur",
        "AP",
        "521333",
        "India"
      ]
    },
    {
      "cells": [
        "1234567dabc",
        "zxcvbnmasd",
        "RajShekhar",
        "Borra",
        "aasdfghjkl@gmail.com",
        "9876543212",
        "Chinna gari colony",
        "Kotha Peta",
        "Kaikalur",
        "AP",
        "521333",
        "India"
      ]
    }
  ]
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
