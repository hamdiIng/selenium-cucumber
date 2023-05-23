package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.DrDnMsListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DrDnMsListStepDefinition {
	private DrDnMsListPage drDnMsListPage;
	
	
	public DrDnMsListStepDefinition() {
		drDnMsListPage = new DrDnMsListPage();
	}


	@Given("Je me connecte a l application demoqa")
	public void jeMeConnecteALApplicationDemoqa() {
		drDnMsListPage.seConncter();
		
	}
	@When("Je selectionne et deselectionne un ou pluseurs menu from list")
	public void jeSelectionneEtDeselectionneUnOuPluseursMenuFromList() {
		drDnMsListPage.selectOptions();
	}
	




}
