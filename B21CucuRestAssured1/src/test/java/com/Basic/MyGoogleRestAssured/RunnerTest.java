package com.Basic.MyGoogleRestAssured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		   features={"src/test/resources/com/Basic/MyGoogleRestAssured/MyFeatureFile.feature/"},
		
		   glue ={"com/Basic/MyGoogleRestAssured/"},
		 //outside ruby
		monochrome=true
		
		)
public class RunnerTest {
	
  
}
   