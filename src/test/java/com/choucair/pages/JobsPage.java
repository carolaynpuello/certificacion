package com.choucair.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class JobsPage extends PageObject {
	
	@FindBy(xpath="//input[@name=\"search_keywords\"]") private WebElementFacade keyword;
	@FindBy(id="search_location") private WebElementFacade location;
	@FindBy(xpath="//input[@value=\"Buscar trabajos\"]") private WebElementFacade search;
	
	
	public void searchJob(String keyword, String location) {
			this.keyword.waitUntilClickable().sendKeys(keyword);
			this.location.waitUntilClickable().sendKeys(location);
			search.waitUntilClickable().click();
	}
	
		
}
