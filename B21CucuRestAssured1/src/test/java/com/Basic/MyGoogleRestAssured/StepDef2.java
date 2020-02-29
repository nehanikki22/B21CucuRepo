package com.Basic.MyGoogleRestAssured;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDef2 {

	Response res;
	@When("^I hit the application$")
	public void i_hit_the_application() throws Throwable {
    res=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
	    }
	@Then("^I validate the status code$")
	public void i_validate_the_status_code() throws Throwable {
		int actualStatCode=res.getStatusCode();
		System.out.println("actualStatCode is ="+actualStatCode);
		Assert.assertTrue(200==actualStatCode);
	}

	
}
