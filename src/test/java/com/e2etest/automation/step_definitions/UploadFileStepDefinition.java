package com.e2etest.automation.step_definitions;

import org.junit.Assert;

import com.e2etest.automation.page_objects.UploadFilePage;
import com.e2etest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UploadFileStepDefinition {
	private UploadFilePage uploadFilePage;
	private ConfigFileReader configFileReader;

	public UploadFileStepDefinition() {
		uploadFilePage = new UploadFilePage();
		configFileReader = new ConfigFileReader();
	}

	@Given("je me connecte sur l application et je teste la fonctionnalite de charger un fichier")
	public void jeMeConnecteSurLApplicationEtJeTesteLaFonctionnaliteDeChargerUnFichier() {
		uploadFilePage.uploadFile();
	}

	@Then("je verifie si le fichier est charge {string}")
	public void jeVerifieSiLeFichierEstCharge(String text) {
		String resText = configFileReader.getProperties("file.text");
		Assert.assertTrue(resText.contains(text));
			}

}
