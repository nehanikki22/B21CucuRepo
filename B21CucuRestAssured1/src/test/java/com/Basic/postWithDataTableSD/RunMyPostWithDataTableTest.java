package com.Basic.postWithDataTableSD;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/Basic/postWithDataTableFF/"},
			glue={"com/Basic/postWithDataTableSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report223.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostWithDataTableTest {


}
