package com.choucair.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features", 
		tags= {"@AutomationFeature"},
		glue = {"com.choucair.step_definitions"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true)
		

public class Runner {}
