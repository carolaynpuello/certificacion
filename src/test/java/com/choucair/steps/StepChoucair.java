package com.choucair.steps;

import com.choucair.pages.ChoucairPage;
import com.choucair.pages.JobsPage;
import com.choucair.pages.ValidationJobRegistration;
import com.choucair.pages.ValidationSearchFilter;

import net.thucydides.core.annotations.Step;

public class StepChoucair {
	ChoucairPage choucair;
	JobsPage search;
	ValidationSearchFilter searchFilter;
	ValidationJobRegistration jobRegistration;
	
	@Step
    public void isTheHomePage() {
        choucair.open();
    }
	
	@Step
	public void goToModule() {
		choucair.goToModule();
	}
	
	@Step
	public void searchJob(String keyword, String location) {
		search.searchJob(keyword, location);
	}
	
	@Step
	public void searchResult(String message) {
		searchFilter.searchResult(message);;
	}
	
	
}
