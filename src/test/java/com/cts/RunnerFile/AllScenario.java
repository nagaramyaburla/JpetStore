package com.cts.RunnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Features/",
		glue = "com/cts/StepDefinitions", 
		monochrome = true, 
		plugin = {"pretty", "html:AllScenario-output" }
		)
public class AllScenario {

}
