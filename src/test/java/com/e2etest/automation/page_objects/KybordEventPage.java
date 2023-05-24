package com.e2etest.automation.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class KybordEventPage {

	private ConfigFileReader configFileReader;

	@FindBy(how = How.NAME, using = "username")
	public static WebElement userName;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.NAME, using = "login")
	public static WebElement btnLogin;

	public KybordEventPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();

	}

	public void seConnecter() {
		Setup.getDriver().get(configFileReader.getProperties("kb.url"));
	}

	public void selectParam() {
		userName.sendKeys("kodingwindow");
		userName.sendKeys(Keys.CONTROL, "a");
		userName.sendKeys(Keys.CONTROL, "c");
	}

	public void insertPassword() {
		password.sendKeys(Keys.CONTROL, "v");
	}
	public void clickLoginBtn() {
		btnLogin.click();
		
	}

}
