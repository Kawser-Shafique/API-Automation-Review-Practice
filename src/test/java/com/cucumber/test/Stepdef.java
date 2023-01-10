package com.cucumber.test;

import com.generic.CreateFunction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdef {

	@Given ("setup test data into json & use post method")
	public void setup() {
		CreateFunction.post();
	}
	
	
    @Then("validate test cases")
    public void postTestcasesValidation() {
    	CreateFunction.postTestCase();
    }
}
