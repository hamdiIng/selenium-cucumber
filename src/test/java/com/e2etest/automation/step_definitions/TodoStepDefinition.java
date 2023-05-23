package com.e2etest.automation.step_definitions;

import com.e2etest.automation.page_objects.TodoPage;
import com.e2etest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class TodoStepDefinition {
	
	public ConfigFileReader configFileReader;
	private TodoPage todoPage;
	

	public TodoStepDefinition() {
		configFileReader = new ConfigFileReader();
		todoPage = new TodoPage();
		
	}
	@Given("je me connecte a l application")
	public void jeMeConnecteALApplication() {
		todoPage.connecterApp();
		
	
	}
	@Given("J ajoute texte dans l input")
	public void jAjouteTexteDansLInput(String todo) {
		todoPage.introduireUnText(todo);
	}
	@Given("Je clique sur le bouton entree du clavier")
	public void jeCliqueSurLeBoutonEntreeDuClavier() {
	}
	@Then("Je verifie le texte ajoutee")
	public void jeVerifieLeTexteAjoutee() {
	}
	
	@Given("je veux supprimer le  texte ajoiutee")
	public void jeVeuxSupprimerLeTexteAjoiutee() {
	}
	@Then("Je verifie si le texte est supprime")
	public void jeVerifieSiLeTexteEstSupprime() {
	}







}
