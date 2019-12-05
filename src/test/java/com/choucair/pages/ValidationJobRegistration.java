package com.choucair.pages;

import static org.junit.Assert.assertTrue;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ValidationJobRegistration extends PageObject {
	
	boolean validation;
	@FindBy(xpath="//a[@href=\"https://www.choucairtesting.com/job/analista-performance/\"]") private WebElementFacade jobOffer;
	@FindBy(xpath="//input[@class=\"application_button button\"]") private WebElementFacade registerOffer;
	@FindBy(xpath="//input[@class=\"wpcf7-form-control wpcf7-submit\"]") private WebElementFacade submit;
	@FindBy(xpath="//input[@class=\"wpcf7-form-control wpcf7-submit\"]") private WebElementFacade message;
	
	
	public void register () {	
		jobOffer.waitUntilVisible().click();
		registerOffer.waitUntilVisible().click();
			
	}
	
	
	public void validateErrorMessage(String errorMessage) {
		
		validation = message.getText().contains(errorMessage);
		
		if (validation) {
			assertTrue(true);
			System.out.println("true");
		} else { 
			assertTrue(false);
			System.out.println("false");
		}
		
	}
		
	
}
