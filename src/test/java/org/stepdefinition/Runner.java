package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features",
		monochrome=true,
		glue="org.stepdefinition",
		dryRun=false
		)
public class Runner {

}
 