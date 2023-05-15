package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.Setup;

public class LoginPage {

	/* Retrieve Element */

	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement titlePage;
	
	//constructeur
	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	/* Methods */
	public void fillUsername(String userName) {
		username.sendKeys(userName);
	}
	
	public void fillPassword(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void clickOnLogin() {
		btnLogin.click();
	}
	
	
	
}
