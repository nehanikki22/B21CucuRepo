package com.Basic.getRequestBasicSD;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		   features={"src/test/resources/com/Basic/getRequestBasicFF/"},
		
		   glue ={"com/Basic/getRequestBasicSD/"},
		 //outside ruby
		monochrome=true
		
		)
public class RunnerBasicgetTest1 {

}
