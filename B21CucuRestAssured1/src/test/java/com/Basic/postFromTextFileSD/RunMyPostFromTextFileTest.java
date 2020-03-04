package com.Basic.postFromTextFileSD;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/Basic/postFromTextFileFF/"},
			glue={"com/Basic/postFromTextFileSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report5434.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostFromTextFileTest {


}
