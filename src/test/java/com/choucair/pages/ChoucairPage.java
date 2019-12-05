package com.choucair.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.choucairtesting.com/")
public class ChoucairPage extends PageObject {
	
	@FindBy(xpath="//*[@id=\"menu-item-550\"]/a") private WebElementFacade jobOption;
	
		
	 public void goToModule() {
		 
		 jobOption.waitUntilClickable().click();	        
	    
	    }

}