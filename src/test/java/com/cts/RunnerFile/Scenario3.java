package com.cts.RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/main/resources/Features/Scenario3.feature",
			glue = "com/cts/StepDefinitions",
			monochrome = true,
			plugin = {"pretty","html:Scenario3-output"}
)
public class Scenario3 {

}
