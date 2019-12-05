package com.choucair.step_definitions;

import com.choucair.steps.StepChoucair;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepDefinitions {
	@Steps
	StepChoucair Carolayn;	
	
	
	
	@Given("^that Carolayn enters the website on option Empleos$")
	public void thatCarolaynEntersTheWebsiteOnOptionEmpleos() {
		Carolayn.isTheHomePage();
		Carolayn.goToModule();
	}


	@When("^she enters valid data into the job search filter (.*) (.*)$")
	public void sheEntersValidDataIntoTheJobSearchFilter(String keyword, String location) {
	    Carolayn.searchJob(keyword, location);
	}

	
	@Then("^she should see the search results (.*)$")
	public void sheShouldSeeTheSearchResultsBúsquedaCompletada(String message) {
	    Carolayn.searchResult(message);
	}

	@When("^she enters the data (.*) (.*)$")
	public void sheEntersTheData(String keyword, String location) {
	    Carolayn.searchJob(keyword, location);
	}


	@Then("^she should see an error message (.*)$")
	public void sheShouldSeeAnErrorMessageNoHayTrabajosCorrespondientes(String message) {
	    Carolayn.searchResult(message);
	}
		
			
}
