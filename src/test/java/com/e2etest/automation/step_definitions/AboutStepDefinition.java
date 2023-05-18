package com.e2etest.automation.step_definitions;

import org.junit.Assert;

import com.e2etest.automation.page_objects.AboutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutStepDefinition {
	private AboutPage aboutPage;

	public AboutStepDefinition() {
		aboutPage = new AboutPage();
	}

	@Given("je clique sur le bouton about")
	public void jeCliqueSurLeBoutonAbout() {

		aboutPage.navigateLabs();
	}

	@When("je me rederige vers l url https:\\/\\/saucelabs.com\\/ {string}")
	public void jeMeRederigeVersLUrlHttpsSaucelabsCom(String menu) {
		String menu_title = AboutPage.products.getText();
		Assert.assertEquals(menu_title, menu);
	}

	@Then("je cherche et clique sur cross-browser-testing {string}")
	public void jeChercheEtCliqueSurCrossBrowserTesting(String string) {
		aboutPage.clickBtnSauceDevops();
	}

}
