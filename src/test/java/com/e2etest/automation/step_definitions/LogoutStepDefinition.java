package com.e2etest.automation.step_definitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.page_objects.LogoutPage;
import com.e2etest.automation.utils.SeleniumUtils;
import com.e2etest.automation.utils.Setup;
import com.e2etest.automation.utils.Wait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	public LogoutPage logoutPage;
	private Wait wait; 

	public LogoutStepDefinition() {
		logoutPage = new LogoutPage();
		wait=new Wait(Setup.getDriver());
	}
	
	@When("Je clique sur le burguer menu button")
	public void jeCliqueSurLeBurguerMenuButton() throws InterruptedException {
		LogoutPage.btnburger.click();
		
	}

	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		logoutPage.clickOnLogout();
	}

	@Then("Je me redirige vers la page login {string}")
	public void jeMeRedirigeVersLaPageLogin(String titleLogo) {
		String title_logo_page = LogoutPage.textLoginLogo.getText();
		Assert.assertEquals(title_logo_page, titleLogo);
	}

}
