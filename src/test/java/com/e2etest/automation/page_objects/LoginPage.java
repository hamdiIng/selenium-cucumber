package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class LoginPage {
	
	private ConfigFileReader configFileReader;

	/* Retrieve Element */

	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//*[@id=\"login_button_container\"]/div/form/div[3]")
	public static WebElement errorMsg;
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement titlePage;
	
	
	//constructeur
	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}
	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
		username.clear();
		username.sendKeys(configFileReader.getProperties("home.login"));
		password.clear();
		password.sendKeys(configFileReader.getProperties("home.password"));
		btnLogin.click();
	}
	
	public void connectToApp() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
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
