package com.Basic.HeaderValidationSD;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		
				features= {"src/test/resources/com/Basic/HeaderValidationFF/"},
				glue={"com/Basic/HeaderValidationSD/"}
	
		
		)
		
//pUGINS ARE USETO GENERATE REPORT 
public class HeaderValidationRunnerTest {

}
