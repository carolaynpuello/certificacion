package com.choucair.pages;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

public class ValidationSearchFilter extends PageObject {
	
	boolean validation;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/form/div[2]/span") private WebElementFacade message;
	
	
	public void searchResult (String searchMessage) {
		
		validation = message.getText().contains(searchMessage);
		
		if (validation) {
			assertTrue(true);
			System.out.println("true");
		} else { 
			assertTrue(false);
			System.out.println("false");
		}
	}
}
