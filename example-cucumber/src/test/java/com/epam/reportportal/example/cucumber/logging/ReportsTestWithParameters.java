package com.epam.reportportal.example.cucumber.logging;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportsTestWithParameters {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReportsTestWithParameters.class);

	@Given("It is test with parameters")
	public void infoLevel() {
		LOGGER.info("It is test with parameters");
	}

	@When("^I have (.*) parameter$")
	public void iHaveStrParameter(String str) {
		LOGGER.info("String parameter {}", str);
	}

	@Then("^I emit number (\\d+) on level info$")
	public void infoLevel(int parameters) {
		LOGGER.info("Test with parameters: " + parameters);
	}

}
