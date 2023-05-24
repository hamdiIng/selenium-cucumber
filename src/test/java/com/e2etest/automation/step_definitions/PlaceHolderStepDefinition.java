package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.PlaceHolderPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceHolderStepDefinition {
	
	private PlaceHolderPage placeHolderPage;
	
	public PlaceHolderStepDefinition() {
		placeHolderPage = new PlaceHolderPage();
	}

	@Given("Je me connecte a l application pour tester placeholder")
	public void jeMeConnecteALApplicationPourTesterPlaceholder() {
		placeHolderPage.seConnecter();
	}
	@When("Je cherche l element contenant le place holder")
	public void jeChercheLElementContenantLePlaceHolder() {

	}
	@Then("je recupere le text du placeHolder")
	public void jeRecupereLeTextDuPlaceHolder() {
		
		placeHolderPage.getPlaceHolder();

	}
	



}
