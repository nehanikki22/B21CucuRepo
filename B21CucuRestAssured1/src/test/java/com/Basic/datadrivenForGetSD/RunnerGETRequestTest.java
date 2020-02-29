package com.Basic.datadrivenForGetSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/Basic/datadrivenForGetFF/"},
		glue={"com/Basic/datadrivenForGetSD/"},
		monochrome=true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report12311.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)

public class RunnerGETRequestTest {

}

