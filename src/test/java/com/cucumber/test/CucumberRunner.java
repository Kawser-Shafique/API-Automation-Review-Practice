package com.cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin={"json:target/cucumber.json"},
		features ={"src/main/resources/API Post Test.feature"},
		glue={"com.cucumber.test"},
		
		//other options
		monochrome = true
//		dryRun = false,
//		strict = true,
//		tags = {"@Functional_Test","@SmokeTest"}// 1
		
		)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
