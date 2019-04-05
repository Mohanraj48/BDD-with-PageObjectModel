package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:/shareit/Eclipse/CucumPOM/src/main/java/com/qa/features/contacts.feature",
		glue = {"com/qa/stepDefinitions" }, 
		format = { "pretty", "html:test-output", "json:Json_output/Cucumber.json","junit:junit_xml/cucumber.xml" }, 
		monochrome = true, 
		strict = true
		// tags={"~@SmokeTest" , "@RegressionTest"}
)

public class TestRunner {

}
