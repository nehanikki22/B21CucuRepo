package com.Basic.MyFirstSelenium;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/Basic/MyFirstSelenium/FirstSeleniumScriptFF2.feature",
				"src/test/resources/com/Basic/MyFirstSelenium/FirstSeleniumScriptFF.feature"},
		glue={"com/Basic/MyFirstSelenium/"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report51131.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)

public class RunnerFirstSeleniumScriptTest {

}
