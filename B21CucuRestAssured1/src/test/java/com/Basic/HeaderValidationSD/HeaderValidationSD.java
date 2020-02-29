package com.Basic.HeaderValidationSD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeaderValidationSD {
 
	Response res;
	

	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() throws Throwable {

		System.out.println("Starting of the GET script");
	}

	@Then("^user check headers \"([^\"]*)\" have \"([^\"]*)\" value$")
	public void user_check_headers_have_value(String arg1, String arg2) throws Throwable {
		res = RestAssured.given().relaxedHTTPSValidation().get("https://ergast.com/api/f1/2017/circuits.json");
		String completeResponse = res.asString();
		System.out.println("================="+completeResponse);
		//get all headers
		Headers heds = res.getHeaders();
		String v1 = heds.getValue("Content-Type");
		System.out.println(heds);
		System.out.println(v1);
	}
	
}
				
			
