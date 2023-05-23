package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.DropDownListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DropDownListStepDefinition {
	 
	private DropDownListPage dropDownListPage;
	
	
	public DropDownListStepDefinition() {
		dropDownListPage = new DropDownListPage();
	}
	@Given("I want to connect to application")
	public void iWantToConnectToApplication() {
		dropDownListPage.navigateTo();
	}
	


	@Then("i search and test dropdownlist fonctionnality {string} {string} {string}")
	public void iSearchAndTestDropdownlistFonctionnality(String index, String value,String text ) {
		dropDownListPage.selectFromList(index, value, text);
	}










}
