package Cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "feature",
		glue = "Cucumber.steps",
		plugin = {"pretty", "html:target/cucumber-html-report.html"},
		monochrome = true
		)

public class CucumberTestRuner extends AbstractTestNGCucumberTests {

}
