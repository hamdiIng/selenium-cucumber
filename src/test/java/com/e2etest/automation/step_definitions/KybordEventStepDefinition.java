package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.KybordEventPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KybordEventStepDefinition {
	
	private KybordEventPage kybordEventPage;
	
	public KybordEventStepDefinition(){
		kybordEventPage = new KybordEventPage();
		
	}

	@Given("Je visite la page de connexion a l application")
	public void jeVisiteLaPageDeConnexionALApplication() {
		
		kybordEventPage.seConnecter();
	}
	@When("Je selectionne le text de parametre avec les raccourcis clavier")
	public void jeSelectionneLeTextDeParametreAvecLesRaccourcisClavier() {
		kybordEventPage.selectParam();

	}
	@When("J utilise le clavier pour faire copier")
	public void jUtiliseLeClavierPourFaireCopier() {

	}
	@When("J utilise le clavier pour faire coller dans les deux champs login et password")
	public void jUtiliseLeClavierPourFaireCollerDansLesDeuxChampsLoginEtPassword() {
		kybordEventPage.insertPassword();

	}
	@Then("Je clique sur le bouton de connexion")
	public void jeCliqueSurLeBoutonDeConnexion() {
		kybordEventPage.clickLoginBtn();

	}




}
