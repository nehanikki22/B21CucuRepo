package com.Basic.getRequestBasicSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestBasicSd {

	Response res;

@Given("^race circuite application is running$")
public void race_circuite_application_is_running()  {
	System.out.println("application is running");

}

@When("^I hit get request to get response$")
public void i_hit_get_request_to_get_response() {
	
Response res=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
	
String actualData=res.getBody().asString();
System.out.println("actual data is ="+actualData);
	
    
}


@Then("^I validate circuite \"([^\"]*)\" value as \"([^\"]*)\" present$")
public void i_validate_circuite_value_as_present(String jpath,String valueTobeValidated)  {
    String attrValue=res.body().jsonPath().getString("jpath");
    Assert.assertTrue(attrValue.equals(valueTobeValidated));
}


@Then("^I want total Value$")
public void i_want_total_Value()  {
    String totalValue=res.body().jsonPath().getString("MRData.total");
    int totalIntV=Integer.parseInt(totalValue);
    for(int i=0;i<totalIntV;i++){
    	String idValue=res.body().jsonPath().getString("MRData.CircuitTable.Circuits["+i+"].circuitId");
    	if(idValue.equals("americas1")){
    		
    		Assert.assertTrue(idValue.equals("americas1"));
    		break;
    		}else{
    	if(i==totalIntV-1){
    		
    	Assert.assertTrue(false);
    	  }
    	}
    }
}


}